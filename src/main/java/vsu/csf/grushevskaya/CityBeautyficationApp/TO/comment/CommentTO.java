package vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment;

import java.time.LocalDateTime;

public class CommentTO {
    private Integer id;
    private Integer problemId;
    private Integer authorId;
    private String authorUserName;
    private String authorProfilePhoto;
    private String text;
    private LocalDateTime publicationTime;

    public CommentTO(Integer id, Integer problemId, Integer authorId, String authorUserName, String authorProfilePhoto, String text, LocalDateTime publicationTime) {
        this.id = id;
        this.problemId = problemId;
        this.authorId = authorId;
        this.authorUserName = authorUserName;
        this.authorProfilePhoto = authorProfilePhoto;
        this.text = text;
        this.publicationTime = publicationTime;
    }

    public LocalDateTime getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(LocalDateTime publicationTime) {
        this.publicationTime = publicationTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthorProfilePhoto() {
        return authorProfilePhoto;
    }

    public void setAuthorProfilePhoto(String authorProfilePhoto) {
        this.authorProfilePhoto = authorProfilePhoto;
    }

    public String getAuthorUserName() {
        return authorUserName;
    }

    public void setAuthorUserName(String authorUserName) {
        this.authorUserName = authorUserName;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
