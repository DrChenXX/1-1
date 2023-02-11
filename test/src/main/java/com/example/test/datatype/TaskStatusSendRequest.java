package com.example.test.datatype;

public class TaskStatusSendRequest {
    private String courseid;
    private String cur_task;
    private String task1_0;
    private String task1_1;
    private String task2;
    private String task3;
    private String task4;

    public TaskStatusSendRequest() {
    }

    public TaskStatusSendRequest(String courseid, String cur_task, String task1_0, String task1_1, String task2, String task3, String task4) {
        this.courseid = courseid;
        this.cur_task = cur_task;
        this.task1_0 = task1_0;
        this.task1_1 = task1_1;
        this.task2 = task2;
        this.task3 = task3;
        this.task4 = task4;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCur_task() {
        return cur_task;
    }

    public void setCur_task(String cur_task) {
        this.cur_task = cur_task;
    }

    public String getTask1_0() {
        return task1_0;
    }

    public void setTask1_0(String task1_0) {
        this.task1_0 = task1_0;
    }

    public String getTask1_1() {
        return task1_1;
    }

    public void setTask1_1(String task1_1) {
        this.task1_1 = task1_1;
    }

    public String getTask2() {
        return task2;
    }

    public void setTask2(String task2) {
        this.task2 = task2;
    }

    public String getTask3() {
        return task3;
    }

    public void setTask3(String task3) {
        this.task3 = task3;
    }

    public String getTask4() {
        return task4;
    }

    public void setTask4(String task4) {
        this.task4 = task4;
    }
}
