package logic;

import database.ConnectDB;

import java.util.List;
import java.util.Map;

public class BiyeyaoqiuMgr {
    /**
     * ID
     * PEIYANGFANGAN_ID
     * CONTENT
     */
    public static void SearchPeiyangID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_BIYEYAOQIU WHERE PEIYANGFANGAN_ID = " + ID);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get("ID"));
            System.out.println(list.get(i).get("PEIYANGFANGAN_ID"));
            System.out.println(list.get(i).get("CONTENT"));
        }
    }
}
