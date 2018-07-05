package com.maikeffi.geektrust.movie.recommend.model;

import com.google.gson.annotations.SerializedName;

public class BaseEntity {

    @SerializedName("id")
    int id;
    @SerializedName("name")
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
