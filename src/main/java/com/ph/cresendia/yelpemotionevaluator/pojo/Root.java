package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty("bizDetailsPageProps")
    public BizDetailsPageProps getBizDetailsPageProps() {
        return this.bizDetailsPageProps;
    }

    public void setBizDetailsPageProps(BizDetailsPageProps bizDetailsPageProps) {
        this.bizDetailsPageProps = bizDetailsPageProps;
    }

    BizDetailsPageProps bizDetailsPageProps;
}
