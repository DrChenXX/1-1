package com.example.test.datatype;

public class Task31Fenshuzhanbi_sendRequest {
    private String courseid;
    private String mubiao;
    private int zhanbi;
    private String guanlian;

    public Task31Fenshuzhanbi_sendRequest() {
    }

    public Task31Fenshuzhanbi_sendRequest(String courseid,String mubiao,int zhanbi,String guanlian) {
        this.courseid = courseid;
        this.mubiao = mubiao;
        this.zhanbi = zhanbi;
        this.guanlian = guanlian;
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

    public int getZhanbi() {
        return zhanbi;
    }

    public void setZhanbi(int zhanbi) {
        this.zhanbi = zhanbi;
    }

    public String getGuanlian() {
        return guanlian;
    }

    public void setGuanlian(String guanlian) {
        this.guanlian = guanlian;
    }
}
