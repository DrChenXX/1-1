package com.example.test;

import com.example.test.datatype.RestResponse;
import com.example.test.datatype.SearchTeacherRequest;
import com.example.test.datatype.SearchTeacherResponse;
import com.example.test.datatype.SearchXueshengRequest;
import com.example.test.model.dao.logic.RenwuMgr;
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
        RenwuMgr renwuMgr = new RenwuMgr();
        renwuMgr.updateByID("11");
    }
}
