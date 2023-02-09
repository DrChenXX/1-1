package com.example.test.model.service;

import com.example.test.datatype.LoginRequest;
import com.example.test.datatype.LoginResponse;
import com.example.test.datatype.RestResponse;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.YonghuMgr;
import com.example.test.model.entity.Yonghu;
import com.example.test.model.session.SessionManager;
import com.example.test.tool.TokenTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("homeService")
public class HomeService implements UserService {
    @Autowired
    private YonghuMgr yonghuMgr;
    @Autowired
    private TokenTool tokenTool;
    @Autowired
    private SessionManager sessionManager;


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
        String userRole = yonghu.getType();
        if (data.getPassword().equals(password)) {
            String token = tokenTool.getToken(data.getUsername()
                    ,userRole);
            // 更新数据库中的token
            yonghuMgr.updateTokenByID(data.getUsername(),token);
            System.out.println("已更新数据库中的token");
            // 创建会话对象
            if (!sessionManager.checkSession(token)) {
                // 如果会话管理器中没有对应的会话，则创建一个
                sessionManager.addSession(token,token,userRole);
                System.out.println("已创建会话对象");
            }
            LoginResponse loginResponse = new LoginResponse(token, userRole);
            return new RestResponse().success("登陆成功" , loginResponse);
        } else {
            return new RestResponse().fail("登陆失败");
        }
    }

}
