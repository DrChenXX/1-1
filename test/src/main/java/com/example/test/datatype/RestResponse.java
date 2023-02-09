package com.example.test.datatype;

import java.io.Serializable;

// 统一json返回接口
public class RestResponse<T> implements Serializable {

    private Integer status;
    private String msg;
    private T data;

    public RestResponse(){

    }

    public RestResponse(int status, String message) {
        this.setStatus(status);
        this.setMsg(message);
    }

    public RestResponse(int status, String message, T data) {
        this.setStatus(status);
        this.setMsg(message);
        this.setData(data);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RestResponse{" + "code=" + status + ", msg='" + msg + '\'' +", data=" + data +'}';
    }

    public static RestResponse success(String msg) {
        return new RestResponse(200,msg);
    }

    public static <T> RestResponse<T> success(String msg, T data) {
        return new RestResponse<T>(200,msg,data);
    }

    public static RestResponse fail(String msg) {
        return new RestResponse(500,msg);
    }

    public static <T> RestResponse<T> fail(String msg, T data) {
        return new RestResponse<T>(500,msg,data);
    }

    public static RestResponse badToken(String msg) {
        return new RestResponse(401,msg);
    }

    public static <T> RestResponse<T> badToken(String msg, T data) {
        return new RestResponse<T>(401,msg,data);
    }
}
