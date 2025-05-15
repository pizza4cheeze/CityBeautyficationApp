package vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem;

import java.util.Date;

public class ExifTO {
    private double gpsLatitude;
    private double gpsLongitude;
    private Date dateTimeOriginal;
    private Date fileModifiedDate;

    public ExifTO(double gpsLatitude, double gpsLongitude, Date dateTimeOriginal, Date fileModifiedDate) {
        this.gpsLatitude = gpsLatitude;
        this.gpsLongitude = gpsLongitude;
        this.dateTimeOriginal = dateTimeOriginal;
        this.fileModifiedDate = fileModifiedDate;
    }

    public ExifTO() {
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

    public Date getDateTimeOriginal() {
        return dateTimeOriginal;
    }

    public void setDateTimeOriginal(Date dateTimeOriginal) {
        this.dateTimeOriginal = dateTimeOriginal;
    }

    public Date getFileModifiedDate() {
        return fileModifiedDate;
    }

    public void setFileModifiedDate(Date fileModifiedDate) {
        this.fileModifiedDate = fileModifiedDate;
    }
}
