package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Counts {
    @JsonProperty("funny")
    public int getFunny() {
        return this.funny;
    }

    public void setFunny(int funny) {
        this.funny = funny;
    }

    int funny;

    @JsonProperty("useful")
    public int getUseful() {
        return this.useful;
    }

    public void setUseful(int useful) {
        this.useful = useful;
    }

    int useful;

    @JsonProperty("cool")
    public int getCool() {
        return this.cool;
    }

    public void setCool(int cool) {
        this.cool = cool;
    }

    int cool;
}
