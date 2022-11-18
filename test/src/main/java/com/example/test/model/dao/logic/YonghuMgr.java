package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Yonghu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YonghuMgr {
    /**
     * ID
     * NAME
     * DIANHUA
     * YOUXIANG
     */

    public static void add(Yonghu y) {
        String sql =
                "INSERT INTO T_YONGHU(ID,NAME,DIANHUA,YOUXIANG) "+
                        "VALUES('"+
                        y.getId() + "','" +
                        y.getName() + "','" +
                        y.getDianhua() + "','" +
                        y.getYouxiang() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public static void add(List<Yonghu> ys) {
        List<String> sqls = new ArrayList<String>();
        for (Yonghu y : ys) {
            String sql =
                    "INSERT INTO T_YONGHU(ID,NAME,DIANHUA,YOUXIANG) "+
                            "VALUES('"+
                            y.getId() + "','" +
                            y.getName() + "','" +
                            y.getDianhua() + "','" +
                            y.getYouxiang() + "')";
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
        String sql = "DELETE FROM T_YONGHU WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteByName(String NAME) {
        String sql = "DELETE FROM T_YONGHU WHERE NAME = " + NAME;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteAll() {
        List<Yonghu> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for (Yonghu y : list) {
            String sql = "DELETE FROM T_YONGHU WHERE ID = " + y.getId();
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

    public static Yonghu getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_YONGHU WHERE ID = " + ID);
        Yonghu y = new Yonghu(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("NAME")),
                String.valueOf(list.get(0).get("DIANHUA")),
                String.valueOf(list.get(0).get("YOUXIANG"))
        );
        return y;
    }

    public static List<Yonghu> getByNAME(String NAME) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_YONGHU WHERE NAME = " + NAME);
        List <Yonghu> result = new ArrayList<Yonghu>();
        for (Map<String,Object> map : list) {
            Yonghu y = new Yonghu(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("DIANHUA")),
                    String.valueOf(map.get("YOUXIANG"))
            );
            result.add(y);
        }
        return result;
    }

    public static List<Yonghu> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_YONGHU");
        List<Yonghu> result = new ArrayList<Yonghu>();
        for (Map<String, Object> map : list) {
            Yonghu y = new Yonghu(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("DIANHUA")),
                    String.valueOf(map.get("YOUXIANG"))
            );
            result.add(y);
        }
        return result;
    }
}
