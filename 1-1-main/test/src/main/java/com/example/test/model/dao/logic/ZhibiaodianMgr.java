package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Zhibiaodian;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ZhibiaodianMgr {
    /**
     * ID
     * BIYEYAOQIU_ID
     * CONTENT
     */

    public void add(Zhibiaodian z) {
        String sql =
                "INSERT INTO T_ZHIBIAODIAN(ID,BIYEYAOQIU_ID,CONTENT) "+
                        "VALUES('"+
                        z.getId() + "','" +
                        z.getBiyeyaoqiuId() + "','" +
                        z.getContent() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public void add(List<Zhibiaodian> zs) {
        List<String> sqls = new ArrayList<String>();
        for (Zhibiaodian z : zs) {
            String sql =
                    "INSERT INTO T_ZHIBIAODIAN(ID,BIYEYAOQIU_ID,CONTENT) "+
                            "VALUES('"+
                            z.getId() + "','" +
                            z.getBiyeyaoqiuId() + "','" +
                            z.getContent() + "')";
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

    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_ZHIBIAODIAN WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("删操作成功");
        }
    }

    public void deleteByBIYEYAOQIUID(String ID) {
        String sql = "DELETE FROM T_ZHIBIAODIAN WHERE BIYEYAOQIU_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("删操作成功");
        }
    }

    public void deleteAll() {
        List<Zhibiaodian> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for (Zhibiaodian z : list) {
            String sql = "DELETE FROM T_ZHIBIAODIAN WHERE ID = " + z.getId();
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.deleteContent(sqls);
        if(check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("删操作成功");
        }
    }

    public Zhibiaodian getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ZHIBIAODIAN WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Zhibiaodian z = new Zhibiaodian(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("BIYEYAOQIU_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return z;
    }

    public List<Zhibiaodian> getByBIYEYAOQIUID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ZHIBIAODIAN WHERE BIYEYAOQIU_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List <Zhibiaodian> result = new ArrayList<Zhibiaodian>();
        for (Map<String, Object> map : list) {
            Zhibiaodian z = new Zhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("BIYEYAOQIU_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(z);
        }
        return result;
    }

    public List<Zhibiaodian> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ZHIBIAODIAN");
        if (list.isEmpty()) {
            return null;
        }
        List<Zhibiaodian> result = new ArrayList<Zhibiaodian>();
        for (Map<String, Object> map : list) {
            Zhibiaodian z = new Zhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("BIYEYAOQIU_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(z);
        }
        return result;
    }
}
