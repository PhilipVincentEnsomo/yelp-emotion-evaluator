package com.ph.cresendia.yelpemotionevaluator.pojo;

import java.io.Serializable;

public class YelpResponseObject implements Serializable {

    private static final long serialVersionUID = -6590898851511587630L;
    private BizDetailsPageProps bizDetailsPageProps;

    public BizDetailsPageProps getBizDetailsPageProps() {
        return bizDetailsPageProps;
    }

    public void setBizDetailsPageProps(BizDetailsPageProps bizDetailsPageProps) {
        this.bizDetailsPageProps = bizDetailsPageProps;
    }
}
