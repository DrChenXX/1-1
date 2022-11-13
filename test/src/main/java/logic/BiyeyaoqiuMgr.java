package logic;

import database.ConnectDB;

import java.util.List;
import java.util.Map;

public class BiyeyaoqiuMgr {
    public static void main(String[] args) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ERROR");
        System.out.println(list.get(0).get("CONTENT"));
    }
}
