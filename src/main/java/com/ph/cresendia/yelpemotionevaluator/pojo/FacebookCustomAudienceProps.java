package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FacebookCustomAudienceProps {
    @JsonProperty("isLive")
    public boolean getIsLive() {
        return this.isLive;
    }

    public void setIsLive(boolean isLive) {
        this.isLive = isLive;
    }

    boolean isLive;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;
}
