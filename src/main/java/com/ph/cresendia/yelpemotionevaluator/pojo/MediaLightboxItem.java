package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaLightboxItem {
    @JsonProperty("business")
    public Business getBusiness() {
        return this.business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    Business business;

    @JsonProperty("businessAvatar")
    public BusinessAvatar getBusinessAvatar() {
        return this.businessAvatar;
    }

    public void setBusinessAvatar(BusinessAvatar businessAvatar) {
        this.businessAvatar = businessAvatar;
    }

    BusinessAvatar businessAvatar;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("userVote")
    public String getUserVote() {
        return this.userVote;
    }

    public void setUserVote(String userVote) {
        this.userVote = userVote;
    }

    String userVote;

    @JsonProperty("helpfulCount")
    public int getHelpfulCount() {
        return this.helpfulCount;
    }

    public void setHelpfulCount(int helpfulCount) {
        this.helpfulCount = helpfulCount;
    }

    int helpfulCount;

    @JsonProperty("caption")
    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    String caption;

    @JsonProperty("user")
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    User user;

    @JsonProperty("timeUploaded")
    public String getTimeUploaded() {
        return this.timeUploaded;
    }

    public void setTimeUploaded(String timeUploaded) {
        this.timeUploaded = timeUploaded;
    }

    String timeUploaded;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;
}
