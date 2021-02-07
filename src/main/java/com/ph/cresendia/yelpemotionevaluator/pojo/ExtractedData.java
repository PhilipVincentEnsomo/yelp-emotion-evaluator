package com.ph.cresendia.yelpemotionevaluator.pojo;

import java.io.Serializable;
import java.util.List;

public class ExtractedData implements Serializable {
    private static final long serialVersionUID = 7475902146254455438L;

    private BizDetailsPageProps bizDetailsPageProps;

    private List<EmotionAnalyzerResult> emotionAnalyzerResultList;

    public BizDetailsPageProps getBizDetailsPageProps() {
        return bizDetailsPageProps;
    }

    public void setBizDetailsPageProps(BizDetailsPageProps bizDetailsPageProps) {
        this.bizDetailsPageProps = bizDetailsPageProps;
    }

    public List<EmotionAnalyzerResult> getEmotionAnalyzerResultList() {
        return emotionAnalyzerResultList;
    }

    public void setEmotionAnalyzerResultList(List<EmotionAnalyzerResult> emotionAnalyzerResultList) {
        this.emotionAnalyzerResultList = emotionAnalyzerResultList;
    }
}
