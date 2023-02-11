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
    @RequestMapping(path = "/tianjiajiaoshi", method = RequestMethod.POST)
    public void addTeacher(@RequestHeader(value = "token",required = false) String token,@RequestBody AddTeacherRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().addTeacher(request);
    }

    @ResponseBody
    @RequestMapping(path = "/bianjijiaoshi", method = RequestMethod.POST)
    public void updateTeacher(@RequestHeader(value = "token",required = false) String token,@RequestBody UpdateTeacherRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().updateTeacher(request);
    }

    @ResponseBody
    @RequestMapping(path = "/xueshengguanli", method = RequestMethod.POST)
    public RestResponse searchXuesheng(@RequestHeader(value = "token",required = false)String token,@RequestBody SearchXueshengRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getPrincipalService().searchXuesheng(request);
    }

    @ResponseBody
    @RequestMapping(path = "/tianjiaxuesheng", method = RequestMethod.POST)
    public void addXuesheng(@RequestHeader(value = "token",required = false) String token,@RequestBody AddXueshengRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().addXuesheng(request);
    }

    @ResponseBody
    @RequestMapping(path = "/bianjixuesheng", method = RequestMethod.POST)
    public void updateXuesheng(@RequestHeader(value = "token",required = false) String token,@RequestBody UpdateXueshengRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().updateXuesheng(request);
    }

    @ResponseBody
    @RequestMapping(path = "/biyeyaoqiu", method = RequestMethod.POST)
    public RestResponse searchBiyeyaoqiu(@RequestHeader(value = "token",required = false)String token,@RequestBody SearchBiyeyaoqiuRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getPrincipalService().searchBiyeyaoqiu(request);
    }

    @RequestMapping(path = "hi", method = RequestMethod.GET)
    public String index() {
        return "hello world";
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangfangan", method = RequestMethod.POST)
    public RestResponse searchPeiyangfangan(@RequestHeader(value = "token",required = false)String token,@RequestBody SearchPeiyangfanganRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getPrincipalService().searchPeiyangfangan(request);
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangmubiao", method = RequestMethod.POST)
    public RestResponse searchPeiyangmubiao(@RequestHeader(value = "token",required = false)String token,@RequestBody SearchPeiyangmubiaoRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getPrincipalService().searchPeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangmubiaoadd", method = RequestMethod.POST)
    public void addPeiyangmubiao(@RequestHeader(value = "token",required = false)String token,@RequestBody AddPeiyangmubiaoRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().addPeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangmubiaodelete", method = RequestMethod.POST)
    public void deletePeiyangmubiao(@RequestHeader(value = "token",required = false)String token,@RequestBody DeletePeiyangmubiaoRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().deletePeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/peiyangmubiaoupdate", method = RequestMethod.POST)
    public void updatePeiyangmubiao(@RequestHeader(value = "token",required = false)String token,@RequestBody UpdatePeiyangmubiaoRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().updatePeiyangmubiao(request);
    }

    @ResponseBody
    @RequestMapping(path = "/fankui", method = RequestMethod.POST)
    public RestResponse searchXiaoxi(@RequestHeader(value = "token",required = false)String token,@RequestBody SearchXiaoxiRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getPrincipalService().searchXiaoxi(request);
    }

    @ResponseBody
    @RequestMapping(path = "/fankuihuifu", method = RequestMethod.POST)
    public void updateXiaoxi(@RequestHeader(value = "token",required = false)String token,@RequestBody UpdateXiaoxiRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().updateXiaoxi(request);
    }

    @ResponseBody
    @RequestMapping(path = "/renwu", method = RequestMethod.POST)
    public RestResponse searchRenwu(@RequestHeader(value = "token",required = false)String token,@RequestBody SearchRenwuRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getPrincipalService().searchRenwu(request);
    }

    @ResponseBody
    @RequestMapping(path = "/renwutianjia", method = RequestMethod.POST)
    public void addRenwu(@RequestHeader(value = "token",required = false)String token,@RequestBody AddRenwuRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().addRenwu(request);
    }

    @ResponseBody
    @RequestMapping(path = "/renwufabuall", method = RequestMethod.POST)
    public void releaseAllRenwu(@RequestHeader(value = "token",required = false)String token,@RequestBody ReleaseAllRenwuRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().releaseAllRenwu(request);
    }

    @ResponseBody
    @RequestMapping(path = "/renwufabu", method = RequestMethod.POST)
    public void releaseRenwu(@RequestHeader(value = "token",required = false)String token,@RequestBody ReleaseRenwuRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().releaseRenwu(request);
    }

    @ResponseBody
    @RequestMapping(path = "/renwubianji", method = RequestMethod.POST)
    public void updateRenwu(@RequestHeader(value = "token",required = false)String token,@RequestBody UpdateRenwuRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().updateRenwu(request);
    }

    @ResponseBody
    @RequestMapping(path = "/renwushanchu", method = RequestMethod.POST)
    public void deleteRenwu(@RequestHeader(value = "token",required = false)String token,@RequestBody DeleteRenwuRequest request) {
        System.out.println(request);
        sessionManager.getSession(token).getPrincipalService().deleteRenwu(request);
    }

    @ResponseBody
    @RequestMapping(path = "/kechengdagang", method = RequestMethod.POST)
    public RestResponse searchKechengdagang(@RequestHeader(value = "token",required = false)String token,@RequestBody KechengdagangRequest request) {
        System.out.println(request);
        return sessionManager.getSession(token).getPrincipalService().searchKechengdagang(request);
    }

}
