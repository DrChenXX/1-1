package com.example.test.controller;


import com.example.test.interfaces.UserController;
import com.example.test.model.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController implements UserController {

    @Autowired
    private HomeService homeService;

    @Override
    public String name() {
        System.out.println("homeController");
        return "homeController";
    }
}
