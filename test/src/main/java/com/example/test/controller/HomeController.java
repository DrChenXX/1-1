package com.example.test.controller;


import com.example.test.datatype.LoginRequest;
import com.example.test.datatype.RestResponse;
import com.example.test.interfaces.UserController;
import com.example.test.model.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


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
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public RestResponse login(@RequestBody LoginRequest request) {
        System.out.println(request);
        return homeService.login(request);
    }

    @RequestMapping(path = "hi", method = RequestMethod.POST)
    public String index() {
        return "hello world";
    }

}
