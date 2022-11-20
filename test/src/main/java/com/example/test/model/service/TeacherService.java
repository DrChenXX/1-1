package com.example.test.model.service;

import org.springframework.stereotype.Service;


@Service("teacherService")
public class TeacherService {

    public String name() {
        System.out.println("teacherService");
        return "teacherService";
    }

    public String getRequestList(String kechengmingcheng, String kechengbianhao, String kaikexueqi, String peiyangfangan, String dangqianrenwu, String renwuzhuangtai){
        return "";
    }

}
