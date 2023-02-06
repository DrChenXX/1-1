package com.example.test;

import com.example.test.model.dao.logic.XiaoxiMgr;
import com.example.test.model.dao.logic.YonghuMgr;
import com.example.test.model.entity.Xiaoxi;
import com.example.test.model.entity.Yonghu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
    }
    public static void main(String[] args) {
//        Yonghu y = new Yonghu("2","123","qqq","12345678909","xx@qq.com");
//        YonghuMgr ym = new YonghuMgr();
//        Yonghu y2 = ym.getByID(y.getId());
//        System.out.println(y2.toString());
        XiaoxiMgr xiaoxiMgr = new XiaoxiMgr();
        xiaoxiMgr.readByID("1");
    }
}
