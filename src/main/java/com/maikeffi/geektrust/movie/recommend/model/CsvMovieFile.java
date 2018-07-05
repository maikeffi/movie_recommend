package com.maikeffi.geektrust.movie.recommend.model;

import com.opencsv.bean.CsvBindByName;

public class CsvMovieFile {

    @CsvBindByName(column = "budget")
    private Long budget;
    @CsvBindByName(column = "genres")
    private String genres;
    @CsvBindByName(column = "homepage")
    private String homepage;
    @CsvBindByName(column = "id")
    private int id;
    @CsvBindByName(column = "keywords")
    private String keywords;
    @CsvBindByName(column = "original_language")
    private String original_language;
    @CsvBindByName(column = "original_title")
    private String original_title;
    @CsvBindByName(column = "overview")
    private String overview;
    @CsvBindByName(column = "popularity")
    private float popularity;
    @CsvBindByName(column = "production_companies")
    private String production_companies;
    @CsvBindByName(column = "production_countries")
    private String production_countries;
    @CsvBindByName(column = "release_date")
    private String release_date;
    @CsvBindByName(column = "revenue")
    private long revenue;
    @CsvBindByName(column = "runtime")
    private float runtime;
    @CsvBindByName(column = "spoken_languages")
    private String spoken_languages;
    @CsvBindByName(column = "status")
    private String status;
    @CsvBindByName(column = "tagline")
    private String tagline;
    @CsvBindByName(column = "title")
    private String title;
    @CsvBindByName(column = "vote_average")
    private float vote_average;
    @CsvBindByName(column = "vote_count")
    private int vote_count;


    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public String getProduction_companies() {
        return production_companies;
    }

    public void setProduction_companies(String production_companies) {
        this.production_companies = production_companies;
    }

    public String getProduction_countries() {
        return production_countries;
    }

    public void setProduction_countries(String production_countries) {
        this.production_countries = production_countries;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public float getRuntime() {
        return runtime;
    }

    public void setRuntime(float runtime) {
        this.runtime = runtime;
    }

    public String getSpoken_languages() {
        return spoken_languages;
    }

    public void setSpoken_languages(String spoken_languages) {
        this.spoken_languages = spoken_languages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }
}
