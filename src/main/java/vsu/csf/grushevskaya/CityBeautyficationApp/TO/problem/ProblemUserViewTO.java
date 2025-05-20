package vsu.csf.grushevskaya.CityBeautyficationApp.TO.problem;

import java.time.LocalDateTime;

public class ProblemUserViewTO {
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

    public ProblemUserViewTO(Integer id, String title, String description, String category, String status,
                             Integer lastUpvotedUserId, int upvoteAmount, Integer authorId, String authorUserName,
                             String authorProfilePhoto, Double xCoordinate, Double yCoordinate, LocalDateTime creationDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.status = status;
        this.lastUpvotedUserId = lastUpvotedUserId;
        this.upvoteAmount = upvoteAmount;
        this.authorId = authorId;
        this.authorUserName = authorUserName;
        this.authorProfilePhoto = authorProfilePhoto;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.creationDate = creationDate;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
