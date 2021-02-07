package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MapBoxProps {
    @JsonProperty("serviceAreaText")
    public Object getServiceAreaText() {
        return this.serviceAreaText;
    }

    public void setServiceAreaText(Object serviceAreaText) {
        this.serviceAreaText = serviceAreaText;
    }

    Object serviceAreaText;

    @JsonProperty("showDirectionsCta")
    public boolean getShowDirectionsCta() {
        return this.showDirectionsCta;
    }

    public void setShowDirectionsCta(boolean showDirectionsCta) {
        this.showDirectionsCta = showDirectionsCta;
    }

    boolean showDirectionsCta;

    @JsonProperty("staticMapProps")
    public StaticMapProps getStaticMapProps() {
        return this.staticMapProps;
    }

    public void setStaticMapProps(StaticMapProps staticMapProps) {
        this.staticMapProps = staticMapProps;
    }

    StaticMapProps staticMapProps;

    @JsonProperty("addressProps")
    public AddressProps getAddressProps() {
        return this.addressProps;
    }

    public void setAddressProps(AddressProps addressProps) {
        this.addressProps = addressProps;
    }

    AddressProps addressProps;

    @JsonProperty("mapsUrl")
    public String getMapsUrl() {
        return this.mapsUrl;
    }

    public void setMapsUrl(String mapsUrl) {
        this.mapsUrl = mapsUrl;
    }

    String mapsUrl;
}
