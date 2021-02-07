package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AddressProps {
    @JsonProperty("formattedNeighborhoods")
    public String getFormattedNeighborhoods() {
        return this.formattedNeighborhoods;
    }

    public void setFormattedNeighborhoods(String formattedNeighborhoods) {
        this.formattedNeighborhoods = formattedNeighborhoods;
    }

    String formattedNeighborhoods;

    @JsonProperty("containerBusiness")
    public Object getContainerBusiness() {
        return this.containerBusiness;
    }

    public void setContainerBusiness(Object containerBusiness) {
        this.containerBusiness = containerBusiness;
    }

    Object containerBusiness;

    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return this.addressLines;
    }

    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    List<String> addressLines;

    @JsonProperty("formattedCrossStreets")
    public Object getFormattedCrossStreets() {
        return this.formattedCrossStreets;
    }

    public void setFormattedCrossStreets(Object formattedCrossStreets) {
        this.formattedCrossStreets = formattedCrossStreets;
    }

    Object formattedCrossStreets;
}
