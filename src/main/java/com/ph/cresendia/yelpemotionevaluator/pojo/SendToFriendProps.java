package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendToFriendProps {
    @JsonProperty("findFriendsUrl")
    public String getFindFriendsUrl() {
        return this.findFriendsUrl;
    }

    public void setFindFriendsUrl(String findFriendsUrl) {
        this.findFriendsUrl = findFriendsUrl;
    }

    String findFriendsUrl;

    @JsonProperty("loggedIn")
    public boolean getLoggedIn() {
        return this.loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    boolean loggedIn;

    @JsonProperty("searchForFriendsCsrfToken")
    public String getSearchForFriendsCsrfToken() {
        return this.searchForFriendsCsrfToken;
    }

    public void setSearchForFriendsCsrfToken(String searchForFriendsCsrfToken) {
        this.searchForFriendsCsrfToken = searchForFriendsCsrfToken;
    }

    String searchForFriendsCsrfToken;

    @JsonProperty("searchForFriendsUrl")
    public String getSearchForFriendsUrl() {
        return this.searchForFriendsUrl;
    }

    public void setSearchForFriendsUrl(String searchForFriendsUrl) {
        this.searchForFriendsUrl = searchForFriendsUrl;
    }

    String searchForFriendsUrl;

    @JsonProperty("submitCsrfToken")
    public String getSubmitCsrfToken() {
        return this.submitCsrfToken;
    }

    public void setSubmitCsrfToken(String submitCsrfToken) {
        this.submitCsrfToken = submitCsrfToken;
    }

    String submitCsrfToken;

    @JsonProperty("submitUrl")
    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String submitUrl) {
        this.submitUrl = submitUrl;
    }

    String submitUrl;
}
