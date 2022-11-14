package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.test.database.ConnectDB;

@SpringBootTest
public class DatabaseBasicOperationsTests {

    @Test
    void contextLoads() {
    }
    public static void main(String[] args) {
        System.out.println(ConnectDB.addContent("INSERT INTO T_ERROR(ID,SHIJIAN,CONTENT) VALUES(3,'10:22:34','DD')"));
        List<String> list = new ArrayList<String>();
        list.add("INSERT INTO T_ERROR(ID,SHIJIAN,CONTENT) VALUES(4,'10:33:28','kk')");
        list.add("INSERT INTO T_ERROR(ID,SHIJIAN,CONTENT) VALUES(5,'10:45:16','ee')");
        System.out.println(ConnectDB.addContent(list));
        List<Map<String,Object>> l = ConnectDB.getList("SELECT * FROM T_ERROR");
        for(Map<String,Object> m : l){
            for(String name : m.keySet()){
                System.out.println(m.get(name));
            }
        }
        System.out.println(ConnectDB.deleteContent("DELETE FROM T_ERROR WHERE ID = 5"));
        List<String> list2 = new ArrayList<String>();
        list2.add("DELETE FROM T_ERROR WHERE ID = 3");
        list2.add("DELETE FROM T_ERROR WHERE ID = 4");
        System.out.println(ConnectDB.deleteContent(list2));
        List<Map<String,Object>> l2 = ConnectDB.getList("SELECT * FROM T_ERROR");
        for(Map<String,Object> m : l2){
            for(String name : m.keySet()){
                System.out.println(m.get(name));
            }
        }
    }
}


