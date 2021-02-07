package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Photo {
    @JsonProperty("src")
    public String getSrc() {
        return this.src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    String src;

    @JsonProperty("altText")
    public String getAltText() {
        return this.altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    String altText;

    @JsonProperty("link")
    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    String link;

    @JsonProperty("srcSet")
    public String getSrcSet() {
        return this.srcSet;
    }

    public void setSrcSet(String srcSet) {
        this.srcSet = srcSet;
    }

    String srcSet;
}
