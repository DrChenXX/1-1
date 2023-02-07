package com.example.test.controller;

import com.example.test.datatype.*;
import com.example.test.interfaces.UserController;
import com.example.test.model.service.PrincipalService;
import com.example.test.model.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home/principal")
public class PrincipalController implements UserController {

    @Autowired
    private PrincipalService principalService;

    @Override
    public String name() {
        System.out.println("principalController");
        return "principalController";
    }

    @ResponseBody
    @RequestMapping(path = "/jiaoshiguanli", method = RequestMethod.POST)
    public RestResponse searchTeacher(@RequestBody SearchTeacherRequest request) {
        System.out.println(request);
        return principalService.searchTeacher(request);
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangmubiao", method = RequestMethod.POST)
    public RestResponse searchPeiyangfangan(@RequestBody SearchPeiyangmubiaoRequest request) {
        System.out.println(request);
        return principalService.searchPeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/biyeyaoqiu", method = RequestMethod.POST)
    public RestResponse searchBiyeyaoqiu(@RequestBody SearchBiyeyaoqiuRequest request) {
        System.out.println(request);
        return principalService.searchBiyeyaoqiu(request);
    }

    @RequestMapping(path = "hi", method = RequestMethod.GET)
    public String index() {
        return "hello world";
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangfangan", method = RequestMethod.POST)
    public RestResponse searchPeiyangfangan(@RequestBody SearchPeiyangfanganRequest request) {
        System.out.println(request);
        return principalService.searchPeiyangfangan(request);
    }

    @ResponseBody
    @RequestMapping(path = "/fankui", method = RequestMethod.POST)
    public RestResponse searchXianxi(@RequestBody SearchXiaoxiRequest request) {
        System.out.println(request);
        return principalService.searchXiaoxi(request);
    }


}
