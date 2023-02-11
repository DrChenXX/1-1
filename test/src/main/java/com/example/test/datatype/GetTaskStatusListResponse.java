package com.example.test.datatype;

public class GetTaskStatusListResponse {
    private int cur_task;// 取值0，1，2，3，4   当前正在处理哪个任务，初始时为1
    // 0：所有任务均已处理完毕 1：教学大纲上传 2:课程目标-考核方式关联 3:试卷出题 4:课程质量分析报告上传
    private int task1_0; // 取值 0，1 ，2，3，4
    // 0: 教学大纲上传任务中的毕业要求矩阵未确认 1：毕业要求矩阵已经确认，且无反馈意见
    // 2：查看了毕业要求矩阵且提出反馈意见，处于专业负责人审核阶段 3：专业负责人审核不通过（需传回审核意见）4：专业负责人审核通过

    private int task1_1; // 取值 0，1，2，3
    //  0：未完成教学大纲任务全部步骤 1：已完成教学大纲任务全部步骤，处于专业负责人审核阶段 2：专业负责人审核不通过（需传回审核意见）
    //  3：专业负责人审核通过（此时cur_task设为2）
    private int task2; // 取值 0，1，2，3 `
//  0：未完成课程目标-考核方式关联全部步骤 1：已完成课程目标-考核方式关联全部步骤，处于专业负责人审核阶段
//  2：专业负责人审核不通过（需传回审核意见） 3：专业负责人审核通过（此时cur_task设为3）

    private int task3;// 取值 0，1，2，3
//  0：未完成试卷出题全部步骤 1：已完成试卷出题全部步骤，处于专业负责人审核阶段 2：专业负责人审核不通过（需传回审核意见）
//  3：专业负责人审核通过（此时cur_task设为4）

    private int task4;// 取值 0，1，2，3
//  0：未完成课程质量分析报告上传全部步骤 1：已完成课程质量分析报告上传全部步骤，处于专业负责人审核阶段
//  2：专业负责人审核不通过（需传回审核意见） 3：专业负责人审核通过（此时cur_task设为0）

    public GetTaskStatusListResponse(){
        cur_task = 1;
        task1_0 = 0;
        task1_1 = 0;
        task2 =  0;
        task3 = 0;
        task4 = 0;
    }

    public GetTaskStatusListResponse(int cur_task,int task1_0,int task1_1,int task2,int task3,int task4){
         this.cur_task = cur_task;
         this.task1_0 = task1_0;
         this.task1_1 = task1_1;
         this.task2 = task2;
         this.task3 = task3;
         this.task4 = task4;
    }

    public int getTask1_0() {
        return task1_0;
    }

    public int getTask1_1() {
        return task1_1;
    }

    public int getTask2() {
        return task2;
    }

    public int getTask3() {
        return task3;
    }

    public int getTask4() {
        return task4;
    }

    public int getCur_task() {
        return cur_task;
    }

    public void setTask1_0(int task1_0) {
        this.task1_0 = task1_0;
    }

    public void setTask1_1(int task1_1) {
        this.task1_1 = task1_1;
    }

    public void setTask2(int task2) {
        this.task2 = task2;
    }

    public void setTask3(int task3) {
        this.task3 = task3;
    }

    public void setTask4(int task4) {
        this.task4 = task4;
    }

    public void setCur_task(int cur_task) {
        this.cur_task = cur_task;
    }
}

