package com.example.test.datatype;

import java.util.List;

//重写中 未完成
public class SearchKaohefangshiResponse {
    private String mubiao;
    private int zhanbi;
    private String guanlian;

    public SearchBiyeyaoqiuResponse() {
    }

    public SearchBiyeyaoqiuResponse(String mubiao,int zhanbi,String guanlian) {
        this.mubiao = mubiao;
        this.zhanbi = zhanbi;
        this.guanlian = guanlian;
    }

    public int getMubiao() {
        return mubiao;
    }

    public void setMubiao(String mubiao) {
        this.mubiao = mubiao;
    }

    public String getZhanbi() {
        return zhanbi;
    }

    public void setZhanbi(int zhanbi) {
        this.zhanbi = zhanbi;
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
