package vsu.csf.grushevskaya.CityBeautyficationApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity(name = "upvotes")
public class Upvote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer problemId;
    private Integer userId;
    private LocalDateTime dateTimeUpvote;

    public Upvote(Integer id, Integer problemId, Integer userId, LocalDateTime dateTimeUpvote) {
        this.id = id;
        this.problemId = problemId;
        this.userId = userId;
        this.dateTimeUpvote = dateTimeUpvote;
    }

    public Upvote() {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getDateTimeUpvote() {
        return dateTimeUpvote;
    }

    public void setDateTimeUpvote(LocalDateTime dateTimeUpvote) {
        this.dateTimeUpvote = dateTimeUpvote;
    }
}
