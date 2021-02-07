package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WriteAReviewWidgetProps {
    @JsonProperty("message")
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    @JsonProperty("warUrl")
    public String getWarUrl() {
        return this.warUrl;
    }

    public void setWarUrl(String warUrl) {
        this.warUrl = warUrl;
    }

    String warUrl;

    @JsonProperty("isFTR")
    public boolean getIsFTR() {
        return this.isFTR;
    }

    public void setIsFTR(boolean isFTR) {
        this.isFTR = isFTR;
    }

    boolean isFTR;

    @JsonProperty("reviewDraft")
    public Object getReviewDraft() {
        return this.reviewDraft;
    }

    public void setReviewDraft(Object reviewDraft) {
        this.reviewDraft = reviewDraft;
    }

    Object reviewDraft;

    @JsonProperty("user")
    public Object getUser() {
        return this.user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    Object user;
}
