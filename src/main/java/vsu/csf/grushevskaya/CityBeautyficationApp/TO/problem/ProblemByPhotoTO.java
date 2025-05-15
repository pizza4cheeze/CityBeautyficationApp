package vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem;

public class ProblemByPhotoTO {
    private String pathToPhoto;
    private String title;
    private String description;
    private Integer authorId;

    public ProblemByPhotoTO(String pathToPhoto, String title, String description, Integer authorId) {
        this.pathToPhoto = pathToPhoto;
        this.title = title;
        this.description = description;
        this.authorId = authorId;
    }

    public ProblemByPhotoTO() {
    }

    public String getPathToPhoto() {
        return pathToPhoto;
    }

    public void setPathToPhoto(String pathToPhoto) {
        this.pathToPhoto = pathToPhoto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
