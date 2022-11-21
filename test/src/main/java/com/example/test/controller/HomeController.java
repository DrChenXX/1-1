package com.example.test.controller;


import com.example.test.datatype.LoginRequest;
import com.example.test.datatype.RestResponse;
import com.example.test.interfaces.UserController;
import com.example.test.interfaces.model.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @ResponseBody
    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public RestResponse login(LoginRequest request) {
        System.out.println(request);
        return homeService.login(request);
    }

    @RequestMapping(path = "hi", method = RequestMethod.GET)
    public String index() {
        return "hello world";
    }

}
