package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RatingDetailsProps {
    @JsonProperty("monthlyRatingsSupportUri")
    public String getMonthlyRatingsSupportUri() {
        return this.monthlyRatingsSupportUri;
    }

    public void setMonthlyRatingsSupportUri(String monthlyRatingsSupportUri) {
        this.monthlyRatingsSupportUri = monthlyRatingsSupportUri;
    }

    String monthlyRatingsSupportUri;

    @JsonProperty("monthlyRatingsByYear")
    public MonthlyRatingsByYear getMonthlyRatingsByYear() {
        return this.monthlyRatingsByYear;
    }

    public void setMonthlyRatingsByYear(MonthlyRatingsByYear monthlyRatingsByYear) {
        this.monthlyRatingsByYear = monthlyRatingsByYear;
    }

    MonthlyRatingsByYear monthlyRatingsByYear;

    @JsonProperty("numReviews")
    public int getNumReviews() {
        return this.numReviews;
    }

    public void setNumReviews(int numReviews) {
        this.numReviews = numReviews;
    }

    int numReviews;

    @JsonProperty("recommendationSoftwareSupportUri")
    public String getRecommendationSoftwareSupportUri() {
        return this.recommendationSoftwareSupportUri;
    }

    public void setRecommendationSoftwareSupportUri(String recommendationSoftwareSupportUri) {
        this.recommendationSoftwareSupportUri = recommendationSoftwareSupportUri;
    }

    String recommendationSoftwareSupportUri;

    @JsonProperty("ratingHistogram")
    public RatingHistogram getRatingHistogram() {
        return this.ratingHistogram;
    }

    public void setRatingHistogram(RatingHistogram ratingHistogram) {
        this.ratingHistogram = ratingHistogram;
    }

    RatingHistogram ratingHistogram;

    @JsonProperty("yearJoined")
    public int getYearJoined() {
        return this.yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    int yearJoined;
}
