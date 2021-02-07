package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutoOpeningMessagingModalProps {
    @JsonProperty("iframeUrls")
    public IframeUrls getIframeUrls() {
        return this.iframeUrls;
    }

    public void setIframeUrls(IframeUrls iframeUrls) {
        this.iframeUrls = iframeUrls;
    }

    IframeUrls iframeUrls;
}
