package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StaticMapProps {
    @JsonProperty("src")
    public String getSrc() {
        return this.src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    String src;

    @JsonProperty("altText")
    public Object getAltText() {
        return this.altText;
    }

    public void setAltText(Object altText) {
        this.altText = altText;
    }

    Object altText;

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int height;

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int width;

    @JsonProperty("marker")
    public Object getMarker() {
        return this.marker;
    }

    public void setMarker(Object marker) {
        this.marker = marker;
    }

    Object marker;

    @JsonProperty("srcSet")
    public String getSrcSet() {
        return this.srcSet;
    }

    public void setSrcSet(String srcSet) {
        this.srcSet = srcSet;
    }

    String srcSet;
}
