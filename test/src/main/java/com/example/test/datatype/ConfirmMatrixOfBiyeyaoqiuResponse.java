package com.example.test.datatype;

public class ConfirmMatrixOfBiyeyaoqiuResponse{
    private String zhichengdian;
    private boolean zhicheng;

    public ConfirmMatrixOfBiyeyaoqiuResponse() {
    }

    public ConfirmMatrixOfBiyeyaoqiuResponse(String zhichengdian, boolean zhicheng) {
        this.zhichengdian = zhichengdian;
        this.zhicheng = zhicheng;

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

    @Override
    public String toString() {
        return "ConfirmMatrixOfBiyeyaoqiuResponse{" +
                "zhichengdian=" + zhichengdian+
                ", zhicheng='" + zhicheng + '\'' +
                '}';
    }
}
