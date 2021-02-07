package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CsrfTokens {
    @JsonProperty("sendToFriend")
    public String getSendToFriend() {
        return this.sendToFriend;
    }

    public void setSendToFriend(String sendToFriend) {
        this.sendToFriend = sendToFriend;
    }

    String sendToFriend;

    @JsonProperty("flagContent")
    public String getFlagContent() {
        return this.flagContent;
    }

    public void setFlagContent(String flagContent) {
        this.flagContent = flagContent;
    }

    String flagContent;

    @JsonProperty("reviewFeedback")
    public String getReviewFeedback() {
        return this.reviewFeedback;
    }

    public void setReviewFeedback(String reviewFeedback) {
        this.reviewFeedback = reviewFeedback;
    }

    String reviewFeedback;

    @JsonProperty("removeReview")
    public String getRemoveReview() {
        return this.removeReview;
    }

    public void setRemoveReview(String removeReview) {
        this.removeReview = removeReview;
    }

    String removeReview;

    @JsonProperty("bizPhotos")
    public String getBizPhotos() {
        return this.bizPhotos;
    }

    public void setBizPhotos(String bizPhotos) {
        this.bizPhotos = bizPhotos;
    }

    String bizPhotos;

    @JsonProperty("userFollow")
    public String getUserFollow() {
        return this.userFollow;
    }

    public void setUserFollow(String userFollow) {
        this.userFollow = userFollow;
    }

    String userFollow;

    @JsonProperty("sendMessage")
    public String getSendMessage() {
        return this.sendMessage;
    }

    public void setSendMessage(String sendMessage) {
        this.sendMessage = sendMessage;
    }

    String sendMessage;

    @JsonProperty("searchForFriends")
    public String getSearchForFriends() {
        return this.searchForFriends;
    }

    public void setSearchForFriends(String searchForFriends) {
        this.searchForFriends = searchForFriends;
    }

    String searchForFriends;

    @JsonProperty("compliment")
    public String getCompliment() {
        return this.compliment;
    }

    public void setCompliment(String compliment) {
        this.compliment = compliment;
    }

    String compliment;
}
