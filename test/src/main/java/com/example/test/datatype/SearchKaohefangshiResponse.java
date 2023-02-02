package com.example.test.datatype;

public class SearchKaohefangshiResponse{
    private String mubiao;
    private int zhanbi;
    private String guanlian;

    public SearchKaohefangshiResponse() {
    }

    public SearchKaohefangshiResponse(String mubiao,int zhanbi,String guanlian) {
        this.mubiao = mubiao;
        this.zhanbi = zhanbi;
        this.guanlian = guanlian;
    }

    public String getMubiao() {
        return mubiao;
    }

    public void setMubiao(String mubiao) {
        this.mubiao = mubiao;
    }

    public int getZhanbi() {
        return zhanbi;
    }

    public void setZhanbi(int zhanbi) {
        this.zhanbi = zhanbi;
    }

    public String getGuanlian() {
        return guanlian;
    }

    public void setGuanlian(String guanlian) {
        this.guanlian = guanlian;
    }

    @Override
    public String toString() {
        return "SearchKaohefangshiResponse{" +
                "mubiao=" + mubiao +
                ",zhanbi=" + zhanbi +
                ",guanlian=" + guanlian + '\'' +
                '}';
    }
}
