package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RelatedBusiness {
    @JsonProperty("rating")
    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    double rating;

    @JsonProperty("reviewCount")
    public int getReviewCount() {
        return this.reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    int reviewCount;

    @JsonProperty("showVerifiedLicense")
    public boolean getShowVerifiedLicense() {
        return this.showVerifiedLicense;
    }

    public void setShowVerifiedLicense(boolean showVerifiedLicense) {
        this.showVerifiedLicense = showVerifiedLicense;
    }

    boolean showVerifiedLicense;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("businessUrl")
    public String getBusinessUrl() {
        return this.businessUrl;
    }

    public void setBusinessUrl(String businessUrl) {
        this.businessUrl = businessUrl;
    }

    String businessUrl;

    @JsonProperty("showCategoryLinks")
    public boolean getShowCategoryLinks() {
        return this.showCategoryLinks;
    }

    public void setShowCategoryLinks(boolean showCategoryLinks) {
        this.showCategoryLinks = showCategoryLinks;
    }

    boolean showCategoryLinks;

    @JsonProperty("microformat")
    public boolean getMicroformat() {
        return this.microformat;
    }

    public void setMicroformat(boolean microformat) {
        this.microformat = microformat;
    }

    boolean microformat;

    @JsonProperty("priceRange")
    public int getPriceRange() {
        return this.priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    int priceRange;

    @JsonProperty("photoSrc")
    public String getPhotoSrc() {
        return this.photoSrc;
    }

    public void setPhotoSrc(String photoSrc) {
        this.photoSrc = photoSrc;
    }

    String photoSrc;

    @JsonProperty("currencySymbol")
    public String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    String currencySymbol;

    @JsonProperty("showPhoto")
    public boolean getShowPhoto() {
        return this.showPhoto;
    }

    public void setShowPhoto(boolean showPhoto) {
        this.showPhoto = showPhoto;
    }

    boolean showPhoto;

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    List<Category> categories;

    @JsonProperty("showPriceRemainder")
    public boolean getShowPriceRemainder() {
        return this.showPriceRemainder;
    }

    public void setShowPriceRemainder(boolean showPriceRemainder) {
        this.showPriceRemainder = showPriceRemainder;
    }

    boolean showPriceRemainder;
}
