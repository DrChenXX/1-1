package com.example.test.datatype;

public class GetTeacherTaskListResponse {
    private int jiaoxuedagang1;//未提交的任务数量（教学大纲上传）
    private int jiaoxuedagang0;//待审核的任务数量（教学大纲上传）
    private int guanlian0;//未提交的任务数量（课程目标-考核方式关联）
    private int guanlian1;//待审核的任务数量（课程目标-考核方式关联）
    private int shijuanchuti0;//未提交的任务数量（试卷出题）
    private int shijuanchuti1;//待审核的任务数量（试卷出题
    private int fenxibaogao0;//未提交的任务数量（课程质量分析报告）
    private int fenxibaogao1;//待审核的任务数量（课程质量分析报告）

    public int getJiaoxuedagang0(){
        return this.jiaoxuedagang0;
    }
    public void setJiaoxuedagang0(int jiaoxuedagang0) {
        this.jiaoxuedagang0 = jiaoxuedagang0;
    }
    public void addJiaoxuedagang0(){
        this.jiaoxuedagang0++;
    }

    public int getJiaoxuedagang1() {
        return jiaoxuedagang1;
    }

    public void setJiaoxuedagang1(int jiaoxuedagang1) {
        this.jiaoxuedagang1 = jiaoxuedagang1;
    }
    public void addJiaoxuedagang1(){
        this.jiaoxuedagang1++;
    }

    public int getFenxibaogao0() {
        return fenxibaogao0;
    }

    public void setFenxibaogao0(int fenxibaogao0) {
        this.fenxibaogao0 = fenxibaogao0;
    }
    public void addFenxibaogao0(){
        this.fenxibaogao0++;
    }

    public int getFenxibaogao1() {
        return fenxibaogao1;
    }

    public void setFenxibaogao1(int fenxibaogao1) {
        this.fenxibaogao1 = fenxibaogao1;
    }

    public int getGuanlian0() {
        return guanlian0;
    }

    public void setGuanlian0(int guanlian0) {
        this.guanlian0 = guanlian0;
    }

    public int getGuanlian1() {
        return guanlian1;
    }

    public void setGuanlian1(int guanlian1) {
        this.guanlian1 = guanlian1;
    }

    public int getShijuanchuti0() {
        return shijuanchuti0;
    }

    public void setShijuanchuti0(int shijuanchuti0) {
        this.shijuanchuti0 = shijuanchuti0;
    }

    public int getShijuanchuti1() {
        return shijuanchuti1;
    }

    public void setShijuanchuti1(int shijuanchuti1) {
        this.shijuanchuti1 = shijuanchuti1;
    }
}
