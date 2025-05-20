package vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem;

import vsu.csf.grushevskaya.CityBeautyficationApp.TO.comment.CommentTO;

import java.time.LocalDateTime;
import java.util.List;

public class ProblemWithCommentsTO {
    private Integer id;
    private String title;
    private String description;
    private String category;
    private String status;
    private Integer lastUpvotedUserId;
    private int upvoteAmount;
    private Integer authorId;
    private String authorUserName;
    private String authorProfilePhoto;
    private Double xCoordinate;
    private Double yCoordinate;
    private LocalDateTime creationDate;
    private List<CommentTO> commentsTO;

    public ProblemWithCommentsTO(Integer id, String title, String description, String category, String status,
                                 Integer lastUpvotedUserId, int upvoteAmount, Integer authorId, Double xCoordinate,
                                 Double yCoordinate, LocalDateTime creationDate, List<CommentTO> commentsTO) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.status = status;
        this.lastUpvotedUserId = lastUpvotedUserId;
        this.upvoteAmount = upvoteAmount;
        this.authorId = authorId;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.creationDate = creationDate;
        this.commentsTO = commentsTO;
    }

    public ProblemWithCommentsTO(ProblemUserViewTO problemUserViewTO, List<CommentTO> commentsTO) {
        this.id = problemUserViewTO.getId();
        this.title = problemUserViewTO.getDescription();
        this.description = problemUserViewTO.getDescription();
        this.category = problemUserViewTO.getCategory();
        this.status = problemUserViewTO.getStatus();
        this.lastUpvotedUserId = problemUserViewTO.getLastUpvotedUserId();
        this.upvoteAmount = problemUserViewTO.getUpvoteAmount();
        this.authorId = problemUserViewTO.getAuthorId();
        this.xCoordinate = problemUserViewTO.getxCoordinate();
        this.yCoordinate = problemUserViewTO.getyCoordinate();
        this.creationDate = problemUserViewTO.getCreationDate();
        this.commentsTO = commentsTO;
    }

    public ProblemWithCommentsTO() {
    }

    public List<CommentTO> getCommentsTO() {
        return commentsTO;
    }

    public void setCommentsTO(List<CommentTO> commentsTO) {
        this.commentsTO = commentsTO;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public int getUpvoteAmount() {
        return upvoteAmount;
    }

    public void setUpvoteAmount(int upvoteAmount) {
        this.upvoteAmount = upvoteAmount;
    }

    public Integer getLastUpvotedUserId() {
        return lastUpvotedUserId;
    }

    public void setLastUpvotedUserId(Integer lastUpvotedUserId) {
        this.lastUpvotedUserId = lastUpvotedUserId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
