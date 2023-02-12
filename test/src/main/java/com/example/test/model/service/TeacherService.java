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
    private DangqiankaoheMgr dangqiankaoheMgr;
    @Autowired
    private DangqianduizhibiaodianMgr dangqianduizhibiaodianMgr;
    @Autowired
    private KechengmubiaoMgr kechengmubiaoMgr;
    @Autowired
    private KechengMgr kechengMgr;
    @Autowired
    private ZhibiaodianMgr zhibiaodianMgr;
    @Autowired
    private XiaoxiMgr xiaoxiMgr;
    @Autowired
    private YonghuMgr yonghuMgr;
    @Autowired
    private PeiyangfanganMgr peiyangfanganMgr;
    @Autowired
    private RenwuMgr renwuMgr;
    @Autowired
    private DangqianmubiaoMgr dangqianmubiaoMgr;
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


    public RestResponse uploadZhibiaodian (UploadZhibiaodianRequest request){
      List<Dangqianduizhibiaodian> dangqianduizhibiaodians = dangqianduizhibiaodianMgr.getByDangqiankechengID(request.getKechengid());
        if(dangqianduizhibiaodians.isEmpty()){
            return new RestResponse().fail("当前课程未上传课程目标");
        }
      List<UploadZhibiaodianResponse> responses = new ArrayList<UploadZhibiaodianResponse>();
      int n = 1;
      for(Dangqianduizhibiaodian dangqianduizhibiaodian : dangqianduizhibiaodians){
          UploadZhibiaodianResponse response = new UploadZhibiaodianResponse(dangqianduizhibiaodian.getContent(),true,"1","1");
          responses.add(n++,response);
      }
      return new RestResponse().success("当前课程指标点为：",responses);
    }

    /*
    public RestResponse getTaskStatusList (GetTaskStatusListRequest request){
        Dangqiankecheng dangqiankecheng = (Dangqiankecheng) dangqiankechengMgr.getByKechengID(request.getKechengid());
        GetTaskStatusListResponse response = new GetTaskStatusListResponse();
        if (dangqiankecheng.getZhuangtai() == "课程-指标点支撑矩阵未确认") {
            return new RestResponse().success("当前状态为：",response);
        }
        if (dangqiankecheng.getZhuangtai() == "课程-指标点支撑矩阵已确认") {
            response.setTask1_0(1);
            return new RestResponse().success("当前状态为：",response);
        }
        if (dangqiankecheng.getZhuangtai() == "课程-指标点支撑矩阵反馈已提交待审核") {
            response.setTask1_0(2);
            return new RestResponse().success("当前状态为：",response);
        }
        if (dangqiankecheng.getZhuangtai() == "课程-指标点支撑矩阵反馈意见不通过") {
            response.setTask1_0(3);
            return new RestResponse().success("当前状态为：",response);
        }
        if (dangqiankecheng.getZhuangtai() == "课程-指标点支撑矩阵反馈意见通过") {
            response.setTask1_0(1);
            return new RestResponse().success("当前状态为：",response);
        }
        if (dangqiankecheng.getZhuangtai() == "教学大纲未上传") {
            response.setTask1_0(1);
            return new RestResponse().success("当前状态为：",response);
        }
        if (dangqiankecheng.getZhuangtai() == "教学大纲上传完成等待审核") {
            response.setTask1_0(1);
            return new RestResponse().success("当前状态为：",response);
        }
        if (dangqiankecheng.getZhuangtai() == "教学大纲上传反馈审核通过") {
            response.setTask1_1(1);
            return new RestResponse().success("当前状态为：",response);
        }
        return new RestResponse().fail("未找到当前状态");
    }
    */


    // 显示毕业要求支撑点
    public RestResponse task11feedback_get(Task11FeedbackGetRequest request) {
        String courseid = request.getCourseid();
        List<Dangqianduizhibiaodian> dangqianduizhibiaodians = dangqianduizhibiaodianMgr.getByDangqiankechengID(courseid);
        List<Task11FeedbackGetResponse> responses = new ArrayList<Task11FeedbackGetResponse>();
        Kecheng kecheng = kechengMgr.getByID(courseid);
        List<Biyeyaoqiu> biyeyaoqius = biyeyaoqiuMgr.getByPeiyangfanganID(courseid);
        for (Biyeyaoqiu biyeyaoqiu : biyeyaoqius) {
            List<Zhibiaodian> zbd = zhibiaodianMgr.getByBIYEYAOQIUID(biyeyaoqiu.getId());
            for(Zhibiaodian z : zbd) {
                String zhichi = "否";
                for (Dangqianduizhibiaodian d : dangqianduizhibiaodians) {
                    if(d.getZhibiaodianId().equals(z.getId())) {
                        zhichi = "是";
                        break;
                    }
                }
                Task11FeedbackGetResponse res = new Task11FeedbackGetResponse(courseid,z.getContent(),zhichi,false,"");
                responses.add(res);
            }
        }
        return RestResponse.success("data为列表",responses);
    }


    // 提交毕业要求支撑点修改意见
    public RestResponse task11feedback_send(List<Task11FeedbackSendRequest> requests) {
        String feedback = "";
        for (Task11FeedbackSendRequest request : requests) {
            if(request.getXiugai().equals("true")) {
                feedback += "该课程希望";
                if(request.getZhichi().equals("是")) {
                    feedback+="支持";
                }else {
                    feedback+="不支持";
                }
                feedback+="指标点：";
                feedback+=request.getZhichengdian();
                feedback+=".";
                feedback+="意见为：";
                feedback+=request.getYijian();
                feedback+=";";
            }
        }
        Task11FeedbackSendRequest res = requests.get(0);
        String teacherid = dangqiankechengMgr.getByID(res.getCourseid()).getTeacherId();
        String teachername = yonghuMgr.getByID(teacherid).getName();
        String pyfaid =kechengMgr.getByID(dangqiankechengMgr.getByID(res.getCourseid()).getKechengId()).getPeiyangfanganId();
        String toid = peiyangfanganMgr.getByID(pyfaid).getFuzerenId();
        String toname = yonghuMgr.getByID(toid).getName();

        Xiaoxi xiaoxi = new Xiaoxi(
                "xiaoxi"+System.currentTimeMillis(),
                teacherid,
                teachername,
                toid,
                toname,
                "否",
                feedback,
                pyfaid,
                ""
        );
        xiaoxiMgr.add(xiaoxi);
        return RestResponse.success("已发送");
    }
    
    public void task13Kechengmubiao_send(List<Task13Kechengmubiao_sendRequest> requests) {
        int i = 0;
        for(Task13Kechengmubiao_sendRequest request:requests){
            String courseid = request.getCourseid();
            String mingcheng = request.getMubiao();
            String mubiaoid = kechengmubiaoMgr.getByKechengID(courseid).get(0).getId();
            Kechengmubiao mubiao = new Kechengmubiao(
                    "mubiao" + System.currentTimeMillis(),
                    courseid,
                    mingcheng
            );
            kechengmubiaoMgr.add(mubiao);
            i++;
            String id = String.valueOf(i);
            Dangqianmubiao dangqianmubiao = new Dangqianmubiao(id,courseid,mubiaoid,mingcheng);
            dangqianmubiaoMgr.add(dangqianmubiao);
        }
    }
    
    public RestResponse task13Kechengmubiao_get(Task13Kechengmubiao_getRequest request){
        String courseid = request.getCourseid();
        List<Dangqianmubiao> dangqianmubiaos = dangqianmubiaoMgr.getByDangqiankechengID(courseid);
        List<Task13Kechengmubiao_getResponse> responses = new ArrayList<Task13Kechengmubiao_getResponse>();
        Kecheng kecheng = kechengMgr.getByID(courseid);
        int i = 0;
        for (Dangqianmubiao dangqianmubiao:dangqianmubiaos) {
            String mubiao = dangqianmubiao.getContent();
            Task13Kechengmubiao_getResponse res = new Task13Kechengmubiao_getResponse("",mubiao);
            if(i == 0) {
                res.setCourseid(courseid);
                i++;
            }
            responses.add(res);
        }
        return RestResponse.success("课程目标为：",responses);
    }
    
   public RestResponse task14GetHead(Task14GetHeadRequest request){
        String courseid = request.getCourseid();
        List<Task14GetHeadResponse> responses = new ArrayList<Task14GetHeadResponse>();
        List<Zhibiaodian> zhibiaodians = zhibiaodianMgr.getAll();
        Task14GetHeadResponse res0 = new Task14GetHeadResponse(null);
        responses.add(res0);
        for(Zhibiaodian zhibiaodian:zhibiaodians){
            Task14GetHeadResponse res = new Task14GetHeadResponse(zhibiaodian.getContent());
            responses.add(res);
        }
        return RestResponse.success("表头为：",responses);
    }
    
   public void task14SendBody(List<Task14SendBodyRequest> requests){
        for(Task14SendBodyRequest request:requests){
            List<Kechengmubiao> kechengmubiaos = kechengmubiaoMgr.getAll();
            String courseid = request.getCourseid();
            String kechengmubiao = request.getKechengmubiao();
            String kechengmubiaoid = null;
            for(Kechengmubiao kechengmubiao1 : kechengmubiaos) {
                if (kechengmubiao1.getContent() == kechengmubiao){
                    kechengmubiaoid = kechengmubiao1.getId();
                }
            }
            int i = 0;
            for(Boolean b:request.getIs_zhicheng()){
                i++;
                List<Zhibiaodian> zhibiaodians = zhibiaodianMgr.getAll();
                Zhibiaodian zhibiaodian = zhibiaodians.get(i);
                String zhibiaodianid = zhibiaodian.getId();
                Mubiaoduizhibiaodian mubiaoduizhibiaodian;
                if(b == false){
                    mubiaoduizhibiaodian = new Mubiaoduizhibiaodian(
                            "mubiao" + System.currentTimeMillis(),
                            kechengmubiaoid,zhibiaodianid,"false"
                            );
                } else{
                    mubiaoduizhibiaodian = new Mubiaoduizhibiaodian(
                            "mubiao" + System.currentTimeMillis(),
                            kechengmubiaoid,zhibiaodianid,"true"
                            );
                }
                mubiaoduizhibiaodianMgr.add(mubiaoduizhibiaodian);
            }
        }
    }

    public RestResponse task14GetBody(Task14GetBodyRequest request){
        List<Task14GetBodyResponse> responses = new ArrayList<Task14GetBodyResponse>();
        String courseid = request.getCourseid();
        List<Mubiaoduizhibiaodian> mubiaoduizhibiaodians = mubiaoduizhibiaodianMgr.getAll();
        List<Kechengmubiao> kechengmubiaos = kechengmubiaoMgr.getByKechengID(courseid);
        for(Kechengmubiao kechengmubiao:kechengmubiaos){
            String kechengmubiaomingcheng = kechengmubiao.getContent();//课程目标
            String kechengmubiaoid = kechengmubiao.getId();//得到课程目标的id
            int i = 0;
            List<Boolean> is_zhichengs = new ArrayList<Boolean>();
            for(Mubiaoduizhibiaodian mubiaoduizhibiaodian:mubiaoduizhibiaodians){
                i++;
                if(mubiaoduizhibiaodian.getKechengmubiaoId() == kechengmubiaoid){
                    String result = mubiaoduizhibiaodian.getContent();//是否
                    if(result == "true"){
                        is_zhichengs.add(i,true);
                    }
                }
            }
            Task14GetBodyResponse res = new Task14GetBodyResponse(courseid,kechengmubiaomingcheng,is_zhichengs);
            responses.add(res);
        }
        return RestResponse.success("获取表格：",responses);
    }

    public RestResponse task21kaohefangshi_get(Task21Kaohefangshi_getRequest request){
        String courseid = request.getCourseid();
        List<Dangqiankaohe> dangqiankaohess = dangqiankaoheMgr.getByDangqiankechengID(courseid);
        List<Task21Kaohefangshi_getResponse> responses = new ArrayList<Task21Kaohefangshi_getResponse>();
        Kecheng kecheng = kechengMgr.getByID(courseid);
        List<Dangqiankaohe> dangqiankaohes = dangqiankaoheMgr.getByDangqiankechengID(courseid);
        for (Dangqiankaohe dangqiankaohe:dangqiankaohes) {
            String mingcheng = dangqiankaohe.getContent();
            int zhanbi = dangqiankaohe.getZhanbi();
            Task21Kaohefangshi_getResponse res = new Task21Kaohefangshi_getResponse(courseid,mingcheng,zhanbi);
            responses.add(res);
        }
        return RestResponse.success("kaohefangshi为：",responses);
    }
    public void task21kaohefangshi_send(List<Task21Kaohefangshi_sendRequest> requests) {
        for (Task21Kaohefangshi_sendRequest request:requests){
            String courseid = request.getKechengid();
            int zhanbi = request.getZhanbi();
            String mingcheng = request.getContent();
            Dangqiankaohe kaohe = new Dangqiankaohe(courseid,mingcheng,courseid,"","",zhanbi);
            dangqiankaoheMgr.add(kaohe);
        }
    }

    // 设置任务状态
    public RestResponse taskStatusSend(TaskStatusSendRequest request) {
        Dangqiankecheng dangqiankecheng = dangqiankechengMgr.getByID(request.getCourseid());
        dangqiankecheng.setCurtask(request.getCur_task());
        dangqiankecheng.setTask1_0(request.getTask1_0());
        dangqiankecheng.setTask1_1(request.getTask1_1());
        dangqiankecheng.setTask2(request.getTask2());
        dangqiankecheng.setTask3(request.getTask3());
        dangqiankecheng.setTask4(request.getTask4());

        dangqiankechengMgr.deleteByID(request.getCourseid());
        dangqiankechengMgr.add(dangqiankecheng);

        return RestResponse.success("设置成功");
    }

    // 获取任务状态
    public RestResponse taskStatusGet(TaskStatusGetRequest request) {
        Dangqiankecheng dangqiankecheng = dangqiankechengMgr.getByID(request.getCourseid());

        if (dangqiankecheng==null) {
            return RestResponse.fail("没有找到对应课程");
        }

        TaskStatusGetResponse response = new TaskStatusGetResponse(
                request.getCourseid(),
                dangqiankecheng.getCurtask(),
                dangqiankecheng.getTask1_0(),
                dangqiankecheng.getTask1_1(),
                dangqiankecheng.getTask2(),
                dangqiankecheng.getTask3(),
                dangqiankecheng.getTask4()
        );

        return RestResponse.success("已找到对应课程",response);
    }
}
