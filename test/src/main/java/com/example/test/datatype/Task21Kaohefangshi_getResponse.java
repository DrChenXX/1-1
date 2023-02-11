package com.example.test.datatype;

public class Task21Kaohefangshi_getResponse {
    private String courseid;
    private String mingcheng;
    private int zhanbi;

    public Task21Kaohefangshi_getResponse(){

    }
    public Task21Kaohefangshi_getResponse(String courseid,String mingcheng,int zhanbi){
        this.courseid = courseid;
        this.mingcheng = mingcheng;
        this.zhanbi = zhanbi;
    }
    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setZhanbi(int zhanbi) {
        this.zhanbi = zhanbi;
    }

    public int getZhanbi() {
        return zhanbi;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }
}
