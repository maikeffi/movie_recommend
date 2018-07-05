package com.maikeffi.geektrust.movie.recommend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Movie {

    @SerializedName("id")
    int id;
    @SerializedName("title")
    String title;
    @SerializedName("language")
    String language;
    @SerializedName("genres")
    List<BaseEntity> genres;
    @SerializedName("keywords")
    List<BaseEntity> keywords;
    @SerializedName("casts")
    List<Cast> casts;
    @SerializedName("crews")
    List<Crew> crews;
    @SerializedName("releaseDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date releaseDate;
    @SerializedName("runtime")
    float runtime;
    @SerializedName("url")
    String url;
    @SerializedName("productionCompanies")
    List<BaseEntity> productionCompanies;
    @SerializedName("budget")
    long budget;
    @SerializedName("revenue")
    long revenue;
    @SerializedName("popularity")
    float popularity;
    @SerializedName("voteAverage")
    float voteAverage;
    @SerializedName("voteCount")
    int voteCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<BaseEntity> getGenres() {
        return genres;
    }

    public void setGenres(List<BaseEntity> genres) {
        this.genres = genres;
    }

    public List<BaseEntity> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<BaseEntity> keywords) {
        this.keywords = keywords;
    }

    public List<Cast> getCasts() {
        return casts;
    }

    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }

    public List<Crew> getCrews() {
        return crews;
    }

    public void setCrews(List<Crew> crews) {
        this.crews = crews;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getRuntime() {
        return runtime;
    }

    public void setRuntime(float runtime) {
        this.runtime = runtime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<BaseEntity> getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(List<BaseEntity> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
}
