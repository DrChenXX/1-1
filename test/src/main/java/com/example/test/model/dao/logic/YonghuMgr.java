package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Yonghu;
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
                "INSERT INTO T_YONGHU(ID,PASSWORD,NAME,DIANHUA,YOUXIANG,TOKEN,TYPE,YUANXI,ZHICHENG) "+
                        "VALUES('"+
                        y.getId() + "','" +
                        y.getPassword() + "','" +
                        y.getName() + "','" +
                        y.getDianhua() + "','" +
                        y.getYouxiang() + "','" +
                        y.getToken() + "','" +
                        y.getYuanxi() + "','" +
                        y.getZhicheng() + "','" +
                        y.getType() + "')";
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
                    "INSERT INTO T_YONGHU(ID,PASSWORD,NAME,DIANHUA,YOUXIANG,TOKEN,TYPE,YUANXI,ZHICHENG) "+
                            "VALUES('"+
                            y.getId() + "','" +
                            y.getPassword() + "','" +
                            y.getName() + "','" +
                            y.getDianhua() + "','" +
                            y.getYouxiang() + "','" +
                            y.getToken() + "','" +
                            y.getYuanxi() + "','" +
                            y.getZhicheng() + "','" +
                            y.getType() + "')";
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
                String.valueOf(list.get(0).get("YOUXIANG")),
                String.valueOf(list.get(0).get("TOKEN")),
                String.valueOf(list.get(0).get("TYPE")),
                String.valueOf(list.get(0).get("YUANXI")),
                String.valueOf(list.get(0).get("ZHICHENG"))
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
                    String.valueOf(list.get(0).get("ID")),
                    String.valueOf(list.get(0).get("PASSWORD")),
                    String.valueOf(list.get(0).get("NAME")),
                    String.valueOf(list.get(0).get("DIANHUA")),
                    String.valueOf(list.get(0).get("YOUXIANG")),
                    String.valueOf(list.get(0).get("TOKEN")),
                    String.valueOf(list.get(0).get("TYPE")),
                    String.valueOf(list.get(0).get("YUANXI")),
                    String.valueOf(list.get(0).get("ZHICHENG"))
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
                    String.valueOf(list.get(0).get("ID")),
                    String.valueOf(list.get(0).get("PASSWORD")),
                    String.valueOf(list.get(0).get("NAME")),
                    String.valueOf(list.get(0).get("DIANHUA")),
                    String.valueOf(list.get(0).get("YOUXIANG")),
                    String.valueOf(list.get(0).get("TOKEN")),
                    String.valueOf(list.get(0).get("TYPE")),
                    String.valueOf(list.get(0).get("YUANXI")),
                    String.valueOf(list.get(0).get("ZHICHENG"))
            );
            result.add(y);
        }
        return result;
    }

    public void updateTokenByID(String userid, String token) {
        String sql = "UPDATE T_YONGHU SET TOKEN = '" + token + "' WHERE ID = " + userid;
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("更改token成功");
        } else {
            System.out.println("更改token失败");
        }
    }
}
