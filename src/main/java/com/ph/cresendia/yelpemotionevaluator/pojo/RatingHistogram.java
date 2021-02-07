package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RatingHistogram {
    @JsonProperty("largestCount")
    public int getLargestCount() {
        return this.largestCount;
    }

    public void setLargestCount(int largestCount) {
        this.largestCount = largestCount;
    }

    int largestCount;

    @JsonProperty("histogramData")
    public List<HistogramData> getHistogramData() {
        return this.histogramData;
    }

    public void setHistogramData(List<HistogramData> histogramData) {
        this.histogramData = histogramData;
    }

    List<HistogramData> histogramData;
}
