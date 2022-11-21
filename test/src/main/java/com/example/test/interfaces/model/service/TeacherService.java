package com.example.test.interfaces.model.service;

import com.example.test.interfaces.UserService;
import org.springframework.stereotype.Service;


@Service("teacherService")
public class TeacherService implements UserService {

    @Override
    public String name() {
        System.out.println("teacherService");
        return "teacherService";
    }

    public String getRequestList(String kechengmingcheng, String kechengbianhao, String kaikexueqi, String peiyangfangan, String dangqianrenwu, String renwuzhuangtai){
        return "";
    }

}
