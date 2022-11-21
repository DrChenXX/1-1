package com.example.test.model.service;

import com.example.test.datatype.*;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.PeiyangmubiaoMgr;
import com.example.test.model.dao.logic.YonghuMgr;
import com.example.test.model.entity.Peiyangmubiao;
import com.example.test.model.entity.Yonghu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("principalService")
public class PrincipalService implements UserService {

    @Autowired
    private YonghuMgr yonghuMgr;
    @Autowired
    private PeiyangmubiaoMgr peiyangmubiaoMgr;

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

    public RestResponse searchPeiyangmubiao(SearchPeiyangmubiaoRequest request) {
        List<Peiyangmubiao> peiyangmubiaos = peiyangmubiaoMgr.getByPEIYANGFANGANID(request.getPeiyangfangan());
        if (peiyangmubiaos.isEmpty()) {
            return new RestResponse().fail("没有找到对应培养目标");
        }
        List<SearchPeiyangfanganResponse> responses = new ArrayList<SearchPeiyangfanganResponse>();
        int n = 1;
        for (Peiyangmubiao peiyangmubiao : peiyangmubiaos) {
            responses.add(new SearchPeiyangfanganResponse(n,peiyangmubiao.getContent()));
            n++;
        }
        return new RestResponse().success("已找到对应的培养目标",responses);
    }

    public RestResponse searchBiyeyaoqiu(SearchBiyeyaoqiuRequest request) {
        return null;
    }



}
