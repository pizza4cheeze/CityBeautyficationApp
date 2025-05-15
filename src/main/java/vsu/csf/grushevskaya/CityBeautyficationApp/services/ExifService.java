package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.drew.metadata.exif.GpsDirectory;
import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ExifTO;

import java.io.File;
import java.util.Date;

@Service
public class ExifService {
    public ExifTO extractExifData(String pathToFile) {
        File imageFile = new File(pathToFile);

        ExifTO exif = new ExifTO();

        try {
            // Чтение метаданных
            Metadata metadata = ImageMetadataReader.readMetadata(imageFile);

            // 1. Извлечение GPS-координат
            GpsDirectory gpsDirectory = metadata.getFirstDirectoryOfType(GpsDirectory.class);
            if (gpsDirectory != null) {
                double latitude = gpsDirectory.getGeoLocation().getLatitude();
                double longitude = gpsDirectory.getGeoLocation().getLongitude();
                exif.setGpsLatitude(latitude);
                exif.setGpsLongitude(longitude);
            } else {
                System.out.println("GPS данные не найдены.");
            }

            // 2. Извлечение даты съемки (DateTimeOriginal) или даты изменения файла
            ExifSubIFDDirectory exifDirectory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
            if (exifDirectory != null) {
                Date date = exifDirectory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
                if (date == null) {
                    date = exifDirectory.getDate(ExifSubIFDDirectory.TAG_DATETIME); // Если оригинальная дата отсутствует
                }
                exif.setDateTimeOriginal(date);
            } else {
                System.out.println("EXIF данные не найдены.");
            }

            // 3. Дата изменения файла (системная)
            System.out.println("File Modified Date: " + new Date(imageFile.lastModified()));
            exif.setFileModifiedDate(new Date(imageFile.lastModified()));

        } catch (Exception e) {
            System.err.println("Ошибка при чтении метаданных: " + e.getMessage());
        }

        return exif;
    }
}
