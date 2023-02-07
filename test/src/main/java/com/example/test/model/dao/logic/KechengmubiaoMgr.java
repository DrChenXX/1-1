package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Kechengmubiao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class KechengmubiaoMgr {

    // 增加单条信息
    public void add(Kechengmubiao k) {
        String sql =
                "INSERT INTO T_KECHENGMUBIAO(ID,KECHENG_ID,CONTENT) "+
                        "VALUES('"+
                        k.getId()+ "','"+
                        k.getKechengId() + "','" +
                        k.getContent() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public void add(List<Kechengmubiao> ks) {
        List<String> sqls = new ArrayList<String>();
        for (Kechengmubiao k : ks){
            String sql =
                    "INSERT INTO T_KECHENGMUBIAO(ID,KECHENG_ID,CONTENT) "+
                            "VALUES('"+
                            k.getId()+ "','"+
                            k.getKechengId() + "','" +
                            k.getContent() + "')";
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
        String sql = "DELETE FROM T_KECHENGMUBIAO WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过课程ID删除
    public void deleteByKechengID(String ID) {
        String sql = "DELETE FROM T_KECHENGMUBIAO WHERE KECHENG_ID = " + ID;
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
        List<Kechengmubiao> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Kechengmubiao k : list) {
            String sql = "DELETE FROM T_KECHENGMUBIAO WHERE ID = "+ k.getId();
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
    public Kechengmubiao getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGMUBIAO WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Kechengmubiao k = new Kechengmubiao(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("KECHENG_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return k;
    }
    // 通过课程ID查
    public List<Kechengmubiao> getByKechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGMUBIAO WHERE KECHENG_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Kechengmubiao> result = new ArrayList<Kechengmubiao>();
        for (Map<String,Object> map : list) {
            Kechengmubiao k = new Kechengmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(k);
        }
        return result;
    }
    // 查所有ID
    public List<Kechengmubiao> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGMUBIAO");
        if (list.isEmpty()) {
            return null;
        }
        List<Kechengmubiao> result = new ArrayList<Kechengmubiao>();
        for (Map<String,Object> map : list) {
            Kechengmubiao k = new Kechengmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(k);
        }
        return result;
    }
}
