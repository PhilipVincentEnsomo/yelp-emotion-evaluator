package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoFlagReason {
    @JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    String code;

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;
}
