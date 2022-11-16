package com.example.test.logic;

import com.example.test.database.ConnectDB;
import com.example.test.entity.Peiyangfangan;
import com.example.test.entity.Peiyangmubiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PeiyangfanganMgr {
    /**
     * ID
     * ZHUANYE_ID
     * VERSION
     */

    public static void add(Peiyangfangan p) {
        String sql =
                "INSERT INTO T_PEIYANGFANGAN(ID,ZHUANYE_ID,VERSION) "+
                        "VALUES('"+
                        p.getId() + "','" +
                        p.getZhuanyeId() + "','" +
                        p.getVersion() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public static void add(List<Peiyangfangan> ps) {
        List<String> sqls = new ArrayList<String>();
        for (Peiyangfangan p : ps) {
            String sql =
                    "INSERT INTO T_PEIYANGFANGAN(ID,ZHUANYE_ID,VERSION) "+
                            "VALUES('"+
                            p.getId() + "','" +
                            p.getZhuanyeId() + "','" +
                            p.getVersion() + "')";
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.addContent(sqls);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public static void deleteByID(String ID) {
        String sql = "DELETE FROM T_PEIYANGFANGAN WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteByZHUANYEID(String ID) {
        String sql = "DELETE FROM T_PEIYANGFANGAN WHERE ZHUANYE_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteAll(){
        List<Peiyangfangan> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Peiyangfangan p : list) {
            String sql = "DELETE FROM T_PEIYANGFANGAN WHERE ID = "+ p.getId();
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

    public static Peiyangfangan getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGFANGAN WHERE ID = " + ID);
        Peiyangfangan p = new Peiyangfangan(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("ZHUANYE_ID")),
                String.valueOf(list.get(0).get("VERSION"))
        );
        return p;
    }

    public static List<Peiyangfangan> getByZHUANYEID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGFANGAN WHERE PEIYANGFANGAN_ID = " + ID);
        List <Peiyangfangan> result = new ArrayList<Peiyangfangan>();
        for (Map<String,Object> map : list) {
            Peiyangfangan p = new Peiyangfangan(
                    String.valueOf(list.get(0).get("ID")),
                    String.valueOf(list.get(0).get("ZHUANYE_ID")),
                    String.valueOf(list.get(0).get("VERSION"))
            );
            result.add(p);
        }
        return result;
    }

    public static List<Peiyangfangan> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGFANGAN");
        List<Peiyangfangan> result = new ArrayList<Peiyangfangan>();
        for (Map<String,Object> map : list) {
            Peiyangfangan p = new Peiyangfangan(
                    String.valueOf(list.get(0).get("ID")),
                    String.valueOf(list.get(0).get("ZHUANYE_ID")),
                    String.valueOf(list.get(0).get("VERSION"))
            );
            result.add(p);
        }
        return result;
    }
}
