package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CollectionCardCarouselProps {
    @JsonProperty("collections")
    public List<Collection> getCollections() {
        return this.collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    List<Collection> collections;
}
