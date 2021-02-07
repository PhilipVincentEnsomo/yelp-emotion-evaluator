package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReviewHighlightsProps {
    @JsonProperty("initialDisplayLimit")
    public int getInitialDisplayLimit() {
        return this.initialDisplayLimit;
    }

    public void setInitialDisplayLimit(int initialDisplayLimit) {
        this.initialDisplayLimit = initialDisplayLimit;
    }

    int initialDisplayLimit;

    @JsonProperty("reviewHighlights")
    public List<ReviewHighlight> getReviewHighlights() {
        return this.reviewHighlights;
    }

    public void setReviewHighlights(List<ReviewHighlight> reviewHighlights) {
        this.reviewHighlights = reviewHighlights;
    }

    List<ReviewHighlight> reviewHighlights;
}
