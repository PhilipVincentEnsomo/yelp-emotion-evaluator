package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeoLinksProps {
    @JsonProperty("relatedSearchesLinks")
    public Object getRelatedSearchesLinks() {
        return this.relatedSearchesLinks;
    }

    public void setRelatedSearchesLinks(Object relatedSearchesLinks) {
        this.relatedSearchesLinks = relatedSearchesLinks;
    }

    Object relatedSearchesLinks;

    @JsonProperty("transactionSearchLinks")
    public TransactionSearchLinks getTransactionSearchLinks() {
        return this.transactionSearchLinks;
    }

    public void setTransactionSearchLinks(TransactionSearchLinks transactionSearchLinks) {
        this.transactionSearchLinks = transactionSearchLinks;
    }

    TransactionSearchLinks transactionSearchLinks;

    @JsonProperty("servicesHubPageInternalLinks")
    public Object getServicesHubPageInternalLinks() {
        return this.servicesHubPageInternalLinks;
    }

    public void setServicesHubPageInternalLinks(Object servicesHubPageInternalLinks) {
        this.servicesHubPageInternalLinks = servicesHubPageInternalLinks;
    }

    Object servicesHubPageInternalLinks;

    @JsonProperty("nearbySearchInternalLinks")
    public NearbySearchInternalLinks getNearbySearchInternalLinks() {
        return this.nearbySearchInternalLinks;
    }

    public void setNearbySearchInternalLinks(NearbySearchInternalLinks nearbySearchInternalLinks) {
        this.nearbySearchInternalLinks = nearbySearchInternalLinks;
    }

    NearbySearchInternalLinks nearbySearchInternalLinks;

    @JsonProperty("relatedResourceArticleLinks")
    public Object getRelatedResourceArticleLinks() {
        return this.relatedResourceArticleLinks;
    }

    public void setRelatedResourceArticleLinks(Object relatedResourceArticleLinks) {
        this.relatedResourceArticleLinks = relatedResourceArticleLinks;
    }

    Object relatedResourceArticleLinks;

    @JsonProperty("nearbyLinks")
    public NearbyLinks getNearbyLinks() {
        return this.nearbyLinks;
    }

    public void setNearbyLinks(NearbyLinks nearbyLinks) {
        this.nearbyLinks = nearbyLinks;
    }

    NearbyLinks nearbyLinks;

    @JsonProperty("serviceOfferingsLinks")
    public Object getServiceOfferingsLinks() {
        return this.serviceOfferingsLinks;
    }

    public void setServiceOfferingsLinks(Object serviceOfferingsLinks) {
        this.serviceOfferingsLinks = serviceOfferingsLinks;
    }

    Object serviceOfferingsLinks;

    @JsonProperty("cityPageLinks")
    public Object getCityPageLinks() {
        return this.cityPageLinks;
    }

    public void setCityPageLinks(Object cityPageLinks) {
        this.cityPageLinks = cityPageLinks;
    }

    Object cityPageLinks;

    @JsonProperty("nearMeSearchInternalLinks")
    public NearMeSearchInternalLinks getNearMeSearchInternalLinks() {
        return this.nearMeSearchInternalLinks;
    }

    public void setNearMeSearchInternalLinks(NearMeSearchInternalLinks nearMeSearchInternalLinks) {
        this.nearMeSearchInternalLinks = nearMeSearchInternalLinks;
    }

    NearMeSearchInternalLinks nearMeSearchInternalLinks;
}
