package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StaticReviewFeedProps {
    @JsonProperty("unconfirmedReview")
    public Object getUnconfirmedReview() {
        return this.unconfirmedReview;
    }

    public void setUnconfirmedReview(Object unconfirmedReview) {
        this.unconfirmedReview = unconfirmedReview;
    }

    Object unconfirmedReview;

    @JsonProperty("bizSiteDomain")
    public String getBizSiteDomain() {
        return this.bizSiteDomain;
    }

    public void setBizSiteDomain(String bizSiteDomain) {
        this.bizSiteDomain = bizSiteDomain;
    }

    String bizSiteDomain;

    @JsonProperty("reviewLanguageToLoad")
    public Object getReviewLanguageToLoad() {
        return this.reviewLanguageToLoad;
    }

    public void setReviewLanguageToLoad(Object reviewLanguageToLoad) {
        this.reviewLanguageToLoad = reviewLanguageToLoad;
    }

    Object reviewLanguageToLoad;

    @JsonProperty("businessId")
    public String getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    String businessId;

    @JsonProperty("currentUserId")
    public Object getCurrentUserId() {
        return this.currentUserId;
    }

    public void setCurrentUserId(Object currentUserId) {
        this.currentUserId = currentUserId;
    }

    Object currentUserId;

    @JsonProperty("interfaceLanguageCode")
    public String getInterfaceLanguageCode() {
        return this.interfaceLanguageCode;
    }

    public void setInterfaceLanguageCode(String interfaceLanguageCode) {
        this.interfaceLanguageCode = interfaceLanguageCode;
    }

    String interfaceLanguageCode;

    @JsonProperty("csrfTokens")
    public CsrfTokens getCsrfTokens() {
        return this.csrfTokens;
    }

    public void setCsrfTokens(CsrfTokens csrfTokens) {
        this.csrfTokens = csrfTokens;
    }

    CsrfTokens csrfTokens;

    @JsonProperty("currentUserIsBizOwner")
    public boolean getCurrentUserIsBizOwner() {
        return this.currentUserIsBizOwner;
    }

    public void setCurrentUserIsBizOwner(boolean currentUserIsBizOwner) {
        this.currentUserIsBizOwner = currentUserIsBizOwner;
    }

    boolean currentUserIsBizOwner;

    @JsonProperty("reviewRemovalReasons")
    public List<ReviewRemovalReason> getReviewRemovalReasons() {
        return this.reviewRemovalReasons;
    }

    public void setReviewRemovalReasons(List<ReviewRemovalReason> reviewRemovalReasons) {
        this.reviewRemovalReasons = reviewRemovalReasons;
    }

    List<ReviewRemovalReason> reviewRemovalReasons;

    @JsonProperty("currentUserFollows")
    public List<Object> getCurrentUserFollows() {
        return this.currentUserFollows;
    }

    public void setCurrentUserFollows(List<Object> currentUserFollows) {
        this.currentUserFollows = currentUserFollows;
    }

    List<Object> currentUserFollows;

    @JsonProperty("selectedReviewId")
    public Object getSelectedReviewId() {
        return this.selectedReviewId;
    }

    public void setSelectedReviewId(Object selectedReviewId) {
        this.selectedReviewId = selectedReviewId;
    }

    Object selectedReviewId;

    @JsonProperty("reviewFlagReasons")
    public List<ReviewFlagReason> getReviewFlagReasons() {
        return this.reviewFlagReasons;
    }

    public void setReviewFlagReasons(List<ReviewFlagReason> reviewFlagReasons) {
        this.reviewFlagReasons = reviewFlagReasons;
    }

    List<ReviewFlagReason> reviewFlagReasons;

    @JsonProperty("dateOfExperienceBannerProps")
    public Object getDateOfExperienceBannerProps() {
        return this.dateOfExperienceBannerProps;
    }

    public void setDateOfExperienceBannerProps(Object dateOfExperienceBannerProps) {
        this.dateOfExperienceBannerProps = dateOfExperienceBannerProps;
    }

    Object dateOfExperienceBannerProps;

    @JsonProperty("photoFlagReasons")
    public List<PhotoFlagReason> getPhotoFlagReasons() {
        return this.photoFlagReasons;
    }

    public void setPhotoFlagReasons(List<PhotoFlagReason> photoFlagReasons) {
        this.photoFlagReasons = photoFlagReasons;
    }

    List<PhotoFlagReason> photoFlagReasons;

    @JsonProperty("writeAReviewWidgetProps")
    public WriteAReviewWidgetProps getWriteAReviewWidgetProps() {
        return this.writeAReviewWidgetProps;
    }

    public void setWriteAReviewWidgetProps(WriteAReviewWidgetProps writeAReviewWidgetProps) {
        this.writeAReviewWidgetProps = writeAReviewWidgetProps;
    }

    WriteAReviewWidgetProps writeAReviewWidgetProps;

    @JsonProperty("reviewFeedbackUrl")
    public String getReviewFeedbackUrl() {
        return this.reviewFeedbackUrl;
    }

    public void setReviewFeedbackUrl(String reviewFeedbackUrl) {
        this.reviewFeedbackUrl = reviewFeedbackUrl;
    }

    String reviewFeedbackUrl;
}
