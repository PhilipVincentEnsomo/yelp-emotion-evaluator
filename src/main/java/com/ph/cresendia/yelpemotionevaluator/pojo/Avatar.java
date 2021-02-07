package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Avatar {
    @JsonProperty("srcSetUrl")
    public String getSrcSetUrl() {
        return this.srcSetUrl;
    }

    public void setSrcSetUrl(String srcSetUrl) {
        this.srcSetUrl = srcSetUrl;
    }

    String srcSetUrl;

    @JsonProperty("srcUrl")
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public void setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
    }

    String srcUrl;

    @JsonProperty("linkUrl")
    public String getLinkUrl() {
        return this.linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    String linkUrl;
}
