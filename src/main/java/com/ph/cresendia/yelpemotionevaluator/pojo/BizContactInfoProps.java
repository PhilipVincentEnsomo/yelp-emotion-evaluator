package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BizContactInfoProps {
    @JsonProperty("businessMenuProps")
    public Object getBusinessMenuProps() {
        return this.businessMenuProps;
    }

    public void setBusinessMenuProps(Object businessMenuProps) {
        this.businessMenuProps = businessMenuProps;
    }

    Object businessMenuProps;

    @JsonProperty("sendToPhoneProps")
    public Object getSendToPhoneProps() {
        return this.sendToPhoneProps;
    }

    public void setSendToPhoneProps(Object sendToPhoneProps) {
        this.sendToPhoneProps = sendToPhoneProps;
    }

    Object sendToPhoneProps;

    @JsonProperty("businessWebsite")
    public BusinessWebsite getBusinessWebsite() {
        return this.businessWebsite;
    }

    public void setBusinessWebsite(BusinessWebsite businessWebsite) {
        this.businessWebsite = businessWebsite;
    }

    BusinessWebsite businessWebsite;

    @JsonProperty("messageBusinessComposerProps")
    public Object getMessageBusinessComposerProps() {
        return this.messageBusinessComposerProps;
    }

    public void setMessageBusinessComposerProps(Object messageBusinessComposerProps) {
        this.messageBusinessComposerProps = messageBusinessComposerProps;
    }

    Object messageBusinessComposerProps;

    @JsonProperty("businessId")
    public String getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    String businessId;
}
