package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PhotoHeaderProps {
    @JsonProperty("adUnitBizPhotosUrl")
    public String getAdUnitBizPhotosUrl() {
        return this.adUnitBizPhotosUrl;
    }

    public void setAdUnitBizPhotosUrl(String adUnitBizPhotosUrl) {
        this.adUnitBizPhotosUrl = adUnitBizPhotosUrl;
    }

    String adUnitBizPhotosUrl;

    @JsonProperty("seeAllUrl")
    public String getSeeAllUrl() {
        return this.seeAllUrl;
    }

    public void setSeeAllUrl(String seeAllUrl) {
        this.seeAllUrl = seeAllUrl;
    }

    String seeAllUrl;

    @JsonProperty("mediaTotal")
    public int getMediaTotal() {
        return this.mediaTotal;
    }

    public void setMediaTotal(int mediaTotal) {
        this.mediaTotal = mediaTotal;
    }

    int mediaTotal;

    @JsonProperty("hasBusinessOwnerVideo")
    public boolean getHasBusinessOwnerVideo() {
        return this.hasBusinessOwnerVideo;
    }

    public void setHasBusinessOwnerVideo(boolean hasBusinessOwnerVideo) {
        this.hasBusinessOwnerVideo = hasBusinessOwnerVideo;
    }

    boolean hasBusinessOwnerVideo;

    @JsonProperty("flagContentCsrfToken")
    public String getFlagContentCsrfToken() {
        return this.flagContentCsrfToken;
    }

    public void setFlagContentCsrfToken(String flagContentCsrfToken) {
        this.flagContentCsrfToken = flagContentCsrfToken;
    }

    String flagContentCsrfToken;

    @JsonProperty("userId")
    public Object getUserId() {
        return this.userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    Object userId;

    @JsonProperty("photoHeaderMedias")
    public List<PhotoHeaderMedia> getPhotoHeaderMedias() {
        return this.photoHeaderMedias;
    }

    public void setPhotoHeaderMedias(List<PhotoHeaderMedia> photoHeaderMedias) {
        this.photoHeaderMedias = photoHeaderMedias;
    }

    List<PhotoHeaderMedia> photoHeaderMedias;

    @JsonProperty("votingCsrfToken")
    public String getVotingCsrfToken() {
        return this.votingCsrfToken;
    }

    public void setVotingCsrfToken(String votingCsrfToken) {
        this.votingCsrfToken = votingCsrfToken;
    }

    String votingCsrfToken;

    @JsonProperty("photoFlagReasons")
    public List<PhotoFlagReason> getPhotoFlagReasons() {
        return this.photoFlagReasons;
    }

    public void setPhotoFlagReasons(List<PhotoFlagReason> photoFlagReasons) {
        this.photoFlagReasons = photoFlagReasons;
    }

    List<PhotoFlagReason> photoFlagReasons;

    @JsonProperty("addPhotoUrl")
    public String getAddPhotoUrl() {
        return this.addPhotoUrl;
    }

    public void setAddPhotoUrl(String addPhotoUrl) {
        this.addPhotoUrl = addPhotoUrl;
    }

    String addPhotoUrl;

    @JsonProperty("mediaLightboxItems")
    public List<MediaLightboxItem> getMediaLightboxItems() {
        return this.mediaLightboxItems;
    }

    public void setMediaLightboxItems(List<MediaLightboxItem> mediaLightboxItems) {
        this.mediaLightboxItems = mediaLightboxItems;
    }

    List<MediaLightboxItem> mediaLightboxItems;
}
