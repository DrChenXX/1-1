package com.example.test.controller;

import com.example.test.datatype.ConfirmMatrixOfBiyeyaoqiuRequest;
import com.example.test.datatype.RestResponse;
import com.example.test.datatype.SearchPeiyangmubiaoRequest;
import com.example.test.interfaces.UserController;
import com.example.test.model.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home/teacher")
public class TeacherController implements UserController {

    @Autowired
    private TeacherService teacherService;


    @Override
    public String name(){
        System.out.println("teacherController");
        return "teacherController";
    }

    @RequestMapping("/kechengrenwuliebiao")
    public String getRequestList(String kechengmingcheng, String kechengbianhao, String kaikexueqi, String peiyangfangan, String dangqianrenwu, String renwuzhuangtai) {
        return teacherService.getRequestList(kechengmingcheng,kechengbianhao,kaikexueqi,peiyangfangan,dangqianrenwu,renwuzhuangtai);
    }

    @ResponseBody
    @RequestMapping(path = "/Kechengduizhibiaodian/ConfirmMatrixOfBiyeyaoqiu", method = RequestMethod.POST)
    public RestResponse confirmMatrixOfBiyeyaoqiu(@RequestBody ConfirmMatrixOfBiyeyaoqiuRequest request) {
        System.out.println(request);
        return teacherService.confirmMatrixOfBiyeyaoqiu(request);
    }


}

