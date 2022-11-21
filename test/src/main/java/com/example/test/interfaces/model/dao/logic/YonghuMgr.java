package com.example.test.interfaces.model.dao.logic;

import com.example.test.interfaces.model.dao.database.ConnectDB;
import com.example.test.interfaces.model.entity.Yonghu;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Component
public class YonghuMgr {
    /**
     * ID
     * PASSWORD
     * NAME
     * DIANHUA
     * YOUXIANG
     */

    public void add(Yonghu y) {
        String sql =
                "INSERT INTO T_YONGHU(ID,PASSWORD,NAME,DIANHUA,YOUXIANG) "+
                        "VALUES('"+
                        y.getId() + "','" +
                        y.getPassword() + "','" +
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

    public void add(List<Yonghu> ys) {
        List<String> sqls = new ArrayList<String>();
        for (Yonghu y : ys) {
            String sql =
                    "INSERT INTO T_YONGHU(ID,PASSWORD,NAME,DIANHUA,YOUXIANG) "+
                            "VALUES('"+
                            y.getId() + "','" +
                            y.getPassword() + "','" +
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

    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_YONGHU WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteByName(String NAME) {
        String sql = "DELETE FROM T_YONGHU WHERE NAME = " + NAME;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteAll() {
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

    public Yonghu getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_YONGHU WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        if (list.isEmpty()) {
            return null;
        }
        Yonghu y = new Yonghu(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("PASSWORD")),
                String.valueOf(list.get(0).get("NAME")),
                String.valueOf(list.get(0).get("DIANHUA")),
                String.valueOf(list.get(0).get("YOUXIANG"))
        );
        return y;
    }

    public List<Yonghu> getByNAME(String NAME) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_YONGHU WHERE NAME = " + NAME);
        if (list.isEmpty()) {
            return null;
        }
        List <Yonghu> result = new ArrayList<Yonghu>();
        if (list.isEmpty()) {
            return null;
        }
        for (Map<String,Object> map : list) {
            Yonghu y = new Yonghu(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("PASSWORD")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("DIANHUA")),
                    String.valueOf(map.get("YOUXIANG"))
            );
            result.add(y);
        }
        return result;
    }

    public List<Yonghu> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_YONGHU");
        if (list.isEmpty()) {
            return null;
        }
        List<Yonghu> result = new ArrayList<Yonghu>();
        if (list.isEmpty()) {
            return null;
        }
        for (Map<String, Object> map : list) {
            Yonghu y = new Yonghu(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("PASSWORD")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("DIANHUA")),
                    String.valueOf(map.get("YOUXIANG"))
            );
            result.add(y);
        }
        return result;
    }
}
