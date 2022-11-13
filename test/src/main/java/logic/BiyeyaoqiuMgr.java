package logic;

import database.ConnectDB;
import java.util.ArrayList;
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
    public static void Add(int n) {
        String ID = "1";
        String PEIYANGFANGAN_ID = "1";
        String CONTENT = "xxx";
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            list.add("INSERT INTO T_BIYEYAOQIU(ID,PEIYANGFANGAN_ID,CONTENT) VALUES("
                        + ID + "," + PEIYANGFANGAN_ID + "," + CONTENT + ")");
        }
    }
    public static void DeleteID(String ID) {
        ConnectDB.deleteContent("DELETE FROM T_BIYEYAOQIU WHERE ID = " + ID);
    }
    public static void DeletePeiyangfanganID(String PEIYANGFANGAN_ID) {
        ConnectDB.deleteContent("DELETE FROM T_BIYEYAOQIU WHERE PEIYANGFANGAN_ID = " + PEIYANGFANGAN_ID);
    }
}
