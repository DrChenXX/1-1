package com.example.test.interfaces.model.dao.logic;

import com.example.test.interfaces.model.dao.database.ConnectDB;
import com.example.test.interfaces.model.entity.Kecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KechengMgr {

    // 增加单条信息
    public void add(Kecheng k) {
        String sql =
                "INSERT INTO T_KECHENG(ID,NAME,TEACHER_ID,PEIYANGFANGAN_ID,KAIKESHIJIAN,XUEFEN) "+
                        "VALUES('"+
                        k.getId()+ "','"+
                        k.getName() + "','" +
                        k.getTeacherId() + "','" +
                        k.getPeiyangfanganId() + "','" +
                        k.getKaikeshijian() + "'," +
                        k.getXuefen()+ ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public void add(List<Kecheng> ks) {
        List<String> sqls = new ArrayList<String>();
        for (Kecheng k : ks){
            String sql =
                    "INSERT INTO T_KECHENG(ID,NAME,TEACHER_ID,PEIYANGFANGAN_ID,KAIKESHIJIAN,XUEFEN) "+
                            "VALUES('"+
                            k.getId()+ "','"+
                            k.getName() + "','" +
                            k.getTeacherId() + "','" +
                            k.getPeiyangfanganId() + "','" +
                            k.getKaikeshijian() + "'," +
                            k.getXuefen()+ ")";
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

    // 通过ID删除
    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_KECHENG WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过老师ID删除
    public void deleteByTeacherID(String ID) {
        String sql = "DELETE FROM T_KECHENG WHERE TEACHER_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通往过培养方案ID删除
    public void deleteByPeiyangfanganID(String ID) {
        String sql = "DELETE FROM T_KECHENG WHERE PEIYANGFANGAN_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 删除所有ID
    public void deleteAll(){
        List<Kecheng> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Kecheng k : list) {
            String sql = "DELETE FROM T_KECHENG WHERE ID = "+ k.getId();
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

    // 通过ID查
    public Kecheng getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENG WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Kecheng k = new Kecheng(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("NAME")),
                String.valueOf(list.get(0).get("TEACHER_ID")),
                String.valueOf(list.get(0).get("PEIYANGFANGAN_ID")),
                String.valueOf(list.get(0).get("KAIKESHIJIAN")),
                Integer.parseInt(String.valueOf(list.get(0).get("XUEFEN")))
        );
        return k;
    }
    // 通过老师ID查
    public List<Kecheng> getByTeacherID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENG WHERE TEACHER_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Kecheng> result = new ArrayList<Kecheng>();
        for (Map<String,Object> map : list) {
            Kecheng k = new Kecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(k);
        }
        return result;
    }
    // 通过培养方案ID查
    public List<Kecheng> getByPeiyangfanganID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENG WHERE PEIYANGFANGAN_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Kecheng> result = new ArrayList<Kecheng>();
        for (Map<String,Object> map : list) {
            Kecheng k = new Kecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(k);
        }
        return result;
    }
    // 查所有ID
    public List<Kecheng> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENG");
        if (list.isEmpty()) {
            return null;
        }
        List<Kecheng> result = new ArrayList<Kecheng>();
        for (Map<String,Object> map : list) {
            Kecheng k = new Kecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(k);
        }
        return result;
    }
}
