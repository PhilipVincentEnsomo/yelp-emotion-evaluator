package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionBarControllerProps {
    @JsonProperty("shareBusinessModalProps")
    public ShareBusinessModalProps getShareBusinessModalProps() {
        return this.shareBusinessModalProps;
    }

    public void setShareBusinessModalProps(ShareBusinessModalProps shareBusinessModalProps) {
        this.shareBusinessModalProps = shareBusinessModalProps;
    }

    ShareBusinessModalProps shareBusinessModalProps;

    @JsonProperty("businessId")
    public String getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    String businessId;

    @JsonProperty("saveTooltipText")
    public Object getSaveTooltipText() {
        return this.saveTooltipText;
    }

    public void setSaveTooltipText(Object saveTooltipText) {
        this.saveTooltipText = saveTooltipText;
    }

    Object saveTooltipText;

    @JsonProperty("postingBlockedModalProps")
    public Object getPostingBlockedModalProps() {
        return this.postingBlockedModalProps;
    }

    public void setPostingBlockedModalProps(Object postingBlockedModalProps) {
        this.postingBlockedModalProps = postingBlockedModalProps;
    }

    Object postingBlockedModalProps;

    @JsonProperty("collectionSaveModalProps")
    public CollectionSaveModalProps getCollectionSaveModalProps() {
        return this.collectionSaveModalProps;
    }

    public void setCollectionSaveModalProps(CollectionSaveModalProps collectionSaveModalProps) {
        this.collectionSaveModalProps = collectionSaveModalProps;
    }

    CollectionSaveModalProps collectionSaveModalProps;

    @JsonProperty("isLoggedIn")
    public boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    boolean isLoggedIn;

    @JsonProperty("currentUserDidSave")
    public boolean getCurrentUserDidSave() {
        return this.currentUserDidSave;
    }

    public void setCurrentUserDidSave(boolean currentUserDidSave) {
        this.currentUserDidSave = currentUserDidSave;
    }

    boolean currentUserDidSave;
}
