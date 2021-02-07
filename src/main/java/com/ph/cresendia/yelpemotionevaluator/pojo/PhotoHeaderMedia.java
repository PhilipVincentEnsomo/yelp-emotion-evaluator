package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoHeaderMedia {
    @JsonProperty("altText")
    public String getAltText() {
        return this.altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    String altText;

    @JsonProperty("photoId")
    public String getPhotoId() {
        return this.photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    String photoId;

    @JsonProperty("srcUrl")
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public void setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
    }

    String srcUrl;

    @JsonProperty("photoHeight")
    public int getPhotoHeight() {
        return this.photoHeight;
    }

    public void setPhotoHeight(int photoHeight) {
        this.photoHeight = photoHeight;
    }

    int photoHeight;

    @JsonProperty("photoWidth")
    public int getPhotoWidth() {
        return this.photoWidth;
    }

    public void setPhotoWidth(int photoWidth) {
        this.photoWidth = photoWidth;
    }

    int photoWidth;

    @JsonProperty("linkUrl")
    public String getLinkUrl() {
        return this.linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    String linkUrl;

    @JsonProperty("videoThumbnail")
    public boolean getVideoThumbnail() {
        return this.videoThumbnail;
    }

    public void setVideoThumbnail(boolean videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
    }

    boolean videoThumbnail;
}
