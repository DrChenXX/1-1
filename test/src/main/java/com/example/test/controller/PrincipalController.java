package com.example.test.controller;

import com.example.test.datatype.*;
import com.example.test.interfaces.UserController;
import com.example.test.model.service.PrincipalService;
import com.example.test.model.service.TeacherService;
import com.example.test.model.session.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home/principal")
public class PrincipalController implements UserController {

    @Autowired
    private PrincipalService principalService;
    @Autowired
    private SessionManager sessionManager;

    @Override
    public String name() {
        System.out.println("principalController");
        return "principalController";
    }

    @ResponseBody
    @RequestMapping(path = "/jiaoshiguanli", method = RequestMethod.POST)
    public RestResponse searchTeacher(@RequestHeader(value = "token",required = false) String token,@RequestBody SearchTeacherRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getPrincipalService().searchTeacher(request);
    }

    @ResponseBody
    @RequestMapping(path = "/xueshengguanli", method = RequestMethod.POST)
    public RestResponse searchXuesheng(@RequestBody SearchXueshengRequest request) {
        System.out.println(request);
        return principalService.searchXuesheng(request);
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
    @RequestMapping(path = "/peiyangmubiao", method = RequestMethod.POST)
    public RestResponse searchPeiyangmubiao(@RequestBody SearchPeiyangmubiaoRequest request) {
        System.out.println(request);
        return principalService.searchPeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangmubiaoadd", method = RequestMethod.POST)
    public void addPeiyangmubiao(@RequestBody AddPeiyangmubiaoRequest request) {
        System.out.println(request);
        principalService.addPeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangmubiaodelete", method = RequestMethod.POST)
    public void deletePeiyangmubiao(@RequestBody DeletePeiyangmubiaoRequest request) {
        System.out.println(request);
        principalService.deletePeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangmubiaoupdate", method = RequestMethod.POST)
    public void updatePeiyangmubiao(@RequestBody UpdatePeiyangmubiaoRequest request) {
        System.out.println(request);
        principalService.updatePeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/fankui", method = RequestMethod.POST)
    public RestResponse searchXianxi(@RequestBody SearchXiaoxiRequest request) {
        System.out.println(request);
        return principalService.searchXiaoxi(request);
    }

}
