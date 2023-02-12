package com.example.test.datatype;

public class Task21Kaohefangshi_sendRequest {

    private String kechengid;
    private String mingcheng;
    private int zhanbi;



    public Task21Kaohefangshi_sendRequest(){

    }

    public Task21Kaohefangshi_sendRequest(String kechengid, String mingcheng, int zhanbi){
        this.kechengid = kechengid;
        this.mingcheng = mingcheng;
        this.zhanbi = zhanbi;
    }

    public Task21Kaohefangshi_sendRequest(String mingcheng, int zhanbi){
        this.mingcheng = mingcheng;
        this.zhanbi = zhanbi;
    }


    public String getKechengid(){
        return kechengid;
    }

    public void setKechengid(String kechengid){
        this.kechengid = kechengid;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setContent(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public int getZhanbi() {
        return zhanbi;
    }

    public void setZhanbi(int zhanbi) {
        this.zhanbi = zhanbi;
    }


}
