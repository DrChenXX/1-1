package com.example.test.model.service;

import com.example.test.interfaces.UserService;
import org.springframework.stereotype.Service;


@Service("homeService")
public class HomeService implements UserService {


    @Override
    public String name() {
        System.out.println("homeService");
        return  "homeService";
    }


}
