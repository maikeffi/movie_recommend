package com.maikeffi.geektrust.movie.recommend.model;

import com.google.gson.annotations.SerializedName;

public class CreditBase extends BaseEntity{

    @SerializedName("credit_id")
    String creditId;
    @SerializedName("gender")
    int gender;

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
