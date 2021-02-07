package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeaturePlacements {
    @JsonProperty("fromTheBusiness")
    public int getFromTheBusiness() {
        return this.fromTheBusiness;
    }

    public void setFromTheBusiness(int fromTheBusiness) {
        this.fromTheBusiness = fromTheBusiness;
    }

    int fromTheBusiness;

    @JsonProperty("adUnitsAboveReview")
    public int getAdUnitsAboveReview() {
        return this.adUnitsAboveReview;
    }

    public void setAdUnitsAboveReview(int adUnitsAboveReview) {
        this.adUnitsAboveReview = adUnitsAboveReview;
    }

    int adUnitsAboveReview;

    @JsonProperty("surveyQuestions")
    public int getSurveyQuestions() {
        return this.surveyQuestions;
    }

    public void setSurveyQuestions(int surveyQuestions) {
        this.surveyQuestions = surveyQuestions;
    }

    int surveyQuestions;

    @JsonProperty("mediaShowcase")
    public int getMediaShowcase() {
        return this.mediaShowcase;
    }

    public void setMediaShowcase(int mediaShowcase) {
        this.mediaShowcase = mediaShowcase;
    }

    int mediaShowcase;
}
