package com.example.test.model.service;

import com.example.test.datatype.LoginRequest;
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

    public boolean login(LoginRequest data) {
        Yonghu yonghu = yonghuMgr.getByID(data.getUsername());
        if(yonghu==null) {
            return false;
        }
        String password = yonghu.getPassword();
        if (data.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

}
