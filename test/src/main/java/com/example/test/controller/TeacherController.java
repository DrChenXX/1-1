package com.example.test.controller;

import com.example.test.datatype.*;
import com.example.test.interfaces.UserController;
import com.example.test.model.service.TeacherService;
import com.example.test.model.session.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /*
    @ResponseBody
    @RequestMapping(path = "/Renwuliebiao", method = RequestMethod.POST)
    public RestResponse getTaskStatusList(@RequestHeader(value = "token",required = false)String token,@RequestBody GetTaskStatusListRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().getTaskStatusList(request);
    }

    */

//    @ResponseBody
//    @RequestMapping(path = "/Kechengkaohe", method = RequestMethod.POST)
//    public void updateKechengkaohe(@RequestHeader(value = "token",required = false)String token,@RequestBody Task21Kaohefangshi_getRequest request) {
//        System.out.println(request);
//        sessionManager.getSession(token).getTeacherService().updateKechengkaohe(request);
//    }

    @ResponseBody
    @RequestMapping(path = "/Peiyangmubiao", method = RequestMethod.POST)
    public RestResponse uploadZhibiaodian(@RequestHeader(value = "token",required = false)String token,@RequestBody UploadZhibiaodianRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().uploadZhibiaodian(request);
    }

    @ResponseBody
    @RequestMapping(path = "/task1-1feedback_get", method = RequestMethod.POST)
    public RestResponse task11feedback_get(@RequestHeader(value = "token",required = false)String token,@RequestBody Task11FeedbackGetRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().task11feedback_get(request);
    }

    @ResponseBody
    @RequestMapping(path = "/task1-1feedback_send", method = RequestMethod.POST)
    public RestResponse task11feedback_send(@RequestHeader(value = "token",required = false)String token,@RequestBody List<Task11FeedbackSendRequest> requests) {
        System.out.println(requests);
        return sessionManager.getSession(token).getTeacherService().task11feedback_send(requests);
    }
    
    @ResponseBody
    @RequestMapping(path = "/task1-3_send", method = RequestMethod.POST)
    public void task13kechengmubiao_sendRequest(@RequestHeader(value = "token",required = false)String token,@RequestBody List<Task13Kechengmubiao_sendRequest> requests) {
        System.out.println(requests);
        sessionManager.getSession(token).getTeacherService().task13Kechengmubiao_send(requests);
    }
    
    @ResponseBody
    @RequestMapping(path = "/task1-3_get", method = RequestMethod.POST)
    public void task13kechengmubiao_getRequest(@RequestHeader(value = "token",required = false)String token,@RequestBody Task13Kechengmubiao_getRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getTeacherService().task13Kechengmubiao_get(request);
    }

    @ResponseBody
    @RequestMapping(path = "/task2-1_get", method = RequestMethod.POST)
    public RestResponse task21kaohefangshi_getRequest(@RequestHeader(value = "token",required = false)String token,@RequestBody Task21Kaohefangshi_getRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().task21kaohefangshi_get(request);
    }

    @ResponseBody
    @RequestMapping(path = "/task2-1_send", method = RequestMethod.POST)
    public void task21kaohefangshi_sendRequest(@RequestHeader(value = "token",required = false)String token,@RequestBody List<Task21Kaohefangshi_sendRequest> requests) {
        System.out.println(requests);
        sessionManager.getSession(token).getTeacherService().task21kaohefangshi_send(requests);
    }

    @ResponseBody
    @RequestMapping(path = "/task_status_send", method = RequestMethod.POST)
    public void taskStatusSend(@RequestHeader(value = "token",required = false)String token,@RequestBody TaskStatusSendRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getTeacherService().taskStatusSend(request);
    }

    @ResponseBody
    @RequestMapping(path = "task_status_get", method = RequestMethod.POST)
    public RestResponse taskStatusGet(@RequestHeader(value = "token",required = false)String token,@RequestBody TaskStatusGetRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getTeacherService().taskStatusGet(request);
    }

}

