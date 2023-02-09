package com.example.test.exception;


import com.example.test.datatype.RestResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    // 用户token过期
    @ExceptionHandler(value = TokenExpiredException.class)
    @ResponseBody
    public RestResponse tokenExpiredExceptionHandler() {
        System.out.println("token过期");
        return RestResponse.badToken("用户token过期");
    }

    // 用户token错误
    @ExceptionHandler(value = TokenIncorrectException.class)
    @ResponseBody
    public RestResponse tokenIncorrectExceptionHandler() {
        System.out.println("token错误");
        return RestResponse.badToken("用户token错误");
    }

}
