package vsu.csf.grushevskaya.CityBeautyficationApp.services;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import com.drew.metadata.exif.GpsDirectory;
import org.springframework.stereotype.Service;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem.ExifAndCategoryTO;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Service
public class ExifService {
    public ExifAndCategoryTO extractData(String pathToPhoto) {
        File imageFile = new File(pathToPhoto);
        ExifAndCategoryTO exif = new ExifAndCategoryTO();

        ZoneId mskZone = ZoneId.of("Europe/Moscow");

        try {
            Metadata metadata = ImageMetadataReader.readMetadata(imageFile);

            GpsDirectory gpsDirectory = metadata.getFirstDirectoryOfType(GpsDirectory.class);
            if (gpsDirectory != null) {
                double latitude = gpsDirectory.getGeoLocation().getLatitude();
                double longitude = gpsDirectory.getGeoLocation().getLongitude();
                exif.setGpsLatitude(latitude);
                exif.setGpsLongitude(longitude);
            } else {
                System.out.println("GPS данные не найдены.");
            }

            ExifSubIFDDirectory exifDirectory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
            if (exifDirectory != null) {
                Date date = exifDirectory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
                if (date == null) {
                    date = exifDirectory.getDate(ExifSubIFDDirectory.TAG_DATETIME);
                }

                if (date != null) {
                    LocalDateTime dateTime = date.toInstant()
                            .atZone(mskZone)
                            .toLocalDateTime();
                    exif.setDateTimeOriginal(dateTime);
                }
            } else {
                System.out.println("EXIF данные не найдены.");
            }

            Date lastModified = new Date(imageFile.lastModified());
            LocalDateTime fileModifiedDateTime = lastModified.toInstant()
                    .atZone(mskZone)
                    .toLocalDateTime();
            exif.setFileModifiedDate(fileModifiedDateTime);

            System.out.println("File Modified Date (MSK): " + fileModifiedDateTime);

        } catch (Exception e) {
            System.err.println("Ошибка при чтении метаданных: " + e.getMessage());
        }

        return exif;
    }
}
