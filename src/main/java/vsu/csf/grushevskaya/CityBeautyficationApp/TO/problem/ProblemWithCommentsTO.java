package vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem;

import vsu.csf.grushevskaya.CityBeautyficationApp.models.Comment;

import java.time.LocalDateTime;
import java.util.List;

public class ProblemWithCommentsTO {
    private Integer id;
    private String title;
    private String description;
    private Integer categoryId;
    private Integer statusId;
    private Integer lastUpvotedUserId;
    private int upvoteAmount;
    private Integer authorId;
    private Double xCoordinate;
    private Double yCoordinate;
    private LocalDateTime creationDate;
    private List<Comment> comments;

    public ProblemWithCommentsTO(Integer id, String title, String description, Integer categoryId, Integer statusId,
                                 Integer lastUpvotedUserId, int upvoteAmount, Integer authorId, Double xCoordinate,
                                 Double yCoordinate, LocalDateTime creationDate, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.categoryId = categoryId;
        this.statusId = statusId;
        this.lastUpvotedUserId = lastUpvotedUserId;
        this.upvoteAmount = upvoteAmount;
        this.authorId = authorId;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.creationDate = creationDate;
        this.comments = comments;
    }

    public ProblemWithCommentsTO() {
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
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

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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
