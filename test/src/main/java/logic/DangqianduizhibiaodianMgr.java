package logic;

import database.ConnectDB;

import java.util.List;
import java.util.Map;

public class DangqianduizhibiaodianMgr {
    /**
     * ID
     * DANGQIANKECHENG_ID
     * ZHIBIAODIAN_ID
     * YUAN_ID
     * CONTENT
     * CHENGJI
     */
    // 根据课程ID查课程对指标点的支持
    public static void SearchKechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANDUIZHIBIAODIAN WHERE DANGQIANKECHENG_ID = " + ID);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get("ID"));
            System.out.println(list.get(i).get("DANGQIANKECHENG_ID"));
            System.out.println(list.get(i).get("ZHIBIAODIAN_ID"));
            System.out.println(list.get(i).get("YUAN_ID"));
            System.out.println(list.get(i).get("CONTENT"));
            System.out.println(list.get(i).get("CHENGJI"));
        }
    }

    public static void SearchZhibiaodianID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANDUIZHIBIAODIAN WHERE ZHIBIAODIAN_ID = " + ID);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get("ID"));
            System.out.println(list.get(i).get("DANGQIANKECHENG_ID"));
            System.out.println(list.get(i).get("ZHIBIAODIAN_ID"));
            System.out.println(list.get(i).get("YUAN_ID"));
            System.out.println(list.get(i).get("CONTENT"));
            System.out.println(list.get(i).get("CHENGJI"));
        }
    }

    public static void Add(int n) {

    }
}
