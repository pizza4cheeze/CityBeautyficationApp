package vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment;

import java.time.LocalDateTime;

public class CommentWithNoIdTO {
    private Integer problemId;
    private Integer authorId;
    private String authorUserName;
    private String authorProfilePhoto;
    private String text;
    private LocalDateTime publicationTime;

    public CommentWithNoIdTO(Integer problemId, Integer authorId, String authorUserName, String authorProfilePhoto, String text, LocalDateTime publicationTime) {
        this.problemId = problemId;
        this.authorId = authorId;
        this.authorUserName = authorUserName;
        this.authorProfilePhoto = authorProfilePhoto;
        this.text = text;
        this.publicationTime = publicationTime;
    }

    public CommentWithNoIdTO() {
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorUserName() {
        return authorUserName;
    }

    public void setAuthorUserName(String authorUserName) {
        this.authorUserName = authorUserName;
    }

    public String getAuthorProfilePhoto() {
        return authorProfilePhoto;
    }

    public void setAuthorProfilePhoto(String authorProfilePhoto) {
        this.authorProfilePhoto = authorProfilePhoto;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(LocalDateTime publicationTime) {
        this.publicationTime = publicationTime;
    }
}
