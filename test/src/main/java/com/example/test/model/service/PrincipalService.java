package com.example.test.model.service;

import com.example.test.datatype.RestResponse;
import com.example.test.datatype.SearchTeacherRequest;
import com.example.test.datatype.SearchTeacherResponse;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.YonghuMgr;
import com.example.test.model.entity.Yonghu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("principalService")
public class PrincipalService implements UserService {

    @Autowired
    private YonghuMgr yonghuMgr;

    @Override
    public String name() {
        System.out.println("principalService");
        return "principalService";
    }

    public RestResponse searchTeacher(SearchTeacherRequest request) {
        List<Yonghu> teachers = yonghuMgr.getAll();
        System.out.println(teachers);
        List<SearchTeacherResponse> responses = new ArrayList<SearchTeacherResponse>();
        if (teachers == null) {
            return new RestResponse<>().fail("没有找到教师");
        }

        for (Yonghu teacher : teachers) {
            if (request.getId()!="") {
                if(!teacher.getId().equals(request.getId())) {
                    continue;
                }
            }
            if (request.getName()!="") {
                if(!teacher.getName().equals(request.getName())) {
                    continue;
                }
            }
            responses.add(new SearchTeacherResponse(teacher.getId(),teacher.getName(),"教授","信息科学与工程学院"));
        }

        if(!responses.isEmpty()) {
            return new RestResponse<>().success("找到了老师列表",responses);
        } else {
            return new RestResponse<>().fail("没有找到教师");
        }

    }


}
