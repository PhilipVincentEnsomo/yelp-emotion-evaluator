package com.ph.cresendia.yelpemotionevaluator.pojo;

import java.io.Serializable;
import java.util.List;

public class ExtractedData implements Serializable {
    private static final long serialVersionUID = 7475902146254455438L;

    private List<Review> reviews;

    private List<EmotionAnalyzerResult> emotionAnalyzerResultList;

    public List<EmotionAnalyzerResult> getEmotionAnalyzerResultList() {
        return emotionAnalyzerResultList;
    }

    public void setEmotionAnalyzerResultList(List<EmotionAnalyzerResult> emotionAnalyzerResultList) {
        this.emotionAnalyzerResultList = emotionAnalyzerResultList;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
