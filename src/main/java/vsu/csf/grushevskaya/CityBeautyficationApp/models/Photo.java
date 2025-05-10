package vsu.csf.grushevskaya.CityBeautyficationApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pathToFile;
    private Integer problemId;

    public Photo(Integer id, String pathToFile, Integer problemId) {
        this.id = id;
        this.pathToFile = pathToFile;
        this.problemId = problemId;
    }

    public Photo() {
    }

    public Integer getId() {
        return id;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }
}
