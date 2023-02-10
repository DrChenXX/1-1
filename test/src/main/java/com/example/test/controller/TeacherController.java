package com.example.test.controller;

import com.example.test.datatype.*;
import com.example.test.interfaces.UserController;
import com.example.test.model.service.TeacherService;
import com.example.test.model.session.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home/teacher")
public class TeacherController implements UserController {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private SessionManager sessionManager;


    @Override
    public String name(){
        System.out.println("teacherController");
        return "teacherController";
    }

    @RequestMapping("/kechengrenwuliebiao")
    public String getRequestList(String kechengmingcheng, String kechengbianhao, String kaikexueqi, String peiyangfangan, String dangqianrenwu, String renwuzhuangtai) {
        return teacherService.getRequestList(kechengmingcheng,kechengbianhao,kaikexueqi,peiyangfangan,dangqianrenwu,renwuzhuangtai);
    }

    //上传课程目标-指标点支撑矩阵
    @ResponseBody
    @RequestMapping(path = "/Kechengduizhibiaodian/ConfirmMatrixOfBiyeyaoqiu", method = RequestMethod.POST)
    public RestResponse confirmMatrixOfBiyeyaoqiu(@RequestHeader(value = "token",required = false)String token,@RequestBody ConfirmMatrixOfBiyeyaoqiuRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().confirmMatrixOfBiyeyaoqiu(request);

    }
    //获取课程目标-指标点支撑矩阵
    @ResponseBody
    @RequestMapping(path = "/Kechengduizhibiaodian/SaveMatrixOfBiyeyaoqiu", method = RequestMethod.POST)
    public RestResponse saveMatrixOfBiyeyaoqiu(@RequestHeader(value = "token",required = false)String token,@RequestBody SaveMatrixOfBiyeyaoqiuRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().saveMatrixOfBiyeyaoqiu(request);
    }
//    @ResponseBody
//    @RequestMapping(path = "/GetTeacherTaskList", method = RequestMethod.POST)
//    public RestResponse GetTeacherTaskList(@RequestBody GetTeacherTaskListRequest request) {
//        System.out.println(request);
//        return teacherService.Get(request);
//    }
    //搜索课程考核方式
    @ResponseBody
    @RequestMapping(path = "/Kechengmubiao", method = RequestMethod.POST)
    public RestResponse searchKaohefangshi(@RequestHeader(value = "token",required = false)String token,@RequestBody SearchKaohefangshiRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().searchKaohefangshi(request);
    }
    @ResponseBody
    @RequestMapping(path = "/Renwuliebiao", method = RequestMethod.POST)
    public RestResponse getTaskStatusList(@RequestHeader(value = "token",required = false)String token,@RequestBody GetTaskStatusListRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().getTaskStatusList(request);
    }
}

