package com.example.test.model.service;

import com.example.test.datatype.LoginRequest;
import com.example.test.datatype.RestResponse;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.YonghuMgr;
import com.example.test.model.entity.Yonghu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeService implements UserService {
    @Autowired
    private YonghuMgr yonghuMgr;


    @Override
    public String name() {
        System.out.println("homeService");
        return  "homeService";
    }


    public RestResponse login(LoginRequest data) {
        Yonghu yonghu = yonghuMgr.getByID(data.getUsername());
        if(yonghu==null) {
            return new RestResponse().fail("错误的用户名");
        }
        String password = yonghu.getPassword();
        if (data.getPassword().equals(password)) {
            return new RestResponse().success("登陆成功");
        } else {
            return new RestResponse().fail("登陆失败");
        }
    }

}
