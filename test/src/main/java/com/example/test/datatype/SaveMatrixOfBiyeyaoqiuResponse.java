package com.example.test.datatype;

import java.util.List;

//重写中 未完成
public class SaveMatrixOfBiyeyaoqiuResponse {
    private String kechengid;
    private List<String> mubiao;

    public SaveMatrixOfBiyeyaoqiuResponse() {
    }

    public SaveMatrixOfBiyeyaoqiuResponse(String kechengid,List<String> mubiao) {
        this.kechengid = kechengid;
        this.mubiao = mubiao;
    }

    public String getKechengid() {
        return kechengid;
    }

    public void setKechengid(String kechengid) {
        this.kechengid = kechengid;
    }
    public List<String> getMubiao() {
        return mubiao;
    }
    public void setMubiao(List<String> mubiao){
        this.mubiao = mubiao;
    }
    public void addMubiao(String mubiao) {
        this.mubiao.add(mubiao);
    }

    @Override
    public String toString() {
        return "SaveMatrixOfBiyeyaoqiuResponse{" +
                "kechengid=" + kechengid +
                "mubiao='" + mubiao + '\'' +
                '}';
    }
}
