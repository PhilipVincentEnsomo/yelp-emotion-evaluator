package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("src")
    public String getSrc() {
        return this.src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    String src;

    @JsonProperty("reviewCount")
    public int getReviewCount() {
        return this.reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    int reviewCount;

    @JsonProperty("altText")
    public String getAltText() {
        return this.altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    String altText;

    @JsonProperty("friendCount")
    public int getFriendCount() {
        return this.friendCount;
    }

    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    int friendCount;

    @JsonProperty("displayLocation")
    public String getDisplayLocation() {
        return this.displayLocation;
    }

    public void setDisplayLocation(String displayLocation) {
        this.displayLocation = displayLocation;
    }

    String displayLocation;

    @JsonProperty("markupDisplayName")
    public String getMarkupDisplayName() {
        return this.markupDisplayName;
    }

    public void setMarkupDisplayName(String markupDisplayName) {
        this.markupDisplayName = markupDisplayName;
    }

    String markupDisplayName;

    @JsonProperty("userUrl")
    public String getUserUrl() {
        return this.userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    String userUrl;

    @JsonProperty("partnerAlias")
    public Object getPartnerAlias() {
        return this.partnerAlias;
    }

    public void setPartnerAlias(Object partnerAlias) {
        this.partnerAlias = partnerAlias;
    }

    Object partnerAlias;

    @JsonProperty("eliteYear")
    public int getEliteYear() {
        return this.eliteYear;
    }

    public void setEliteYear(int eliteYear) {
        this.eliteYear = eliteYear;
    }

    int eliteYear;

    @JsonProperty("photoCount")
    public int getPhotoCount() {
        return this.photoCount;
    }

    public void setPhotoCount(int photoCount) {
        this.photoCount = photoCount;
    }

    int photoCount;

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

    @JsonProperty("displayName")
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    String displayName;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("avatar")
    public Avatar getAvatar() {
        return this.avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    Avatar avatar;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;

    @JsonProperty("isCurrentlyElite")
    public boolean getIsCurrentlyElite() {
        return this.isCurrentlyElite;
    }

    public void setIsCurrentlyElite(boolean isCurrentlyElite) {
        this.isCurrentlyElite = isCurrentlyElite;
    }

    boolean isCurrentlyElite;
}
