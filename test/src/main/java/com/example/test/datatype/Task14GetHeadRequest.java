package com.example.test.datatype;

public class Task14GetHeadRequest {
    private String courseid;

    public Task14GetHeadRequest(){

    }
    public Task14GetHeadRequest(String courseid){
        this.courseid = courseid;
    }
    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }
}
