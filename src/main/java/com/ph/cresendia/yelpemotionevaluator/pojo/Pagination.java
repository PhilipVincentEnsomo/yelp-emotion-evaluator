package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {
    @JsonProperty("totalResults")
    public int getTotalResults() {
        return this.totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    int totalResults;

    @JsonProperty("resultsPerPage")
    public int getResultsPerPage() {
        return this.resultsPerPage;
    }

    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    int resultsPerPage;

    @JsonProperty("startResult")
    public int getStartResult() {
        return this.startResult;
    }

    public void setStartResult(int startResult) {
        this.startResult = startResult;
    }

    int startResult;
}
