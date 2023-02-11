package com.example.test.datatype;

public class Task11FeedbackGetRequest {
    private String courseid;

    public Task11FeedbackGetRequest() {
    }

    public Task11FeedbackGetRequest(String courseid) {
        this.courseid = courseid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }
}
