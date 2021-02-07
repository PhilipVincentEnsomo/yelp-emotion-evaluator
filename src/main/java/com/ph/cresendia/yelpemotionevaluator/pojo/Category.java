package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;
}
