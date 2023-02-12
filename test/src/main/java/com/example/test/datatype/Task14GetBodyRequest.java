package com.example.test.datatype;

public class Task14GetBodyRequest {
    private String courseid;

    public Task14GetBodyRequest(){

    }
    public Task14GetBodyRequest(String courseid){
        this.courseid = courseid;
    }
    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }
}
