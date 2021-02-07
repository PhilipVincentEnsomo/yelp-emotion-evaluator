package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiverampTrackingProps {
    @JsonProperty("initVector")
    public Object getInitVector() {
        return this.initVector;
    }

    public void setInitVector(Object initVector) {
        this.initVector = initVector;
    }

    Object initVector;

    @JsonProperty("cipher")
    public Object getCipher() {
        return this.cipher;
    }

    public void setCipher(Object cipher) {
        this.cipher = cipher;
    }

    Object cipher;

    @JsonProperty("encryptedEmail")
    public Object getEncryptedEmail() {
        return this.encryptedEmail;
    }

    public void setEncryptedEmail(Object encryptedEmail) {
        this.encryptedEmail = encryptedEmail;
    }

    Object encryptedEmail;

    @JsonProperty("yuv")
    public String getYuv() {
        return this.yuv;
    }

    public void setYuv(String yuv) {
        this.yuv = yuv;
    }

    String yuv;
}
