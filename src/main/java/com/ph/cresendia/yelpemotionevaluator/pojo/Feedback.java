package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Feedback {
    @JsonProperty("counts")
    public Counts getCounts() {
        return this.counts;
    }

    public void setCounts(Counts counts) {
        this.counts = counts;
    }

    Counts counts;

    @JsonProperty("userFeedback")
    public UserFeedback getUserFeedback() {
        return this.userFeedback;
    }

    public void setUserFeedback(UserFeedback userFeedback) {
        this.userFeedback = userFeedback;
    }

    UserFeedback userFeedback;

    @JsonProperty("voterText")
    public Object getVoterText() {
        return this.voterText;
    }

    public void setVoterText(Object voterText) {
        this.voterText = voterText;
    }

    Object voterText;
}
