package com.example.test.datatype;

import java.util.List;

public class Task14SendBodyRequest {
    private String courseid;
    private String kechengmubiao ;

    private List<Boolean> is_zhicheng;

    public Task14SendBodyRequest(){

    }

    public Task14SendBodyRequest(String courseid,String kechengmubiao,List<Boolean> is_zhicheng){
        this.courseid = courseid;
        this.kechengmubiao = kechengmubiao;
        this.is_zhicheng = is_zhicheng;
    }
    public void setKechengmubiao(String kechengmubiao) {
        this.kechengmubiao = kechengmubiao;
    }

    public String getKechengmubiao() {
        return kechengmubiao;
    }

    public void setIs_zhicheng(List<Boolean> is_zhicheng) {
        this.is_zhicheng = is_zhicheng;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public List<Boolean> getIs_zhicheng() {
        return is_zhicheng;
    }

}
