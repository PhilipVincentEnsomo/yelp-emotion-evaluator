package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HighlightTextSegment {
    @JsonProperty("content")
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    String content;

    @JsonProperty("isHighlighted")
    public boolean getIsHighlighted() {
        return this.isHighlighted;
    }

    public void setIsHighlighted(boolean isHighlighted) {
        this.isHighlighted = isHighlighted;
    }

    boolean isHighlighted;
}
