package com.ph.cresendia.yelpemotionevaluator.controller;

import com.ph.cresendia.yelpemotionevaluator.component.EmotionExtractorComponent;
import com.ph.cresendia.yelpemotionevaluator.component.ReviewHighLightsComponent;
import com.ph.cresendia.yelpemotionevaluator.pojo.BizDetailsPageProps;
import com.ph.cresendia.yelpemotionevaluator.pojo.EmotionAnalyzerResult;
import com.ph.cresendia.yelpemotionevaluator.pojo.ExtractedData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class RestaurantAnalyzerController {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RestaurantAnalyzerController.class);

    @Autowired
    private ReviewHighLightsComponent reviewHighLightsComponent;

    @Autowired
    private EmotionExtractorComponent emotionExtractorComponent;

    @PostMapping("/result")
    public ExtractedData getSomething(@RequestHeader(value = "restaurantID", required = true) String restaurantID) {

        ExtractedData extractedData = new ExtractedData();
        BizDetailsPageProps bizDetailsPageProps = reviewHighLightsComponent.getReviewHighLights(restaurantID);
        List<EmotionAnalyzerResult> emotionAnalyzerResultList = emotionExtractorComponent.extractEmotionDetails(bizDetailsPageProps);

        extractedData.setReviews(bizDetailsPageProps.getReviewFeedQueryProps().getReviews());
        extractedData.setEmotionAnalyzerResultList(emotionAnalyzerResultList);

        return extractedData;
    }

}
