package com.example.test.datatype;

public class GetTaskStatusListRequest {
    private String kechengid;

    public GetTaskStatusListRequest(){

    }

    public GetTaskStatusListRequest(String kechengid){
        this.kechengid = kechengid;
    }

    public void setKechengid(String kechengid) {
        this.kechengid = kechengid;
    }

    public String getKechengid() {
        return kechengid;
    }
}
