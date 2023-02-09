package com.example.test.model.service;

import com.example.test.datatype.LoginRequest;
import com.example.test.datatype.LoginResponse;
import com.example.test.datatype.RestResponse;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.YonghuMgr;
import com.example.test.model.entity.Yonghu;
import com.example.test.tool.TokenTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeService implements UserService {
    @Autowired
    private YonghuMgr yonghuMgr;
    @Autowired
    private TokenTool tokenTool;


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
        if (data.getPassword().equals(password)) {;
            String token = tokenTool.getToken(data.getUsername()
                    ,yonghu.getType());
            yonghuMgr.updateTokenByID(data.getUsername(),token);
            LoginResponse loginResponse = new LoginResponse(token, yonghu.getType());
            return new RestResponse().success("登陆成功" , loginResponse);
        } else {
            return new RestResponse().fail("登陆失败");
        }
    }

}
