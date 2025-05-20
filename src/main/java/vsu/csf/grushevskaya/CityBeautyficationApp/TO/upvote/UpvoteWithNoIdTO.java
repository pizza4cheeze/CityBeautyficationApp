package vsu.csf.grushevskaya.CityBeautyficationApp.TO.upvote;

import java.time.LocalDateTime;

public class UpvoteWithNoIdTO {
    private Integer problemId;
    private Integer userId;
    private LocalDateTime datetimeUpvote;

    public UpvoteWithNoIdTO(Integer problemId, Integer userId, LocalDateTime datetimeUpvote) {
        this.problemId = problemId;
        this.userId = userId;
        this.datetimeUpvote = datetimeUpvote;
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

    public void setDatetimeUpvote(LocalDateTime datetimeUpvote) {
        this.datetimeUpvote = datetimeUpvote;
    }
}
