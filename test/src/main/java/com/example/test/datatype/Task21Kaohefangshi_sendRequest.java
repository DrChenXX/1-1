package com.example.test.datatype;

public class Task21Kaohefangshi_sendRequest {

    private String kechengid;
    private String content;
    private int zhanbi;



    public Task21Kaohefangshi_sendRequest(){

    }

    public Task21Kaohefangshi_sendRequest(String kechengid, String content, int zhanbi){
        this.kechengid = kechengid;
        this.content = content;
        this.zhanbi = zhanbi;
    }

    public Task21Kaohefangshi_sendRequest(String content, int zhanbi){
        this.content = content;
        this.zhanbi = zhanbi;
    }


    public String getKechengid(){
        return kechengid;
    }

    public void setKechengid(String kechengid){
        this.kechengid = kechengid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getZhanbi() {
        return zhanbi;
    }

    public void setZhanbi(int zhanbi) {
        this.zhanbi = zhanbi;
    }


}
