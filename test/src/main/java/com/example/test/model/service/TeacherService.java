package com.example.test.model.service;

import com.example.test.interfaces.UserService;
import org.springframework.stereotype.Service;


@Service("teacherService")
public class TeacherService implements UserService {

    @Autowired
    private PeiyangmubiaoMgr peiyangmubiaoMgr;
    @Autowired
    private DangqiankechengMgr dangqiankechengMgr;
    @Autowired
    private PeiyangmubiaoMgr peiyangmubiaoMgr;
    @Autowired
    private BiyeyaoqiuMgr biyeyaoqiuMgr;
    @Autowired
    private KechengduizhibiaodianMgr kechengduizhibiaodianMgr;
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

    public RestResponse searchDangqiankecheng (SearchDangqiankechengRequest request) {
        List<Dangqiankecheng> dangqiankechengs = DangqiankechengMgr.get(request.getDangqiankecheng());
        if (dangqiankechengs.isEmpty()) {
            return new RestResponse().fail("没有找到课程");
        }
        List<SearchDangqiankechengResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
        int n = 1;
        for (Dangqiankecheng dangqiankecheng : dangqiankechengs) {
            responses.add(new SearchDangqiankechengResponse(n,dangqiankecheng.getContent()));
            n++;
        }
        return new RestResponse().success("已找到对应的课程",responses);
    }

    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
        List<Kechengduizhibiaodian> kechengduizhibiaodians = KechengduizhibiaodianMgr.getByKechengID(request.getKechengid());
        if (kechengduizhibiaodians.isEmpty()) {
            return new RestResponse().fail("当前课程无需支撑指标点");
        }
        List<ConfirmMatrixOfBiyeyaoqiuResponse> responses = new ArrayList<ConfirmMatrixOfBiyeyaoqiuResponse>();
        int n = 1;
        for (Kechengduizhibiaodian kechengduizhibiaodian : kechengduizhibiaodians) {
            responses.add(new ConfirmMatrixOfBiyeyaoqiuResponse(n,kechengduizhibiaodian.getContent()));
            n++;
        }
        return new RestResponse().success("确定当前课程所有支撑指标点",responses);
    }

    public RestResponse searchKechengmubiao (SearchKechengmubiaoRequest request) {
        List<Peiyangmubiao> peiyangmubiaos = peiyangmubiaoMgr.get(request.getDangqiankecheng());
        if (peiyangmubiaos.isEmpty()) {
            return new RestResponse().fail("没有找到课程目标");
        }
        List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
        int n = 1;
        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
            responses.add(new SearchPeiyangmubiaosResponse(n,dangqiankecheng.getContent()));
            n++;
        }
        return new RestResponse().success("已找到对应课程目标",responses);
    }

    //task1-1:确认毕业要求矩阵
    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
        List<> peiyangmubiaos = peiyangmubiaoMgr.get(request.getDangqiankecheng());
        if (peiyangmubiaos.isEmpty()) {
            return new RestResponse().fail("");
        }
        List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
        int n = 1;
        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
            responses.add(new SearchPeiyangmubiaosResponse(n,dangqiankecheng.getContent()));
            n++;
        }
        return new RestResponse().success("",responses);
    }

    //feedback
    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
        List<> peiyangmubiaos = peiyangmubiaoMgr.get(request.getDangqiankecheng());
        if (peiyangmubiaos.isEmpty()) {
            return new RestResponse().fail("");
        }
        List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
        int n = 1;
        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
            responses.add(new SearchPeiyangmubiaosResponse(n,dangqiankecheng.getContent()));
            n++;
        }
        return new RestResponse().success("",responses);
    }

    //save


    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
        List<> peiyangmubiaos = peiyangmubiaoMgr.get(request.getDangqiankecheng());
        if (peiyangmubiaos.isEmpty()) {
            return new RestResponse().fail("");
        }
        List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
        int n = 1;
        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
            responses.add(new SearchPeiyangmubiaosResponse(n,dangqiankecheng.getContent()));
            n++;
        }
        return new RestResponse().success("",responses);
    }

    public RestResponse confirmMatrixOfBiyeyaoqiu (ConfirmMatrixOfBiyeyaoqiuRequest request) {
        List<> peiyangmubiaos = peiyangmubiaoMgr.get(request.getDangqiankecheng());
        if (peiyangmubiaos.isEmpty()) {
            return new RestResponse().failM("");
    }
    List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
    int n = 1;
        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
        responses.add(new SearchPeiyangmubiaosResponse(n,dangqiankecheng.getContent()));
        n++;
    }
        return new RestResponse().success("",responses);
}

    public RestResponse searchKechengmubiao (SearchKechengmubiaoRequest request) {
        List<Peiyangmubiao> peiyangmubiaos = peiyangmubiaogr.get(request.getDangqiankecheng());
        if (peiyangmubiaos.isEmpty()) {
            return new RestResponse().fail("没有找到课程目标");
        }
        List<SearchPeiyangmubiaosResponse> responses = new ArrayList<SearchDangqiankechengResponse>();
        int n = 1;
        for (Peiyangmubiaos peiyangmubiao : peiyangmubiaos) {
            responses.add(new SearchPeiyangmubiaosResponse(n, dangqiankecheng.getContent()));
            n++;
        }
        return new RestResponse().success("已找到对应课程目标", responses);
    }

}
