package com.example.test.datatype;

public class Task13Kechengmubiao_sendRequest {
    private String courseid;
    private String mubiao;

    public Task13Kechengmubiao_sendRequest(){

    }
    public Task13Kechengmubiao_sendRequest(String courseid,String mubiao){
        this.courseid = courseid;
        this.mubiao = mubiao;
    }
    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCourseid() {
        return courseid;
    }

    public String getMubiao() {
        return mubiao;
    }

    public void setMubiao(String mubiao) {
        this.mubiao = mubiao;
    }
}
