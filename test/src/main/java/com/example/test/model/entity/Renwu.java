package com.example.test.model.entity;

public class Renwu {
    /**
     * table name:ID
     * table type:varchar(10)
     * table comment:null
     */
    private String id;

    /**
     * table name:KECHENG
     * table type:varchar(20)
     * table comment:null
     */
    private String kecheng;//这里的课程都对应当前课程

    /**
     * table name:KECHENG_ID
     * table type:varchar(10)
     * table comment:null
     */
    private String kechengId;

    /**
     * table name:XUEFEN
     * table type:varchar(10)
     * table comment:null
     */
    private String xuefen;

    /**
     * table name:LEIBIE
     * table type:varchar(20)
     * table comment:null
     */
    private String leibie;

    /**
     * table name:RENKELAOSHI
     * table type:varchar(20)
     * table comment:null
     */
    private String renkelaoshi;

    /**
     * table name:RENKELAOSHI_ID
     * table type:varchar(10)
     * table comment:null
     */
    private String renkelaoshiId;

    /**
     * table name:YUANXI
     * table type:varchar(20)
     * table comment:null
     */
    private String yuanxi;

    /**
     * table name:NIANJI
     * table type:varchar(10)
     * table comment:null
     */
    private String nianji;

    /**
     * table name:FABU
     * table type:varchar(10)
     * table comment:null
     */
    private String fabu;

    /**
     * table name:FUZERENID
     * table type:varchar(10)
     * table comment:null
     */
    private String fuzerenId;

    /**
     * table name:ZHUANYE
     * table type:varchar(20)
     * table comment:null
     */
    private String zhuanye;

    /**
     * table name:ZHUANYE_ID
     * table type:varchar(10)
     * table comment:null
     */
    private String zhuanyeId;

    /**
     * table name:PEIYANGFANGAN
     * table type:varchar(10)
     * table comment:null
     */
    private String peiyangfangan;

    /**
     * table name:XUEQI
     * table type:varchar(10)
     * table comment:null
     */
    private String xueqi;

    public Renwu() {
    }

    public Renwu(String id, String kecheng, String kechengId,
                 String xuefen, String leibie, String renkelaoshi,
                 String renkelaoshiId,
                 String yuanxi, String nianji, String fabu,
                 String fuzerenId, String zhuanye, String zhuanyeId,
                 String peiyangfangan, String xueqi) {
        this.id = id;
        this.kecheng = kecheng;
        this.kechengId = kechengId;
        this.xuefen = xuefen;
        this.leibie = leibie;
        this.renkelaoshi = renkelaoshi;
        this.renkelaoshiId = renkelaoshiId;
        this.yuanxi = yuanxi;
        this.nianji = nianji;
        this.fabu = fabu;
        this.fuzerenId = fuzerenId;
        this.zhuanye = zhuanye;
        this.zhuanyeId = zhuanyeId;
        this.peiyangfangan = peiyangfangan;
        this.xueqi = xueqi;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng;
    }

    public String getKechengId() {
        return kechengId;
    }

    public void setKechengId(String kechengId) {
        this.kechengId = kechengId;
    }

    public String getXuefen() {
        return xuefen;
    }

    public void setXuefen(String xuefen) {
        this.xuefen = xuefen;
    }

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
    }

    public String getRenkelaoshi() {
        return renkelaoshi;
    }

    public void setRenkelaoshi(String renkelaoshi) {
        this.renkelaoshi = renkelaoshi;
    }

    public String getRenkelaoshiId() {
        return renkelaoshiId;
    }

    public void setRenkelaoshiId(String renkelaoshiId) {
        this.renkelaoshiId = renkelaoshiId;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getNianji() {
        return nianji;
    }

    public void setNianji(String nianji) {
        this.nianji = nianji;
    }

    public String getFabu() {
        return fabu;
    }

    public void setFabu(String fabu) {
        this.fabu = fabu;
    }

    public String getFuzerenId() {
        return fuzerenId;
    }

    public void setFuzerenId(String fuzerenId) {
        this.fuzerenId = fuzerenId;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getZhuanyeId() {
        return zhuanyeId;
    }

    public void setZhuanyeId(String zhuanyeId) {
        this.zhuanyeId = zhuanyeId;
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

    @Override
    public String toString() {
        return "Renwu{" +
                "id='" + id + '\'' +
                ", kecheng='" + kecheng + '\'' +
                ", kechengId='" + kechengId + '\'' +
                ", xuefen='" + xuefen + '\'' +
                ", leibie='" + leibie + '\'' +
                ", renkelaoshi='" + renkelaoshi + '\'' +
                ", renkelaoshiId='" + renkelaoshiId + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", nianji='" + nianji + '\'' +
                ", fabu='" + fabu + '\'' +
                ", fuzerenId='" + fuzerenId + '\'' +
                ", zhuanye='" + zhuanye + '\'' +
                ", zhuanyeId='" + zhuanyeId + '\'' +
                ", peiyangfangan='" + peiyangfangan + '\'' +
                ", xueqi='" + xueqi + '\'' +
                '}';
    }
}
