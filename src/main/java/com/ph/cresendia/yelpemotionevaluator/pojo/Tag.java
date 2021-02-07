package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tag {
    @JsonProperty("title")
    public Object getTitle() {
        return this.title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    Object title;

    @JsonProperty("href")
    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    String href;

    @JsonProperty("iconColor")
    public String getIconColor() {
        return this.iconColor;
    }

    public void setIconColor(String iconColor) {
        this.iconColor = iconColor;
    }

    String iconColor;

    @JsonProperty("iconName")
    public String getIconName() {
        return this.iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    String iconName;

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    String label;
}
