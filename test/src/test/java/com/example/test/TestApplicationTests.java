package com.example.test;

import logic.DangqianduizhibiaodianMgr;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
    }
    public static void main(String[] args) {
        DangqianduizhibiaodianMgr.SearchZhibiaodianID("1");
    }
}
