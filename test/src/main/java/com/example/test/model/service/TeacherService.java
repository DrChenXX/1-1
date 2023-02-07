package com.example.test.model.service;

import com.example.test.datatype.*;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.*;
import com.example.test.model.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service("teacherService")
public class TeacherService implements UserService {

    @Autowired
    private PeiyangmubiaoMgr peiyangmubiaoMgr;
    @Autowired
    private DangqiankechengMgr dangqiankechengMgr;
    @Autowired
    private BiyeyaoqiuMgr biyeyaoqiuMgr;
    @Autowired
    private KechengduizhibiaodianMgr kechengduizhibiaodianMgr;
    @Autowired
    private DangqianduizhibiaodianMgr dangqianduizhibiaodianMgr;
    @Autowired
    private KechengmubiaoMgr kechengmubiaoMgr;
    @Override
    public String name() {
        System.out.println("teacherService");
        return "teacherService";
    }

    public String getRequestList(String kechengmingcheng, String kechengbianhao, String kaikexueqi, String peiyangfangan, String dangqianrenwu, String renwuzhuangtai){
        return "";
    }

    public RestResponse searchPeiyangmubiao(SearchPeiyangmubiaoRequest request) {
        List<Peiyangmubiao> peiyangmubiaos = peiyangmubiaoMgr.getByPEIYANGFANGANID(request.getId());
        if (peiyangmubiaos.isEmpty()) {
            return new RestResponse().fail("没有找到对应培养目标");
        }
        List<SearchPeiyangmubiaoResponse> responses = new ArrayList<SearchPeiyangmubiaoResponse>();
        int n = 1;
        for (Peiyangmubiao peiyangmubiao : peiyangmubiaos) {
            responses.add(new SearchPeiyangmubiaoResponse(n,peiyangmubiao.getContent()));
            n++;
        }
        return new RestResponse().success("已找到对应的培养目标",responses);
    }

    //确认毕业要求矩阵：查看专业负责人建议的课程支撑点
    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
        List<Dangqianduizhibiaodian> dangqianduizhibiaodians =  dangqianduizhibiaodianMgr.getByDangqiankechengID(request.getKechengid());
        if (dangqianduizhibiaodians.isEmpty()) {
            return new RestResponse().fail("当前课程无需支撑指标点");
        }
        List<ConfirmMatrixOfBiyeyaoqiuResponse> responses = new ArrayList<ConfirmMatrixOfBiyeyaoqiuResponse>();
        for (Dangqianduizhibiaodian dangqianduizhibiaodian : dangqianduizhibiaodians) {
            responses.add(new ConfirmMatrixOfBiyeyaoqiuResponse(dangqianduizhibiaodian.getContent(),true));
        }
        return new RestResponse().success("当前课程需要支撑",responses);
    }

    //调取保存的记录
    public RestResponse saveMatrixOfBiyeyaoqiu (SaveMatrixOfBiyeyaoqiuRequest request) {
        List<Kechengmubiao> kechengmubiaos =  kechengmubiaoMgr.getByKechengID(request.getKechengid());
        if (kechengmubiaos.isEmpty()) {
            return new RestResponse().fail("当前课程无保存课程目标");
        }
        SaveMatrixOfBiyeyaoqiuResponse response = new SaveMatrixOfBiyeyaoqiuResponse();
        for (Kechengmubiao kechengmubiao : kechengmubiaos) {
            response.addMubiao(kechengmubiao.getContent());
        }
        return new RestResponse().success("当前课程需要支撑",response);
    }


    public RestResponse feedbackOfBiyeyaoqiu (FeedbackOfBiyeyaoqiuRequest request) {
        List<Dangqianduizhibiaodian> dangqianduizhibiaodians =  dangqianduizhibiaodianMgr.getByDangqiankechengID(request.getKechengid());
        if (dangqianduizhibiaodians.isEmpty()) {
            return new RestResponse().fail("当前课程无需支撑指标点");
        }
        List<ConfirmMatrixOfBiyeyaoqiuResponse> responses = new ArrayList<ConfirmMatrixOfBiyeyaoqiuResponse>();
        for (Dangqianduizhibiaodian dangqianduizhibiaodian : dangqianduizhibiaodians) {
            responses.add(new ConfirmMatrixOfBiyeyaoqiuResponse(dangqianduizhibiaodian.getContent(),true));
        }
        return new RestResponse().success("当前课程需要支撑",responses);
    }

//
//    public RestResponse uploadZhibiaodian (UploadZhibiaodianRequest request) {
//
//    }
//

    //feedback
//    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
//        List<> peiyangmubiaos = peiyangmubiaoMgr.get(request.getDangqiankecheng());
//        if (peiyangmubiaos.isEmpty()) {
//            return new RestResponse().fail("");
//        }
//        List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
//        int n = 1;
//        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
//            responses.add(new SearchPeiyangmubiaosResponse(n,dangqiankecheng.getContent()));
//            n++;
//        }
//        return new RestResponse().success("",responses);
//    }

    //save


//    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
//        List<> peiyangmubiaos = peiyangmubiaoMgr.get(request.getDangqiankecheng());
//        if (peiyangmubiaos.isEmpty()) {
//            return new RestResponse().fail("");
//        }
//        List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
//        int n = 1;
//        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
//            responses.add(new SearchPeiyangmubiaosResponse(n,dangqiankecheng.getContent()));
//            n++;
//        }
//        return new RestResponse().success("",responses);
//    }
//
//    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
//        List<> peiyangmubiaos = peiyangmubiaoMgr.get(request.getDangqiankecheng());
//        if (peiyangmubiaos.isEmpty()) {
//            return new RestResponse().failM("");
//    }
//    List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
//    int n = 1;
//        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
//        responses.add(new SearchPeiyangmubiaosResponse(n,dangqiankecheng.getContent()));
//        n++;
//    }
//        return new RestResponse().success("",responses);
//}
//
//    public RestResponse searchKechengmubiao (SearchKechengmubiaoRequest request) {
//        List<Peiyangmubiao> peiyangmubiaos = peiyangmubiaogr.get(request.getDangqiankecheng());
//        if (peiyangmubiaos.isEmpty()) {
//            return new RestResponse().fail("没有找到课程目标");
//        }
//        List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
//        int n = 1;
//        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
//            responses.add(new SearchPeiyangmubiaosResponse(n, dangqiankecheng.getContent()));
//            n++;
//        }
//        return new RestResponse().success("已找到对应课程目标", responses);
//    }
//    public RestResponse searchDangqiankecheng (SearchDangqiankechengRequest request) {
//        List<Dangqiankecheng> dangqiankechengs = dangqiankechengMgr.getAll(request.getDangqiankecheng());
//        if (dangqiankechengs.isEmpty()) {
//            return new RestResponse().fail("没有找到课程");
//        }
//        List<SearchDangqiankechengResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
//        int n = 1;
//        for (Dangqiankecheng dangqiankecheng : dangqiankechengs) {
//            responses.add(new SearchDangqiankechengResponse(n,dangqiankecheng.getContent()));
//            n++;
//        }
//        return new RestResponse().success("已找到对应的课程",responses);
//    }


}
