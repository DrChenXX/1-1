package com.example.test.datatype;

public class ConfirmMatrixOfBiyeyaoqiuResponse {
    private String zhichengdian;
    private boolean zhicheng;
    //private List<ConfirmMatrixOfBiyeyaoqiuResponse> zhichengguanxi;

    public ConfirmMatrixOfBiyeyaoqiuResponse() {
    }

    public ConfirmMatrixOfBiyeyaoqiuResponse
    public ConfirmMatrixOfBiyeyaoqiuResponse(String zhichengdian, boolean zhicheng , List<ConfirmMatrixOfBiyeyaoqiuResponse> zhichengguanxi) {
        this.zhichengdian = zhichengdian;
        this.zhicheng = zhicheng;
        //this.zhichengguanxi = zhichengguanxi;
    }

    public String getZhichengdian() {
        return zhichengdian;
    }

    public void setZhichengdian(String zhichengdian) {
        this.zhichengdian = zhichengdian;
    }

    public boolean getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(boolean zhicheng) {
        this.zhicheng = zhicheng;
    }

//    public List<ConfirmMatrixOfBiyeyaoqiuResponse> getZhichengguanxi() {
//        return zhichengguanxi;
//    }
//
//    public void setZhibiaodian(List<SearchZhibiaodianResponse> zhibiaodian) {
//        this.zhibiaodian = zhibiaodian;
//    }

    @Override
    public String toString() {
        return "ConfirmMatrixOfBiyeyaoqiuResponse{" +
                "zhichengdian=" + zhichengdian+
                ", zhicheng='" + zhicheng + '\'' +
                '}';
    }
}
