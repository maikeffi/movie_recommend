package com.maikeffi.geektrust.movie.recommend.model;

import com.google.gson.annotations.SerializedName;

public class Crew extends CreditBase {

    @SerializedName("department")
    String department;
    @SerializedName("job")
    String job;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
