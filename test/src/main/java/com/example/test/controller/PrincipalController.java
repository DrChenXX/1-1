package com.example.test.controller;

import com.example.test.interfaces.UserController;

public class PrincipalController implements UserController {


    @Override
    public String name() {
        System.out.println("principalController");
        return "principalController";
    }
}
