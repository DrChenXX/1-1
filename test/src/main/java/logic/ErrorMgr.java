package logic;

import database.ConnectDB;

import java.util.List;
import java.util.Map;

public class ErrorMgr {
    public static void Search() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ERROR");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get("ID"));
            System.out.println(list.get(i).get("SHIJIAN"));
            System.out.println(list.get(i).get("CONTENT"));
        }
    }
}
