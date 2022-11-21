package com.example.test.datatype;

import java.util.ArrayList;
import java.util.List;

// 该类会以List的形式传递进RestResponse的data词条下
public class SearchTeacherResponse {
    String id;
    String name;
    String zhicheng;
    String yuanxi;

    public SearchTeacherResponse(String id, String name, String zhicheng, String yuanxi) {
        this.id = id;
        this.name = name;
        this.zhicheng = zhicheng;
        this.yuanxi = yuanxi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }
}


