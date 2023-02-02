package com.example.test.datatype;

import java.util.List;

//重写中 未完成
public class DownloadZhibiaodianResponse {
    private String zhichengdian;
    private boolean is_zhicheng;
    private String xiugai;
    private String yijian;

    public DownloadZhibiaodianResponse() {
    }

    public DownloadZhibiaodianResponse(String zhichengdian,boolean is_zhicheng,String xiugai,String yijian) {
        this.zhichengdian = zhichengdian;
        this.is_zhicheng = is_zhicheng;
        this.xiugai = xiugai;
        this.yijian = yijian;
    }

    public String getZhichengdian() {
        return zhichengdian;
    }

    public void setZhichengdian(String zhichengdian) {
        this.zhichengdian = zhichengdian;
    }

    public boolean getIs_zhicheng() {
        return is_zhicheng;
    }

    public void setIs_zhicheng(boolean) {
        this.is_zhicheng = is_zhicheng;
    }

    public String getXiugai() {
        return xiugai;
    }

    public void setXiugai(String xiugai){
        this.xiugai = xiugai;
    }

    public String getYijian() {
        return  yijian;
    }

    public void setYijian(String yijian) {
        this.yijian = yijian;
    }

    @Override
    public String toString() {
        return "DownloadZhibiaodianResponse{" +
                "zhichengdian=" + zhichengdian +
                ", is_zhicheng='" + is_zhicheng +
                ", xiugai=" + xiugai +
                ", yijian=" + yijian '\'' +
                '}';
    }

}
