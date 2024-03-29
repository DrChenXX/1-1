package com.example.test.datatype;

public class SearchPeiyangfanganRequest {
    private String userid;

    private String yeshu;

    private String zhuanye;

    private String yuanxi;

    private String xianxing;

    private String jindu;

    public SearchPeiyangfanganRequest() {
    }

    public SearchPeiyangfanganRequest(String userid, String yeshu,String zhuanye, String yuanxi, String xianxing, String jindu) {
        this.userid = userid;
        this.yeshu = yeshu;
        this.zhuanye = zhuanye;
        this.yuanxi = yuanxi;
        this.xianxing = xianxing;
        this.jindu = jindu;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getYeshu() {
        return yeshu;
    }

    public void setYeshu(String yeshu) {
        this.yeshu = yeshu;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getXianxing() {
        return xianxing;
    }

    public void setXianxing(String xianxing) {
        this.xianxing = xianxing;
    }

    public String getJindu() {
        return jindu;
    }

    public void setJindu(String jindu) {
        this.jindu = jindu;
    }

    @Override
    public String toString() {
        return "SearchPeiyangfanganRequest{" +
                "userid='" + userid + '\'' +
                ", yeshu='" + yeshu + '\'' +
                ", zhuanye='" + zhuanye + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", xianxing='" + xianxing + '\'' +
                ", jindu='" + jindu + '\'' +
                '}';
    }
}
