package vsu.csf.grushevskaya.CityBeautyficationApp.TO;

import vsu.csf.grushevskaya.CityBeautyficationApp.models.Category;

public class CategoryTO {
    Integer id;
    String name;

    public CategoryTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryTO() {
    }

    public CategoryTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
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
