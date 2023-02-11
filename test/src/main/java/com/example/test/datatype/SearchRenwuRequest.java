package com.example.test.datatype;

public class SearchRenwuRequest {
    private String userid;
    private String yeshu;
    private String zhuanye;
    private String zhuanyeID;
    private String peiyangfangan;
    private String xueqi;
    private String kecheng;
    private String kechengID;
    private String kaikenianji;
    private String kechengleibie;
    private String fabu;

    public SearchRenwuRequest() {
    }

    public SearchRenwuRequest(String userid, String yeshu, String zhuanye,
                              String zhuanyeID, String peiyangfangan, String xueqi,
                              String kecheng, String kechengID, String kaikenianji,
                              String kechengleibie, String fabu) {
        this.userid = userid;
        this.zhuanye = zhuanye;
        this.zhuanyeID = zhuanyeID;
        this.peiyangfangan = peiyangfangan;
        this.xueqi = xueqi;
        this.kecheng = kecheng;
        this.kechengID = kechengID;
        this.kaikenianji = kaikenianji;
        this.kechengleibie = kechengleibie;
        this.fabu = fabu;
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

    public String getZhuanyeID() {
        return zhuanyeID;
    }

    public void setZhuanyeID(String zhuanyeID) {
        this.zhuanyeID = zhuanyeID;
    }

    public String getPeiyangfangan() {
        return peiyangfangan;
    }

    public void setPeiyangfangan(String peiyangfangan) {
        this.peiyangfangan = peiyangfangan;
    }

    public String getXueqi() {
        return xueqi;
    }

    public void setXueqi(String xueqi) {
        this.xueqi = xueqi;
    }

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng;
    }

    public String getKechengID() {
        return kechengID;
    }

    public void setKechengID(String kechengID) {
        this.kechengID = kechengID;
    }

    public String getKaikenianji() {
        return kaikenianji;
    }

    public void setKaikenianji(String kaikenianji) {
        this.kaikenianji = kaikenianji;
    }

    public String getKechengleibie() {
        return kechengleibie;
    }

    public void setKechengleibie(String kechengleibie) {
        this.kechengleibie = kechengleibie;
    }

    public String getFabu() {
        return fabu;
    }

    public void setFabu(String fabu) {
        this.fabu = fabu;
    }

    @Override
    public String toString() {
        return "SearchRenwuRequest{" +
                "userid='" + userid + '\'' +
                ", yeshu='" + yeshu + '\'' +
                ", zhuanye='" + zhuanye + '\'' +
                ", zhuanyeID='" + zhuanyeID + '\'' +
                ", peiyangfangan='" + peiyangfangan + '\'' +
                ", xueqi='" + xueqi + '\'' +
                ", kecheng='" + kecheng + '\'' +
                ", kechengID='" + kechengID + '\'' +
                ", kaikenianji='" + kaikenianji + '\'' +
                ", kechengleibie='" + kechengleibie + '\'' +
                ", fabu='" + fabu + '\'' +
                '}';
    }
}
