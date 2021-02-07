package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShareBusinessModalProps {
    @JsonProperty("contentType")
    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    String contentType;

    @JsonProperty("shareUrl")
    public String getShareUrl() {
        return this.shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    String shareUrl;

    @JsonProperty("twitterUrl")
    public String getTwitterUrl() {
        return this.twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    String twitterUrl;

    @JsonProperty("facebookUrl")
    public String getFacebookUrl() {
        return this.facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    String facebookUrl;

    @JsonProperty("sendToFriendProps")
    public SendToFriendProps getSendToFriendProps() {
        return this.sendToFriendProps;
    }

    public void setSendToFriendProps(SendToFriendProps sendToFriendProps) {
        this.sendToFriendProps = sendToFriendProps;
    }

    SendToFriendProps sendToFriendProps;
}
