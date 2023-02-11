package com.example.test.datatype;

public class TaskStatusGetRequest {
    private String courseid;

    public TaskStatusGetRequest() {
    }

    public TaskStatusGetRequest(String courseid) {
        this.courseid = courseid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }


}
