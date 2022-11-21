package com.example.test.interfaces.model.dao.logic;

import com.example.test.interfaces.model.dao.database.ConnectDB;
import com.example.test.interfaces.model.entity.Dangqiankaohe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DangqiankaoheMgr {

    // 增加单条信息
    public void add(Dangqiankaohe d) {
        String sql =
                "INSERT INTO T_DANGQIANKAOHE(ID,CONTENT,DANGQIANKECHENG_ID,DANGQIANMUBIAO_ID,KAOHE_ID,ZHANBI) "+
                        "VALUES('"+
                        d.getId()+ "','"+
                        d.getContent() + "','" +
                        d.getDangqiankechengId()+ "','" +
                        d.getDangqianmubiaoId() + "','" +
                        d.getKaoheId() + "'," +
                        d.getZhanbi() + ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public void add(List<Dangqiankaohe> ds) {
        List<String> sqls = new ArrayList<String>();
        for (Dangqiankaohe d :ds){
            String sql =
                    "INSERT INTO T_DANGQIANKAOHE(ID,CONTENT,DANGQIANKECHENG_ID,DANGQIANMUBIAO_ID,KAOHE_ID,ZHANBI) "+
                            "VALUES('"+
                            d.getId()+ "','"+
                            d.getContent() + "','" +
                            d.getDangqiankechengId()+ "','" +
                            d.getDangqianmubiaoId() + "','" +
                            d.getKaoheId() + "'," +
                            d.getZhanbi() + ")";
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
        String sql = "DELETE FROM T_DANGQIANKAOHE WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过当前课程ID删除
    public void deleteByDangqiankechengID(String ID) {
        String sql = "DELETE FROM T_DANGQIANKAOHE WHERE DANGQIANKECHENG_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过当前目标ID删除
    public void deleteByDangqianmubiaoID(String ID) {
        String sql = "DELETE FROM T_DANGQIANKAOHE WHERE DANGQIANMUBIAO_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过考核ID删除
    public void deleteByKaoheID(String ID) {
        String sql = "DELETE FROM T_DANGQIANKAOHE WHERE KAOHE_ID = " + ID;
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
        List<Dangqiankaohe> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Dangqiankaohe d : list) {
            String sql = "DELETE FROM T_DANGQIANKAOHE WHERE ID = "+ d.getId();
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
    public Dangqiankaohe getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKAOHE WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Dangqiankaohe d = new Dangqiankaohe(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("CONTENT")),
                String.valueOf(list.get(0).get("DANGQIANKECHENG_ID")),
                String.valueOf(list.get(0).get("DANGQIANMUBIAO_ID")),
                String.valueOf(list.get(0).get("KAOHE_ID")),
                Integer.parseInt(String.valueOf(list.get(0).get("ZHANBI")))
        );
        return d;
    }
    // 通过当前课程ID查
    public List<Dangqiankaohe> getByDangqiankechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKAOHE WHERE DANGQIANKECHENG_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Dangqiankaohe> result = new ArrayList<Dangqiankaohe>();
        for (Map<String,Object> map : list) {
            Dangqiankaohe d = new Dangqiankaohe(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("CONTENT")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("DANGQIANMUBIAO_ID")),
                    String.valueOf(map.get("KAOHE_ID")),
                    Integer.parseInt(String.valueOf(map.get("ZHANBI")))
            );
            result.add(d);
        }
        return result;
    }
    // 通过当前目标ID查
    public List<Dangqiankaohe> getByDangqianmubiaoID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKAOHE WHERE DANGQIANMUBIAO_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Dangqiankaohe> result = new ArrayList<Dangqiankaohe>();
        for (Map<String,Object> map : list) {
            Dangqiankaohe d = new Dangqiankaohe(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("CONTENT")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("DANGQIANMUBIAO_ID")),
                    String.valueOf(map.get("KAOHE_ID")),
                    Integer.parseInt(String.valueOf(map.get("ZHANBI")))
            );
            result.add(d);
        }
        return result;
    }
    // 通过考核ID查
    public List<Dangqiankaohe> getByKaoheID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKAOHE WHERE KAOHE_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Dangqiankaohe> result = new ArrayList<Dangqiankaohe>();
        for (Map<String,Object> map : list) {
            Dangqiankaohe d = new Dangqiankaohe(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("CONTENT")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("DANGQIANMUBIAO_ID")),
                    String.valueOf(map.get("KAOHE_ID")),
                    Integer.parseInt(String.valueOf(map.get("ZHANBI")))
            );
            result.add(d);
        }
        return result;
    }
    // 查所有ID
    public List<Dangqiankaohe> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKAOHE");
        if (list.isEmpty()) {
            return null;
        }
        List<Dangqiankaohe> result = new ArrayList<Dangqiankaohe>();
        for (Map<String,Object> map : list) {
            Dangqiankaohe d = new Dangqiankaohe(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("CONTENT")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("DANGQIANMUBIAO_ID")),
                    String.valueOf(map.get("KAOHE_ID")),
                    Integer.parseInt(String.valueOf(map.get("ZHANBI")))
            );
            result.add(d);
        }
        return result;
    }

}
