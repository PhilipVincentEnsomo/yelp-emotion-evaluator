package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RelatedBusinessesCarouselProps {
    @JsonProperty("relatedBusinesses")
    public List<RelatedBusiness> getRelatedBusinesses() {
        return this.relatedBusinesses;
    }

    public void setRelatedBusinesses(List<RelatedBusiness> relatedBusinesses) {
        this.relatedBusinesses = relatedBusinesses;
    }

    List<RelatedBusiness> relatedBusinesses;
}
