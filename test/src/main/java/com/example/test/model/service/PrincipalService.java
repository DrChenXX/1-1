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

    private PeiyangfanganMgr peiyangfanganMgr;


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
            responses.add(new SearchTeacherResponse(teacher.getId(),teacher.getName(),"教授","信息科学与工程学院"));
        }

        if(!responses.isEmpty()) {
            return new RestResponse<>().success("找到了老师列表",responses);
        } else {
            return new RestResponse<>().fail("没有找到教师");
        }

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
                if(!fangan.getId().equals(request.getUserid())) {
                    continue;
                }
            }
            responses.add(new SearchPeiyangfanganResponse(
                    fangan.getId(),fangan.getName(),"zhuanyemingcheng",
                    fangan.getZhuanyeId(),fangan.getVersion(),"yuanxi","是","完成"));
        }

        if(!responses.isEmpty()) {
            return new RestResponse<>().success("找到了培养方案列表",responses);
        } else {
            return new RestResponse<>().fail("没有找到培养方案");
        }

    }



}
