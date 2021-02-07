package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReviewHighlight {
    @JsonProperty("attributionInfo")
    public String getAttributionInfo() {
        return this.attributionInfo;
    }

    public void setAttributionInfo(String attributionInfo) {
        this.attributionInfo = attributionInfo;
    }

    String attributionInfo;

    @JsonProperty("photo")
    public Photo getPhoto() {
        return this.photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    Photo photo;

    @JsonProperty("reviewSearchUrl")
    public String getReviewSearchUrl() {
        return this.reviewSearchUrl;
    }

    public void setReviewSearchUrl(String reviewSearchUrl) {
        this.reviewSearchUrl = reviewSearchUrl;
    }

    String reviewSearchUrl;

    @JsonProperty("menuItemLink")
    public Object getMenuItemLink() {
        return this.menuItemLink;
    }

    public void setMenuItemLink(Object menuItemLink) {
        this.menuItemLink = menuItemLink;
    }

    Object menuItemLink;

    @JsonProperty("highlightTextSegments")
    public List<HighlightTextSegment> getHighlightTextSegments() {
        return this.highlightTextSegments;
    }

    public void setHighlightTextSegments(List<HighlightTextSegment> highlightTextSegments) {
        this.highlightTextSegments = highlightTextSegments;
    }

    List<HighlightTextSegment> highlightTextSegments;
}
