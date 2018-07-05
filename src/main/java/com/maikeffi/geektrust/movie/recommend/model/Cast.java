package com.maikeffi.geektrust.movie.recommend.model;

import com.google.gson.annotations.SerializedName;

public class Cast  extends CreditBase{
    @SerializedName("character")
    String character;
    @SerializedName("order")
    int order;
    @SerializedName("cast_id")
    int castId;


    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getCastId() {
        return castId;
    }

    public void setCastId(int castId) {
        this.castId = castId;
    }
}
