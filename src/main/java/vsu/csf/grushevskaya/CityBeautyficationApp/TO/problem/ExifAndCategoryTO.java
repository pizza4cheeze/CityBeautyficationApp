package vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem;

import java.time.LocalDateTime;

public class ExifAndCategoryTO {
    private double gpsLatitude;
    private double gpsLongitude;
    private LocalDateTime dateTimeOriginal;
    private LocalDateTime fileModifiedDate;
    private Integer categoryId;

    public ExifAndCategoryTO(double gpsLatitude, double gpsLongitude, LocalDateTime dateTimeOriginal, LocalDateTime fileModifiedDate, Integer categoryId) {
        this.gpsLatitude = gpsLatitude;
        this.gpsLongitude = gpsLongitude;
        this.dateTimeOriginal = dateTimeOriginal;
        this.fileModifiedDate = fileModifiedDate;
        this.categoryId = categoryId;
    }

    public ExifAndCategoryTO() {
    }

    public double getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public double getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public LocalDateTime getDateTimeOriginal() {
        return dateTimeOriginal;
    }

    public void setDateTimeOriginal(LocalDateTime dateTimeOriginal) {
        this.dateTimeOriginal = dateTimeOriginal;
    }

    public LocalDateTime getFileModifiedDate() {
        return fileModifiedDate;
    }

    public void setFileModifiedDate(LocalDateTime fileModifiedDate) {
        this.fileModifiedDate = fileModifiedDate;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
