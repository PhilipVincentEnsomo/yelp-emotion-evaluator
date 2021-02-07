package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Review {
    @JsonProperty("comment")
    public Comment getComment() {
        return this.comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    Comment comment;

    @JsonProperty("rating")
    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    int rating;

    @JsonProperty("photosUrl")
    public String getPhotosUrl() {
        return this.photosUrl;
    }

    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    String photosUrl;

    @JsonProperty("feedback")
    public Feedback getFeedback() {
        return this.feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    Feedback feedback;

    @JsonProperty("business")
    public Business getBusiness() {
        return this.business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    Business business;

    @JsonProperty("localizedDateVisited")
    public Object getLocalizedDateVisited() {
        return this.localizedDateVisited;
    }

    public void setLocalizedDateVisited(Object localizedDateVisited) {
        this.localizedDateVisited = localizedDateVisited;
    }

    Object localizedDateVisited;

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    List<Tag> tags;

    @JsonProperty("userId")
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    String userId;

    @JsonProperty("previousReviews")
    public Object getPreviousReviews() {
        return this.previousReviews;
    }

    public void setPreviousReviews(Object previousReviews) {
        this.previousReviews = previousReviews;
    }

    Object previousReviews;

    @JsonProperty("businessOwnerReplies")
    public Object getBusinessOwnerReplies() {
        return this.businessOwnerReplies;
    }

    public void setBusinessOwnerReplies(Object businessOwnerReplies) {
        this.businessOwnerReplies = businessOwnerReplies;
    }

    Object businessOwnerReplies;

    @JsonProperty("photos")
    public List<Photo> getPhotos() {
        return this.photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    List<Photo> photos;

    @JsonProperty("isUpdated")
    public boolean getIsUpdated() {
        return this.isUpdated;
    }

    public void setIsUpdated(boolean isUpdated) {
        this.isUpdated = isUpdated;
    }

    boolean isUpdated;

    @JsonProperty("user")
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    User user;

    @JsonProperty("appreciatedBy")
    public Object getAppreciatedBy() {
        return this.appreciatedBy;
    }

    public void setAppreciatedBy(Object appreciatedBy) {
        this.appreciatedBy = appreciatedBy;
    }

    Object appreciatedBy;

    @JsonProperty("totalPhotos")
    public int getTotalPhotos() {
        return this.totalPhotos;
    }

    public void setTotalPhotos(int totalPhotos) {
        this.totalPhotos = totalPhotos;
    }

    int totalPhotos;

    @JsonProperty("lightboxMediaItems")
    public List<LightboxMediaItem> getLightboxMediaItems() {
        return this.lightboxMediaItems;
    }

    public void setLightboxMediaItems(List<LightboxMediaItem> lightboxMediaItems) {
        this.lightboxMediaItems = lightboxMediaItems;
    }

    List<LightboxMediaItem> lightboxMediaItems;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;

    @JsonProperty("localizedDate")
    public String getLocalizedDate() {
        return this.localizedDate;
    }

    public void setLocalizedDate(String localizedDate) {
        this.localizedDate = localizedDate;
    }

    String localizedDate;
}
