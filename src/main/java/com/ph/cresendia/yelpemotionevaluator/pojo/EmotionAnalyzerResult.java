package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.google.cloud.vision.v1.Likelihood;

import java.io.Serializable;

public class EmotionAnalyzerResult implements Serializable {

    private static final long serialVersionUID = 855267222232045917L;
    private Likelihood anger;
    private Likelihood joy;
    private Likelihood sorrow;
    private Likelihood surprised;

    public Likelihood getAnger() {
        return anger;
    }

    public void setAnger(Likelihood anger) {
        this.anger = anger;
    }

    public Likelihood getJoy() {
        return joy;
    }

    public void setJoy(Likelihood joy) {
        this.joy = joy;
    }

    public Likelihood getSorrow() {
        return sorrow;
    }

    public void setSorrow(Likelihood sorrow) {
        this.sorrow = sorrow;
    }

    public Likelihood getSurprised() {
        return surprised;
    }

    public void setSurprised(Likelihood surprised) {
        this.surprised = surprised;
    }

}
