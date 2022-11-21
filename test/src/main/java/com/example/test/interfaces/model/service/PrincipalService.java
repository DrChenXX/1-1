package com.example.test.interfaces.model.service;

import com.example.test.interfaces.UserService;
import org.springframework.stereotype.Service;

@Service("principalService")
public class PrincipalService implements UserService {

    @Override
    public String name() {
        System.out.println("principalService");
        return "principalService";
    }

}
