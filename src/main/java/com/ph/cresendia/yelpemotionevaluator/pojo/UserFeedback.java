package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserFeedback {
    @JsonProperty("funny")
    public boolean getFunny() {
        return this.funny;
    }

    public void setFunny(boolean funny) {
        this.funny = funny;
    }

    boolean funny;

    @JsonProperty("useful")
    public boolean getUseful() {
        return this.useful;
    }

    public void setUseful(boolean useful) {
        this.useful = useful;
    }

    boolean useful;

    @JsonProperty("cool")
    public boolean getCool() {
        return this.cool;
    }

    public void setCool(boolean cool) {
        this.cool = cool;
    }

    boolean cool;
}
