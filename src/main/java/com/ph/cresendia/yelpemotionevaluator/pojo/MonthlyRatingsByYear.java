package com.ph.cresendia.yelpemotionevaluator.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MonthlyRatingsByYear {
    @JsonProperty("2018")
    public List<List<Integer>> get_2018() {
        return this._2018;
    }

    public void set_2018(List<List<Integer>> _2018) {
        this._2018 = _2018;
    }

    List<List<Integer>> _2018;

    @JsonProperty("2019")
    public List<List<Double>> get_2019() {
        return this._2019;
    }

    public void set_2019(List<List<Double>> _2019) {
        this._2019 = _2019;
    }

    List<List<Double>> _2019;

    @JsonProperty("2020")
    public List<List<Double>> get_2020() {
        return this._2020;
    }

    public void set_2020(List<List<Double>> _2020) {
        this._2020 = _2020;
    }

    List<List<Double>> _2020;

    @JsonProperty("2021")
    public List<List<Double>> get_2021() {
        return this._2021;
    }

    public void set_2021(List<List<Double>> _2021) {
        this._2021 = _2021;
    }

    List<List<Double>> _2021;
}
