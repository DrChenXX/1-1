package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Xuesheng;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class XueshengMgr {
    /**
     * ID
     * NAME
     * ZHUANYE_ID
     * GRADE
     * BANJI
     * YUANXI
     */

    public void add(Xuesheng x) {
        String sql =
                "INSERT INTO T_XUESHENG(ID,NAME,ZHUANYE_ID,GRADE,BANJI,YUANXI) "+
                        "VALUES('"+
                        x.getId() + "','" +
                        x.getName() + "','" +
                        x.getZhuanyeId() + "','" +
                        x.getGrade() + "','" +
                        x.getBanji() + "','" +
                        x.getYuanxi() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public void add(List<Xuesheng> xs) {
        List<String> sqls = new ArrayList<String>();
        for (Xuesheng x : xs) {
            String sql =
                    "INSERT INTO T_XUESHENG(ID,NAME,ZHUANYE_ID,GRADE,BANJI,YUANXI) "+
                            "VALUES('"+
                            x.getId() + "','" +
                            x.getName() + "','" +
                            x.getZhuanyeId() + "','" +
                            x.getGrade() + "','" +
                            x.getBanji() + "','" +
                            x.getYuanxi() + "')";
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
        String sql = "DELETE FROM T_XUESHENG WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteByName(String NAME) {
        String sql = "DELETE FROM T_XUESHENG WHERE NAME = " + NAME;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteByZHUANYEID(String ID) {
        String sql = "DELETE FROM T_XUESHENG WHERE ZHUANYE_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteAll(){
        List<Xuesheng> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Xuesheng x : list) {
            String sql = "DELETE FROM T_XUESHENG WHERE ID = "+ x.getId();
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

    public Xuesheng getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XUESHENG WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Xuesheng x = new Xuesheng(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("NAME")),
                String.valueOf(list.get(0).get("ZHUANYE_ID")),
                String.valueOf(list.get(0).get("GRADE")),
                String.valueOf(list.get(0).get("BANJI")),
                String.valueOf(list.get(0).get("YUANXI"))
        );
        return x;
    }

    public List<Xuesheng> getByNAME(String NAME) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XUESHENG WHERE NAME = " + NAME);
        if (list.isEmpty()) {
            return null;
        }
        List <Xuesheng> result = new ArrayList<Xuesheng>();
        for (Map<String,Object> map : list) {
            Xuesheng x = new Xuesheng(
                    String.valueOf(list.get(0).get("ID")),
                    String.valueOf(list.get(0).get("NAME")),
                    String.valueOf(list.get(0).get("ZHUANYE_ID")),
                    String.valueOf(list.get(0).get("GRADE")),
                    String.valueOf(list.get(0).get("BANJI")),
                    String.valueOf(list.get(0).get("YUANXI"))
            );
            result.add(x);
        }
        return result;
    }

    public List<Xuesheng> getByZHUANYEID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XUESHENG WHERE ZHUANYE_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List <Xuesheng> result = new ArrayList<Xuesheng>();
        for (Map<String,Object> map : list) {
            Xuesheng x = new Xuesheng(
                    String.valueOf(list.get(0).get("ID")),
                    String.valueOf(list.get(0).get("NAME")),
                    String.valueOf(list.get(0).get("ZHUANYE_ID")),
                    String.valueOf(list.get(0).get("GRADE")),
                    String.valueOf(list.get(0).get("BANJI")),
                    String.valueOf(list.get(0).get("YUANXI"))
            );
            result.add(x);
        }
        return result;
    }

    public List<Xuesheng> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XUESHENG");
        if (list.isEmpty()) {
            return null;
        }
        List<Xuesheng> result = new ArrayList<Xuesheng>();
        for (Map<String,Object> map : list) {
            Xuesheng x = new Xuesheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("ZHUANYE_ID")),
                    String.valueOf(map.get("GRADE")),
                    String.valueOf(map.get("BANJI")),
                    String.valueOf(map.get("YUANXI"))
            );
            result.add(x);
        }
        return result;
    }
}
