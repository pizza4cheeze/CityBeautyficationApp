package vsu.csf.grushevskaya.CityBeautyficationApp.TO;

import java.time.LocalDateTime;

public class PhotoTO {
    private String path;
    private LocalDateTime dateTime;
    private String location;

    public PhotoTO(String path, LocalDateTime dateTime, String location) {
        this.path = path;
        this.dateTime = dateTime;
        this.location = location;
    }

    public PhotoTO() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
