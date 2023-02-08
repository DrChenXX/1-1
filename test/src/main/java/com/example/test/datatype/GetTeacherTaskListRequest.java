package com.example.test.datatype;

//传入
//        [teacherid:string  //教师id]
//
//        传回
//        [
//        jiaoxuedagang1:int, //未提交的任务数量（教学大纲上传）
//        jiaoxuedagang0:int, //待审核的任务数量（教学大纲上传）
//        guanlian0:int, //未提交的任务数量（课程目标-考核方式关联）
//        guanlian1:int,//待审核的任务数量（课程目标-考核方式关联）
//        shijuanchuti0:int,//未提交的任务数量（试卷出题）
//        shijuanchuti1:int,//待审核的任务数量（试卷出题）
//        fenxibaogao0:int,未提交的任务数量（课程质量分析报告）
//        fenxibaogao1:int,//待审核的任务数量（课程质量分析报告）
//        ]
public class GetTeacherTaskListRequest {
    private String teacherid;

    public GetTeacherTaskListRequest(){

    }
    public GetTeacherTaskListRequest(String teacherid){
        this.teacherid = teacherid;
    }
    public String getTeacherid(){
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }
}
