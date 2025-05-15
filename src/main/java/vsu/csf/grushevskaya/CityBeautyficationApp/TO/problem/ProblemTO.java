package vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem;

import vsu.csf.grushevskaya.CityBeautyficationApp.models.Problem;

import java.time.LocalDateTime;

public class ProblemTO {
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

    public ProblemTO(Integer id, String title, String description, Integer categoryId, Integer statusId,
                     Integer lastUpvotedUserId, int upvoteAmount, Integer authorId, Double xCoordinate,
                     Double yCoordinate, LocalDateTime creationDate) {
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
    }

    public ProblemTO(Problem problem) {
        this.id = problem.getId();
        this.title = problem.getTitle();
        this.description = problem.getDescription();
        this.categoryId = problem.getCategoryId();
        this.statusId = problem.getStatusId();
        this.lastUpvotedUserId = problem.getLastUpvotedUserId();
        this.upvoteAmount = problem.getUpvoteAmount();
        this.authorId = problem.getAuthorId();
        this.xCoordinate = problem.getxCoordinate();
        this.yCoordinate = problem.getyCoordinate();
        this.creationDate = problem.getCreationDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getLastUpvotedUserId() {
        return lastUpvotedUserId;
    }

    public void setLastUpvotedUserId(Integer lastUpvotedUserId) {
        this.lastUpvotedUserId = lastUpvotedUserId;
    }

    public int getUpvoteAmount() {
        return upvoteAmount;
    }

    public void setUpvoteAmount(int upvoteAmount) {
        this.upvoteAmount = upvoteAmount;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(Double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public Double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(Double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
