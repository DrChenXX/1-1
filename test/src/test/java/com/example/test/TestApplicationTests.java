package com.example.test;

import com.example.test.datatype.RestResponse;
import com.example.test.datatype.SearchTeacherRequest;
import com.example.test.datatype.SearchTeacherResponse;
import com.example.test.datatype.SearchXueshengRequest;
import com.example.test.model.dao.logic.XiaoxiMgr;
import com.example.test.model.dao.logic.YonghuMgr;
import com.example.test.model.entity.Xiaoxi;
import com.example.test.model.entity.Yonghu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
    }
    public static void main(String[] args) {
        YonghuMgr yonghuMgr = new YonghuMgr();
        List<Yonghu> teachers = yonghuMgr.getAll();
        System.out.println(teachers);
        List<SearchTeacherResponse> responses = new ArrayList<SearchTeacherResponse>();

        for (Yonghu teacher : teachers) {
            responses.add(new SearchTeacherResponse(teacher.getId(),teacher.getName(),"教授","信息科学与工程学院"));
        }

        SearchXueshengRequest request = new SearchXueshengRequest("1","1","1","1","1");
        //页码处理
        int yeshu;
        if(request.getYeshu() != "") { yeshu = Integer.valueOf(request.getYeshu()) - 1; }
        else { yeshu = 0; }
        List<SearchTeacherResponse> responses1 =
                responses.subList(yeshu * 5, (responses.size() - (yeshu + 1) * 5) < 0 ? responses.size() : (yeshu + 1) * 5);
        for (SearchTeacherResponse searchTeacherResponse : responses1) {
            System.out.println(searchTeacherResponse.getId() + "  " + searchTeacherResponse.getName() + "   " + searchTeacherResponse.getZhicheng() + "  " + searchTeacherResponse.getYuanxi());
        }
    }
}
