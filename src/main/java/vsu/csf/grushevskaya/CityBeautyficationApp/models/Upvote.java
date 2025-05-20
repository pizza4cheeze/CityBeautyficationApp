package vsu.csf.grushevskaya.CityBeautyficationApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.upvote.UpvoteTO;
import vsu.csf.grushevskaya.CityBeautyficationApp.TO.upvote.UpvoteWithNoIdTO;

import java.time.LocalDateTime;

@Entity(name = "upvotes")
public class Upvote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer problemId;
    private Integer userId;
    private LocalDateTime datetimeUpvote;

    public Upvote(Integer id, Integer problemId, Integer userId, LocalDateTime datetimeUpvote) {
        this.id = id;
        this.problemId = problemId;
        this.userId = userId;
        this.datetimeUpvote = datetimeUpvote;
    }

    public Upvote(UpvoteWithNoIdTO upvoteWithNoIdTO) {
        this.id = null;
        this.problemId = upvoteWithNoIdTO.getProblemId();
        this.userId = upvoteWithNoIdTO.getUserId();
        this.datetimeUpvote = upvoteWithNoIdTO.getDatetimeUpvote();
    }

    public Upvote(UpvoteTO upvoteTO) {
        this.id = upvoteTO.getId();
        this.problemId = upvoteTO.getProblemId();
        this.userId = upvoteTO.getUserId();
        this.datetimeUpvote = upvoteTO.getDatetimeUpvote();
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

    public LocalDateTime getDatetimeUpvote() {
        return datetimeUpvote;
    }

    public void setDatetimeUpvote(LocalDateTime dateTimeUpvote) {
        this.datetimeUpvote = dateTimeUpvote;
    }
}
