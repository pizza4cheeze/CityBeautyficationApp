package vsu.csf.grushevskaya.CityBeautyficationApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer problemId;
    private Integer authorId;
    private String text;
    private LocalDateTime publicationTime;

    public Comment(Integer id, Integer problemId, Integer authorId, String text, LocalDateTime publicationTime) {
        this.id = id;
        this.problemId = problemId;
        this.authorId = authorId;
        this.text = text;
        this.publicationTime = publicationTime;
    }

    public Comment() {
    }

    public Integer getId() {
        return id;
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
