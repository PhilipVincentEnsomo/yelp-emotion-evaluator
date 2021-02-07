package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IframeUrls {
    @JsonProperty("third_party_deep_link")
    public String getThird_party_deep_link() {
        return this.third_party_deep_link;
    }

    public void setThird_party_deep_link(String third_party_deep_link) {
        this.third_party_deep_link = third_party_deep_link;
    }

    String third_party_deep_link;

    @JsonProperty("mtb_search_ad")
    public String getMtb_search_ad() {
        return this.mtb_search_ad;
    }

    public void setMtb_search_ad(String mtb_search_ad) {
        this.mtb_search_ad = mtb_search_ad;
    }

    String mtb_search_ad;

    @JsonProperty("mtb_search_action")
    public String getMtb_search_action() {
        return this.mtb_search_action;
    }

    public void setMtb_search_action(String mtb_search_action) {
        this.mtb_search_action = mtb_search_action;
    }

    String mtb_search_action;

    @JsonProperty("mtb_landing_page")
    public String getMtb_landing_page() {
        return this.mtb_landing_page;
    }

    public void setMtb_landing_page(String mtb_landing_page) {
        this.mtb_landing_page = mtb_landing_page;
    }

    String mtb_landing_page;
}
