package vsu.csf.grushevskaya.CityBeautyficationApp.TO;

import vsu.csf.grushevskaya.CityBeautyficationApp.models.Status;

public class StatusTO {
    Integer id;
    String name;

    public StatusTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public StatusTO() {
    }

    public StatusTO(Status status) {
        this.id = status.getId();
        this.name = status.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
