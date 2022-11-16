package com.example.test.logic;

import com.example.test.database.ConnectDB;
import com.example.test.entity.Xueshengduizhibiaodian;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class XueshengduizhibiaodianMgr {
    /**
     * ID
     * XUESHENG_ID
     * ZHIBIAODIAN_ID
     * CHENGJI
     */

    public static void add(Xueshengduizhibiaodian x) {
        String sql =
                "INSERT INTO T_XUESHENGDUIZHIBIAODIAN(ID,XUESHENG_ID,ZHIBIAODIAN_ID,CHENGJI) "+
                        "VALUES('"+
                        x.getId() + "','" +
                        x.getXueshengId() + "','" +
                        x.getZhibiaodianId() + "'," +
                        x.getChengji() + ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public static void add(List<Xueshengduizhibiaodian> xs) {
        List<String> sqls = new ArrayList<String>();
        for (Xueshengduizhibiaodian x : xs){
            String sql =
                    "INSERT INTO T_XUESHENGDUIZHIBIAODIAN(ID,XUESHENG_ID,ZHIBIAODIAN_ID,CHENGJI) "+
                            "VALUES('"+
                            x.getId() + "','" +
                            x.getXueshengId() + "','" +
                            x.getZhibiaodianId() + "'," +
                            x.getChengji() + ")";
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.addContent(sqls);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public static void deleteByID(String ID) {
        String sql = "DELETE FROM T_XUESHENGDUIZHIBIAODIAN WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteByXUESHENGID(String ID) {
        String sql = "DELETE FROM T_XUESHENGDUIZHIBIAODIAN WHERE XUESHENG_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteByZHIBIAODIANID(String ID) {
        String sql = "DELETE FROM T_XUESHENGDUIZHIBIAODIAN WHERE ZHIBIAODIAN_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteAll(){
        List<Xueshengduizhibiaodian> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Xueshengduizhibiaodian x : list) {
            String sql = "DELETE FROM T_XUESHENGDUIZHIBIAODIAN WHERE ID = "+ x.getId();
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.deleteContent(sqls);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static Xueshengduizhibiaodian getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XUESHENGDUIZHIBIAODIAN WHERE ID = " + ID);
        Xueshengduizhibiaodian x = new Xueshengduizhibiaodian(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("NAME")),
                String.valueOf(list.get(0).get("FUZEREN_ID")),
                Integer.parseInt(String.valueOf(list.get(0).get("CHENGJI")))
        );
        return x;
    }

    public static List<Xueshengduizhibiaodian> getByXUESHENGID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XUESHENGDUIZHIBIAODIAN WHERE XUESHENG_ID = " + ID);
        List<Xueshengduizhibiaodian> result = new ArrayList<Xueshengduizhibiaodian>();
        for (Map<String, Object> map : list) {
            Xueshengduizhibiaodian x = new Xueshengduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("FUZEREN_ID")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(x);
        }
        return result;
    }

    public static List<Xueshengduizhibiaodian> getByZHIBIAODIANID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XUESHENGDUIZHIBIAODIAN WHERE ZHIBIAODIAN_ID = " + ID);
        List<Xueshengduizhibiaodian> result = new ArrayList<Xueshengduizhibiaodian>();
        for (Map<String, Object> map : list) {
            Xueshengduizhibiaodian x = new Xueshengduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("FUZEREN_ID")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(x);
        }
        return result;
    }

    public static List<Xueshengduizhibiaodian> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XUESHENGDUIZHIBIAODIAN");
        List<Xueshengduizhibiaodian> result = new ArrayList<Xueshengduizhibiaodian>();
        for (Map<String,Object> map : list) {
            Xueshengduizhibiaodian x = new Xueshengduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("XUESHENG_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(x);
        }
        return result;
    }
}
