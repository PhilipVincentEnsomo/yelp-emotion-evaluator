package com.ph.cresendia.yelpemotionevaluator.component;

import com.ph.cresendia.yelpemotionevaluator.pojo.BizDetailsPageProps;
import com.ph.cresendia.yelpemotionevaluator.pojo.YelpResponseObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public class ReviewHighLightsComponent {


    public BizDetailsPageProps getReviewHighLights(String restaurantID) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.add("cookie", "bse=a356c98ad8ab4deb909ac8b185fd3b66; hl=en_US; sc=950cf15c93; wdi=1|5DCCC326DC0BFA7C|0x1.8077d5edbd46fp+30|f5ddf2d78b888f2e; _ga=GA1.2.5DCCC326DC0BFA7C; _gid=GA1.2.1975756210.1612576124; _gat_www=1; _gat_global=1; xcj=1|B7yiRqb9FkrI7njzts9kFkA5G6W3j2DJYT0OnFU7BZQ");

            headers.add("accept", "application/json");
            headers.add("accept-language", "en");
            headers.add("content-type", "application/json");
            headers.add("sec-fetch-dest", "empty");
            headers.add("sec-fetch-mode", "cors");
            headers.add("sec-fetch-site", "same-origin");
            headers.add("x-requested-with", "XMLHttpRequest");

            StringBuilder sb = new StringBuilder();
            sb.append("https://www.yelp.com/biz/");
            sb.append(restaurantID);
            sb.append("/props");
            URI uri = URI.create(sb.toString());

            HttpEntity<String> entity = new HttpEntity<>("body", headers);

            ResponseEntity<YelpResponseObject> props = restTemplate.exchange(uri, HttpMethod.GET, entity, YelpResponseObject.class);
            return props.getBody().getBizDetailsPageProps();
        } catch (Exception e) {
            return null;
        }
    }


}
