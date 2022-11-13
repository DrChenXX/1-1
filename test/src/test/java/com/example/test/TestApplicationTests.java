package com.example.test;

import entity.Biyeyaoqiu;
import logic.BiyeyaoqiuMgr;
import logic.ErrorMgr;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
    }
    public static void main(String[] args) {
        BiyeyaoqiuMgr.SearchPeiyangID("1");
    }
}
