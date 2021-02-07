package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionSaveModalProps {
    @JsonProperty("createCollectionCsrfToken")
    public String getCreateCollectionCsrfToken() {
        return this.createCollectionCsrfToken;
    }

    public void setCreateCollectionCsrfToken(String createCollectionCsrfToken) {
        this.createCollectionCsrfToken = createCollectionCsrfToken;
    }

    String createCollectionCsrfToken;

    @JsonProperty("createCollectionUrl")
    public String getCreateCollectionUrl() {
        return this.createCollectionUrl;
    }

    public void setCreateCollectionUrl(String createCollectionUrl) {
        this.createCollectionUrl = createCollectionUrl;
    }

    String createCollectionUrl;

    @JsonProperty("itemId")
    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    String itemId;

    @JsonProperty("saveItemCsrfToken")
    public String getSaveItemCsrfToken() {
        return this.saveItemCsrfToken;
    }

    public void setSaveItemCsrfToken(String saveItemCsrfToken) {
        this.saveItemCsrfToken = saveItemCsrfToken;
    }

    String saveItemCsrfToken;

    @JsonProperty("saveItemUrl")
    public String getSaveItemUrl() {
        return this.saveItemUrl;
    }

    public void setSaveItemUrl(String saveItemUrl) {
        this.saveItemUrl = saveItemUrl;
    }

    String saveItemUrl;

    @JsonProperty("removeItemCsrfToken")
    public String getRemoveItemCsrfToken() {
        return this.removeItemCsrfToken;
    }

    public void setRemoveItemCsrfToken(String removeItemCsrfToken) {
        this.removeItemCsrfToken = removeItemCsrfToken;
    }

    String removeItemCsrfToken;

    @JsonProperty("removeItemUrl")
    public String getRemoveItemUrl() {
        return this.removeItemUrl;
    }

    public void setRemoveItemUrl(String removeItemUrl) {
        this.removeItemUrl = removeItemUrl;
    }

    String removeItemUrl;

    @JsonProperty("collectionListUrl")
    public String getCollectionListUrl() {
        return this.collectionListUrl;
    }

    public void setCollectionListUrl(String collectionListUrl) {
        this.collectionListUrl = collectionListUrl;
    }

    String collectionListUrl;
}
