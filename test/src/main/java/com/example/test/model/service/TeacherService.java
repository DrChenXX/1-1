package com.example.test.model.service;

import com.example.test.datatype.RestResponse;
import com.example.test.datatype.SearchPeiyangmubiaoRequest;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.BiyeyaoqiuMgr;
import com.example.test.model.dao.logic.DangqiankechengMgr;
import com.example.test.model.dao.logic.PeiyangmubiaoMgr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("teacherService")
public class TeacherService implements UserService {

    @Autowired
    private PeiyangmubiaoMgr peiyangmubiaoMgr;
    @Autowired
    private BiyeyaoqiuMgr biyeyaoqiuMgr;
    @Override
    public String name() {
        System.out.println("teacherService");
        return "teacherService";
    }

    public String getRequestList(String kechengmingcheng, String kechengbianhao, String kaikexueqi, String peiyangfangan, String dangqianrenwu, String renwuzhuangtai){
        return "";
    }



}
