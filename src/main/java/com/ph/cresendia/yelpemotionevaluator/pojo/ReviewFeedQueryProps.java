package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReviewFeedQueryProps {
    @JsonProperty("reviews")
    public List<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    List<Review> reviews;

    @JsonProperty("reviewLanguages")
    public List<ReviewLanguage> getReviewLanguages() {
        return this.reviewLanguages;
    }

    public void setReviewLanguages(List<ReviewLanguage> reviewLanguages) {
        this.reviewLanguages = reviewLanguages;
    }

    List<ReviewLanguage> reviewLanguages;

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return this.pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    Pagination pagination;

    @JsonProperty("filters")
    public Filters getFilters() {
        return this.filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    Filters filters;
}
