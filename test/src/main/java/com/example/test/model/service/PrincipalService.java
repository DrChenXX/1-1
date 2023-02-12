package com.example.test.model.service;

import com.example.test.datatype.*;
import com.example.test.interfaces.UserService;
import com.example.test.model.dao.logic.*;
import com.example.test.model.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("principalService")
public class PrincipalService implements UserService {

    @Autowired
    private YonghuMgr yonghuMgr;
    @Autowired
    private PeiyangmubiaoMgr peiyangmubiaoMgr;
    @Autowired
    private BiyeyaoqiuMgr biyeyaoqiuMgr;
    @Autowired
    private ZhibiaodianMgr zhibiaodianMgr;

    @Autowired
    private PeiyangfanganMgr peiyangfanganMgr;

    @Autowired
    private XiaoxiMgr xiaoxiMgr;

    @Autowired
    private ZhuanyeMgr zhuanyeMgr;

    @Autowired
    private XueshengMgr xueshengMgr;

    @Autowired
    private RenwuMgr renwuMgr;

    @Autowired
    private KechengMgr kechengMgr;

    @Autowired
    private YaoqiuduimubiaoMgr yaoqiuduimubiaoMgr;

    @Autowired
    private DangqiankechengMgr dangqiankechengMgr;

    @Override
    public String name() {
        System.out.println("principalService");
        return "principalService";
    }

    public RestResponse searchTeacher(SearchTeacherRequest request) {
        List<Yonghu> teachers = yonghuMgr.getAll();
        System.out.println(teachers);
        List<SearchTeacherResponse> responses = new ArrayList<SearchTeacherResponse>();
        if (teachers == null) {
            return new RestResponse<>().fail("没有找到教师");
        }

        for (Yonghu teacher : teachers) {
            if (request.getId()!="") {
                if(!teacher.getId().equals(request.getId())) {
                    continue;
                }
            }
            if (request.getName()!="") {
                if(!teacher.getName().equals(request.getName())) {
                    continue;
                }
            }
            responses.add(new SearchTeacherResponse(teacher.getId(),teacher.getName(),teacher.getZhicheng(),teacher.getYuanxi()));
        }

        //页码处理
        int yeshu;
        if(request.getYeshu() != "") { yeshu = Integer.valueOf(request.getYeshu()) - 1; }
        else { yeshu = 0; }
        List<SearchTeacherResponse> responses1 =
                responses.subList(yeshu * 5, (responses.size() - (yeshu + 1) * 5) < 0 ? responses.size() : (yeshu + 1) * 5);


        if(!responses.isEmpty()) {
            return new RestResponse<>().success(String.valueOf(responses.size()),responses1);
        } else {
            return new RestResponse<>().fail("没有找到教师");
        }
    }

    public void addTeacher(AddTeacherRequest request) {
        Yonghu yonghu = new Yonghu(request.getId(),"123456",request.getXingming(),"无","无","","2",request.getYuanxi(),request.getZhicheng());
        yonghuMgr.add(yonghu);
    }

    public void updateTeacher(UpdateTeacherRequest request) {
        Yonghu yonghu = yonghuMgr.getByID(request.getOldid());
        yonghuMgr.deleteByID(yonghu.getId());
        yonghu.setId(request.getNewid());
        yonghu.setName(request.getXingming());
        yonghu.setYuanxi(request.getYuanxi());
        yonghu.setZhicheng(request.getZhicheng());
        yonghuMgr.add(yonghu);
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

    public void addPeiyangmubiao(AddPeiyangmubiaoRequest request) {
        if (request.getFanganid() == "") {
            System.out.println("未填写培养方案");
            return;
        }
        if (request.getNeirong() == "") {
            System.out.println("未填写内容");
            return;
        }
        peiyangmubiaoMgr.add(new Peiyangmubiao(
                "peiyangmubiao" + System.currentTimeMillis(),
                request.getFanganid(),
                request.getNeirong()
        ));
    }

    public void deletePeiyangmubiao(DeletePeiyangmubiaoRequest request) {
        System.out.println(request);
        List<Peiyangmubiao> peiyangmubiaos = peiyangmubiaoMgr.getByPEIYANGFANGANID(request.getFanganid());
        String peiyangmubiaoID = "";
        int n = 1;
        for (Peiyangmubiao peiyangmubiao : peiyangmubiaos) {
            if (n == Integer.valueOf(request.getID())) {
                peiyangmubiaoID = peiyangmubiao.getId();
            }
            n++;
        }
        peiyangmubiaoMgr.deleteByID(peiyangmubiaoID);
    }

    public void updatePeiyangmubiao(UpdatePeiyangmubiaoRequest request) {
        DeletePeiyangmubiaoRequest request1 = new DeletePeiyangmubiaoRequest(request.getFanganid(),request.getID());
        deletePeiyangmubiao(request1);
        AddPeiyangmubiaoRequest request2 = new AddPeiyangmubiaoRequest(request.getFanganid(),request.getID(),request.getNeirong());
        addPeiyangmubiao(request2);
    }

    //todo:性能问题
    public RestResponse searchBiyeyaoqiu(SearchBiyeyaoqiuRequest request) {
        List<SearchBiyeyaoqiuResponse> responses = new ArrayList<SearchBiyeyaoqiuResponse>();
        List<Biyeyaoqiu> biyeyaoqius = biyeyaoqiuMgr.getByPeiyangfanganID(request.getPeiyangfangan());
        List<Zhibiaodian> zhibiaodians = zhibiaodianMgr.getAll();
        int i = 1;
        for (Biyeyaoqiu biyeyaoqiu : biyeyaoqius) {
            List<SearchZhibiaodianResponse> rs = new ArrayList<SearchZhibiaodianResponse>();
            int n = 1;
            for(Zhibiaodian zhibiaodian : zhibiaodians) {
                if(zhibiaodian.getBiyeyaoqiuId().equals(biyeyaoqiu.getId())) {
                    rs.add(new SearchZhibiaodianResponse(n,zhibiaodian.getContent()));
                    n++;
                }

            }
            responses.add(new SearchBiyeyaoqiuResponse(i,biyeyaoqiu.getContent(),rs));
            i++;
        }
        if (!responses.isEmpty()) {
            return new RestResponse<>().success("已找到对应毕业要求",responses);
        } else {
            return new RestResponse().fail("未找到对应毕业要求");
        }
    }

    public RestResponse searchPeiyangfangan(SearchPeiyangfanganRequest request) {
        List<Peiyangfangan> fangans = peiyangfanganMgr.getAll();
        System.out.println(fangans);
        List<SearchPeiyangfanganResponse> responses = new ArrayList<SearchPeiyangfanganResponse>();
        if (fangans == null) {
            return new RestResponse<>().fail("没有找到培养方案");
        }

        for (Peiyangfangan fangan : fangans) {
            if (request.getUserid()!="") {
                if(!fangan.getFuzerenId().equals(request.getUserid())) {
                    continue;
                }
            }
            String ZhuanyeID = fangan.getZhuanyeId();
            ZhuanyeMgr zhuanyeMgr = new ZhuanyeMgr();
            Zhuanye zhuanye = zhuanyeMgr.getByID(ZhuanyeID);
            if (request.getZhuanye()!="") {
                if(!zhuanye.getName().equals(request.getZhuanye())) {
                    continue;
                }
            }
            responses.add(new SearchPeiyangfanganResponse(
                    fangan.getId(),fangan.getName(),zhuanye.getName(),
                    fangan.getZhuanyeId(),fangan.getVersion(),"yuanxi","是","完成"));
        }

        //页码处理
        int yeshu;
        if(request.getYeshu() != "") { yeshu = Integer.valueOf(request.getYeshu()) - 1; }
        else { yeshu = 0; }
        List<SearchPeiyangfanganResponse> responses1 =
                responses.subList(yeshu * 5, (responses.size() - (yeshu + 1) * 5) < 0 ? responses.size() : (yeshu + 1) * 5);

        if(!responses.isEmpty()) {
            return new RestResponse<>().success(String.valueOf(responses.size()),responses1);
        } else {
            return new RestResponse<>().fail("没有找到培养方案");
        }
    }

    public RestResponse searchRenwu(SearchRenwuRequest request) {
        List<Renwu> renwus = renwuMgr.getAll();
        System.out.println(renwus);
        List<SearchRenwuResponse> responses = new ArrayList<SearchRenwuResponse>();
        if (renwus == null) {
            return new RestResponse<>().fail("没有找到任务");
        }
        for (Renwu renwu : renwus) {
            if (request.getUserid() != "") {
                if (!renwu.getFuzerenId().equals(request.getUserid())) {
                    continue;
                }
            }
            if (request.getZhuanye() != "") {
                if (!renwu.getZhuanye().equals(request.getZhuanye())) {
                    continue;
                }
            }
            if (request.getZhuanyeID() != "") {
                if (!renwu.getZhuanyeId().equals(request.getZhuanyeID())) {
                    continue;
                }
            }
            if (request.getPeiyangfangan() != "") {
                if (!renwu.getPeiyangfangan().equals(request.getPeiyangfangan())) {
                    continue;
                }
            }
            if (request.getXueqi() != "") {
                if (!renwu.getXueqi().equals(request.getXueqi())) {
                    continue;
                }
            }
            if (request.getKecheng() != "") {
                if (!renwu.getKecheng().equals(request.getKecheng())) {
                    continue;
                }
            }
            if (request.getKechengID() != "") {
                if (!renwu.getKechengId().equals(request.getKechengID())) {
                    continue;
                }
            }
            if (request.getKaikenianji() != "") {
                if (!renwu.getNianji().equals(request.getKaikenianji())) {
                    continue;
                }
            }
            if (request.getKechengleibie() != "") {
                if (!renwu.getLeibie().equals(request.getKechengleibie())) {
                    continue;
                }
            }
            if (request.getFabu() != "") {
                if (!renwu.getFabu().equals(request.getFabu())) {
                    continue;
                }
            }
            responses.add(new SearchRenwuResponse(
                    renwu.getId(),
                    renwu.getKecheng(),
                    renwu.getKechengId(),
                    renwu.getXuefen(),
                    renwu.getLeibie(),
                    renwu.getRenkelaoshi(),
                    renwu.getYuanxi(),
                    renwu.getNianji(),
                    renwu.getFabu()));
        }
        int yeshu;
        if(request.getYeshu() != "") { yeshu = Integer.valueOf(request.getYeshu()) - 1; }
        else { yeshu = 0; }
        List<SearchRenwuResponse> responses1 =
                responses.subList(yeshu * 5, (responses.size() - (yeshu + 1) * 5) < 0 ? responses.size() : (yeshu + 1) * 5);

        if(!responses.isEmpty()) {
            return new RestResponse<>().success(String.valueOf(responses.size()),responses1);
        } else {
            return new RestResponse<>().fail("没有找到培养方案");
        }
    }

    public void addRenwu(AddRenwuRequest request) {
        String peiyangfanganId = kechengMgr.getByID(request.getKechengID()).getPeiyangfanganId();
        String fuzerenId = peiyangfanganMgr.getByID(peiyangfanganId).getFuzerenId();
        String zhuanyeId = peiyangfanganMgr.getByID(peiyangfanganId).getZhuanyeId();
        String zhuanye = zhuanyeMgr.getByID(zhuanyeId).getName();
        Renwu renwu = new Renwu(
                "Renwu" + System.currentTimeMillis(),
                request.getKecheng(),
                request.getKechengID(),
                request.getXuefen(),
                request.getKechengleibie(),
                request.getRenkelaoshi(),
                request.getRenkelaoshiID(),
                request.getYuanxi(),
                request.getKaikenianji(),
                "未发布",
                fuzerenId,
                zhuanye,
                zhuanyeId,
                peiyangfanganId,
                "未设置"
        );
        renwuMgr.add(renwu);
    }

    public void releaseAllRenwu(ReleaseAllRenwuRequest request) {
        List<Renwu> renwus = renwuMgr.getAll();
        System.out.println(renwus);
        for (Renwu renwu : renwus) {
            if (request.getZhuanye() != "") {
                if (!renwu.getZhuanye().equals(request.getZhuanye())) {
                    continue;
                }
            }
            if (request.getZhuanyeID() != "") {
                if (!renwu.getZhuanyeId().equals(request.getZhuanyeID())) {
                    continue;
                }
            }
            if (request.getPeiyangfangan() != "") {
                if (!renwu.getPeiyangfangan().equals(request.getPeiyangfangan())) {
                    continue;
                }
            }
            if (request.getKecheng() != "") {
                if (!renwu.getKecheng().equals(request.getKecheng())) {
                    continue;
                }
            }
            if (request.getKechengID() != "") {
                if (!renwu.getKechengId().equals(request.getKechengID())) {
                    continue;
                }
            }
            if (request.getKaikenianji() != "") {
                if (!renwu.getNianji().equals(request.getKaikenianji())) {
                    continue;
                }
            }
            if (request.getKechengleibie() != "") {
                if (!renwu.getLeibie().equals(request.getKechengleibie())) {
                    continue;
                }
            }
            if (request.getFabu() != "") {
                if (!renwu.getFabu().equals(request.getFabu())) {
                    continue;
                }
            }
            renwuMgr.updateByID(renwu.getId());
        }
    }

    public void releaseRenwu(ReleaseRenwuRequest request) {
        renwuMgr.updateByID(request.getRenwuID());
    }

    public void updateRenwu(UpdateRenwuRequest request) {
        List<Renwu> renwus = renwuMgr.getAll();
        System.out.println(renwus);
        for (Renwu renwu : renwus) {
            if (request.getRenwuID() != "") {
                if (!renwu.getId().equals(request.getRenwuID())) {
                    continue;
                }
            }
            if (request.getKaikenianji() != "") {
                if (!renwu.getNianji().equals(request.getKaikenianji())) {
                    continue;
                }
            }
            renwuMgr.deleteByID(renwu.getId());
            renwuMgr.add(new Renwu(
                    renwu.getId(),
                    renwu.getKecheng(),
                    renwu.getKechengId(),
                    renwu.getXuefen(),
                    renwu.getLeibie(),
                    request.getRenkelaoshi(),
                    request.getRenkelaoshiID(),
                    request.getYuanxi(),
                    renwu.getNianji(),
                    renwu.getFabu(),
                    renwu.getFuzerenId(),
                    renwu.getZhuanye(),
                    renwu.getZhuanyeId(),
                    renwu.getPeiyangfangan(),
                    renwu.getXueqi()
            ));
        }
    }

    public void deleteRenwu(DeleteRenwuRequest request) {
        renwuMgr.deleteByID(request.getRenwuID());
    }

    public RestResponse searchXiaoxi(SearchXiaoxiRequest request) {
        List<Xiaoxi> xiaoxis = xiaoxiMgr.getByToID(request.getId());
        System.out.println(xiaoxis);
        List<SearchXiaoxiResponse> responses = new ArrayList<SearchXiaoxiResponse>();
        if (xiaoxis == null) {
            return new RestResponse<>().fail("没有消息");
        }
        for (Xiaoxi xiaoxi : xiaoxis) {
            if (request.getId() != "") {
                if (!xiaoxi.getToId().equals(request.getId())) {
                    continue;
                }
            }
            if (request.getFankuiren() != "") {
                if (!xiaoxi.getFromName().equals(request.getFankuiren())) {
                    continue;
                }
            }
            if (request.getFankuirenID() != "") {
                if (!xiaoxi.getFromId().equals(request.getFankuirenID())) {
                    continue;
                }
            }
            String yuanxi = yonghuMgr.getByID(xiaoxi.getFromId()).getYuanxi();
            responses.add(new SearchXiaoxiResponse(xiaoxi.getId(),xiaoxi.getFromName(),xiaoxi.getFromId(),yuanxi,xiaoxi.getData()));
        }

        //页码处理
        int yeshu;
        if(request.getYeshu() != "") { yeshu = Integer.valueOf(request.getYeshu()) - 1; }
        else { yeshu = 0; }
        List<SearchXiaoxiResponse> responses1 =
                responses.subList(yeshu * 5, (responses.size() - (yeshu + 1) * 5) < 0 ? responses.size() : (yeshu + 1) * 5);

        if(!responses.isEmpty()) {
            return new RestResponse<>().success(String.valueOf(responses.size()),responses1);
        } else {
            return new RestResponse<>().fail("没有您的消息");
        }
    }

    public void updateXiaoxi(UpdateXiaoxiRequest request) {
        Xiaoxi xiaoxi = xiaoxiMgr.getByID(request.getId());
        xiaoxiMgr.deleteByID(request.getId());
        xiaoxi.setHuifu(request.getData());
        xiaoxi.setIsRead("已读");
        xiaoxiMgr.add(xiaoxi);
    }

    public RestResponse searchXuesheng(SearchXueshengRequest request) {
        List<Xuesheng> xueshengs = xueshengMgr.getAll();
        System.out.println(xueshengs);
        List<SearchXueshengResponse> responses = new ArrayList<SearchXueshengResponse>();
        if (xueshengs == null) {
            return new RestResponse<>().fail("没有消息");
        }
        for (Xuesheng xuesheng : xueshengs) {
            if (request.getId() != "") {
                if (!xuesheng.getId().equals(request.getId())) {
                    continue;
                }
            }
            if (request.getXingming() != "") {
                if (!xuesheng.getName().equals(request.getXingming())) {
                    continue;
                }
            }
            if (request.getYuanxi() != "") {
                if (!xuesheng.getYuanxi().equals(request.getYuanxi())) {
                    continue;
                }
            }
            responses.add(new SearchXueshengResponse(
                    xuesheng.getId(),xuesheng.getName(),
                    xuesheng.getGrade(),xuesheng.getBanji(),
                    xuesheng.getYuanxi()
            ));
        }

        //页码处理
        int yeshu;
        if(request.getYeshu() != "") { yeshu = Integer.valueOf(request.getYeshu()) - 1; }
        else { yeshu = 0; }
        List<SearchXueshengResponse> responses1 =
                responses.subList(yeshu * 5, (responses.size() - (yeshu + 1) * 5) < 0 ? responses.size() : (yeshu + 1) * 5);

        if(!responses.isEmpty()) {
            return new RestResponse<>().success(String.valueOf(responses.size()),responses1);
        } else {
            return new RestResponse<>().fail("没有您的消息");
        }
    }

    public void addXuesheng(AddXueshengRequest request) {
        Xuesheng xuesheng = new Xuesheng(request.getId(),request.getXingming(),"2601","2020",request.getBanji(),request.getYuanxi());
        xueshengMgr.add(xuesheng);
    }

    public void updateXuesheng(UpdateXueshengRequest request) {
        Xuesheng xuesheng = xueshengMgr.getByID(request.getOldid());
        xueshengMgr.deleteByID(request.getOldid());
        xuesheng.setBanji(request.getBanji());
        xuesheng.setYuanxi(request.getYuanxi());
        xuesheng.setName(request.getXingming());
        xuesheng.setId(request.getNewid());
        xueshengMgr.add(xuesheng);
    }

    public RestResponse searchYaoqiuduimubiao(SearchYaoqiuduimubiaoRequest request) {
        String peiyangfanganID = request.getPeiyangfanganId();
        TableHeader now = new TableHeader();
        now.setS0("毕业要求");
        List<Peiyangmubiao> peiyangmubiaos = peiyangmubiaoMgr.getByPEIYANGFANGANID(peiyangfanganID);
        int n = 1;
        for (Peiyangmubiao peiyangmubiao : peiyangmubiaos) {
            if (n == 1) {
                now.setS1(peiyangmubiao.getContent());
            }
            if (n == 2) {
                now.setS2(peiyangmubiao.getContent());
            }
            if (n == 3) {
                now.setS3(peiyangmubiao.getContent());
            }
            if (n == 4) {
                now.setS4(peiyangmubiao.getContent());
            }
            if (n == 5) {
                now.setS5(peiyangmubiao.getContent());
            }
            if (n == 6) {
                now.setS6(peiyangmubiao.getContent());
            }
            n++;
        }
        List<Biyeyaoqiu> biyeyaoqius = biyeyaoqiuMgr.getByPeiyangfanganID(peiyangfanganID);
        List<TableData> now2 = new ArrayList<TableData>();
        List<Yaoqiuduimubiao> yaoqiuduimubiaos = yaoqiuduimubiaoMgr.getAll();
        for (Biyeyaoqiu biyeyaoqiu : biyeyaoqius) {
            TableData tableData = new TableData();
            tableData.setS0(biyeyaoqiu.getContent());
            String biyeyaoqiuID = biyeyaoqiu.getId();
            n = 1;
            for (Yaoqiuduimubiao yaoqiuduimubiao : yaoqiuduimubiaos) {
                if (yaoqiuduimubiao.getPeiyangmubiaoId() == peiyangfanganID &&
                        yaoqiuduimubiao.getBiyeyaoqiuId() == biyeyaoqiuID) {
                    if (n == 1) {
                        tableData.setS1(yaoqiuduimubiao.getData());
                    }
                    if (n == 2) {
                        tableData.setS2(yaoqiuduimubiao.getData());
                    }
                    if (n == 3) {
                        tableData.setS3(yaoqiuduimubiao.getData());
                    }
                    if (n == 4) {
                        tableData.setS4(yaoqiuduimubiao.getData());
                    }
                    if (n == 5) {
                        tableData.setS5(yaoqiuduimubiao.getData());
                    }
                    if (n == 6) {
                        tableData.setS6(yaoqiuduimubiao.getData());
                    }
                }
                n++;
            }
            now2.add(tableData);
        }
        SearchYaoqiuduimubiaoResponse response = new SearchYaoqiuduimubiaoResponse(now,now2);
        return new RestResponse<>().success("找到矩阵",response);
    }

    public RestResponse searchKechengdagang(KechengdagangRequest request) {
        List<Kecheng> kechengs = kechengMgr.getAll();
        System.out.println(kechengs);
        List<KechengdagangResponse> responses = new ArrayList<KechengdagangResponse>();
        if (kechengs.isEmpty()||kechengs==null) {
            return new RestResponse<>().fail("0");
        }
        for (Kecheng kecheng : kechengs) {
            if(request.getPeiyangfanganid() != "") {
                if(!kecheng.getPeiyangfanganId().equals(request.getPeiyangfanganid())) {
                    continue;
                }
            }
            if(request.getKechengmingcheng() != "") {
                if(!kecheng.getName().equals(request.getKechengmingcheng())) {
                    continue;
                }
            }
            if(request.getKechengbianhao() != "") {
                if(!kecheng.getId().equals(request.getKechengbianhao())) {
                    continue;
                }
            }
            if(request.getKechengleibie() != "") {
                if(!kecheng.getLeibie().equals(request.getKechengleibie())) {
                    continue;
                }
            }
            if (request.getShangchuan() != "") {
                if(!kecheng.getIsdagang().equals(request.getShangchuan())) {
                    continue;
                }
            }
            responses.add(new KechengdagangResponse(
                    kecheng.getName(),
                    kecheng.getId(),
                    kecheng.getXuefen().toString(),
                    kecheng.getLeibie(),
                    "信息科学与工程学院",
                    kecheng.getIsdagang()
            ));
        }
        int yeshu;
        if(request.getYeshu() != "") {
            yeshu = Integer.valueOf(request.getYeshu()) - 1;
        } else {
            yeshu = 0;
        }
        List<KechengdagangResponse> res =
                responses.subList(yeshu*5,(responses.size() - (yeshu +1)*5) <0? responses.size():(yeshu+1)*5);

        if(!responses.isEmpty()) {
            return new RestResponse<>().success(String.valueOf(responses.size()),res);
        } else {
            return new RestResponse<>().fail("没有找到培养方案");
        }


    }

    // 开课详情
    public RestResponse searchKaikexiangqing(KaikexiangqingRequest request) {
        List<Dangqiankecheng> dangqiankechengs = dangqiankechengMgr.getAll();
        System.out.println(dangqiankechengs);
        List<KaikexiangqingResponse> responses = new ArrayList<KaikexiangqingResponse>();
        if (dangqiankechengs.isEmpty()||dangqiankechengs==null) {
            return new RestResponse<>().fail("0");
        }
        for (Dangqiankecheng dangqiankecheng : dangqiankechengs) {
            Kecheng kecheng = kechengMgr.getByID(dangqiankecheng.getKechengId());
            if(request.getPeiyangfanganid() != "") {
                if(!kecheng.getPeiyangfanganId().equals(request.getPeiyangfanganid())) {
                    continue;
                }
            }
            if(request.getKechengmingcheng() != "") {
                if(!kecheng.getName().equals(request.getKechengmingcheng())) {
                    continue;
                }
            }
            if(request.getKechengbianhao() != "") {
                if(!dangqiankecheng.getKechengId().equals(request.getKechengbianhao())) {
                    continue;
                }
            }
            if(request.getKechengleibie() != "") {
                if(!kecheng.getLeibie().equals(request.getKechengleibie())) {
                    continue;
                }
            }
            if (request.getShangchuan() != "") {
                if(!kecheng.getIsdagang().equals(request.getShangchuan())) {
                    continue;
                }
            }
            responses.add(new KaikexiangqingResponse(
                    kecheng.getName(),
                    dangqiankecheng.getKechengId(),
                    dangqiankecheng.getXuefen().toString(),
                    kecheng.getLeibie(),
                    "信息科学与工程学院",
                    "2022",
                    dangqiankecheng.getKaikeshijian(),
                    kecheng.getIsdagang()
            ));
        }
        int yeshu;
        if(request.getYeshu() != "") {
            yeshu = Integer.valueOf(request.getYeshu()) - 1;
        } else {
            yeshu = 0;
        }
        List<KaikexiangqingResponse> res =
                responses.subList(yeshu*5,(responses.size() - (yeshu +1)*5) <0? responses.size():(yeshu+1)*5);

        if(!responses.isEmpty()) {
            return new RestResponse<>().success(String.valueOf(responses.size()),res);
        } else {
            return new RestResponse<>().fail("没有找到培养方案");
        }


    }
}
