package com.example.test.model.service;

import com.example.test.datatype.*;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.*;
import com.example.test.model.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private KaoheMgr kaoheMgr;
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
        List<Peiyangmubiao> peiyangmubiaos = peiyangmubiaoMgr.getByPEIYANGFANGANID(request.getPeiyangfangan());
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

//    public RestResponse getTeacherTaskList (GetTeacherTaskListRequest request) {
//
//    }

    public RestResponse searchKaohefangshi(SearchKaohefangshiRequest request){
        String kechengid = request.getKechengid();
        List<Kechengmubiao> kechengmubiaos = kechengmubiaoMgr.getByKechengID(kechengid);
        if(kechengmubiaos.isEmpty()){
            return new RestResponse().fail("当前课程未上传课程目标");
        }
        List<SearchKaohefangshiResponse> responses = new ArrayList<SearchKaohefangshiResponse>();
        Map<String, Integer> Kechengmubiaozhanbi = new HashMap<String,Integer>();
        for (Kechengmubiao kechengmubiao:kechengmubiaos){
            String kechengmubiaoid = kechengmubiao.getId();
            List<Kaohe> kaohes = kaoheMgr.getByKechengmubiaoID(kechengmubiaoid);
            for (Kaohe kaohe:kaohes){
                if(Kechengmubiaozhanbi.containsKey(kechengmubiaoid)){
                    int temp = Kechengmubiaozhanbi.get(kechengmubiaoid)+kaohe.getZhanbi();
                    Kechengmubiaozhanbi.put(kechengmubiaoid,temp);
                }
                Kechengmubiaozhanbi.put(kechengmubiaoid,kaohe.getZhanbi());
            }
            for (Kaohe kaohe:kaohes){
                responses.add(new SearchKaohefangshiResponse(kechengmubiao.getContent(),Kechengmubiaozhanbi.get(kechengmubiaoid),kaohe.getContent()));
            }
        }
        return new RestResponse().success("当前课程需要对应指标点为：",responses);
    }

    public void updateKechengkaohe (UpdateKechengkaoheRequest request){
        kaoheMgr.add(request.getKechengid(),request.getContent(),,request.getZhanbi());
    }




}
