package com.example.test.controller;

import com.example.test.model.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @RequestMapping("/kechengrenwuliebiao")
    public String getRequestList(String kechengmingcheng, String kechengbianhao, String kaikexueqi, String peiyangfangan, String dangqianrenwu, String renwuzhuangtai) {
        return teacherService.getRequestList(kechengmingcheng,kechengbianhao,kaikexueqi,peiyangfangan,dangqianrenwu,renwuzhuangtai);
    }

}

