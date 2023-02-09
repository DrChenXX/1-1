package com.example.test.datatype;

import java.util.List;

public class UpdateKechengkaoheRequest {

    private String kechengid;
    private String content;
    private int zhanbi;
    private List<UpdateKechengkaoheRequest> kechengkaohes;


    public UpdateKechengkaoheRequest(){

    }

    public UpdateKechengkaoheRequest(String kechengid,String content,int zhanbi){
        this.kechengid = kechengid;
        this.content = content;
        this.zhanbi = zhanbi;
    }

    public UpdateKechengkaoheRequest(String content,int zhanbi){
        this.content = content;
        this.zhanbi = zhanbi;
    }

    public UpdateKechengkaoheRequest(List<UpdateKechengkaoheRequest> kechengkaohes){
        this.kechengkaohes = kechengkaohes;
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

    public void setKechengkaohes(List<UpdateKechengkaoheRequest> kechengkaohes) {
        this.kechengkaohes = kechengkaohes;
    }

}
