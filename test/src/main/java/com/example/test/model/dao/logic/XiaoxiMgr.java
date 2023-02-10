package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Xiaoxi;
import com.example.test.model.entity.Yonghu;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class XiaoxiMgr {

    public void add(Xiaoxi xiaoxi) {
        String sql =
                "INSERT INTO T_XIAOXI(ID,FROM_ID,FROMNAME,TO_ID,TONAME,ISREAD,DATA,PEIYANGFANGANID,HUIFU) "+
                        "VALUES('"+
                        xiaoxi.getId() + "','" +
                        xiaoxi.getFromId() + "','" +
                        xiaoxi.getFromName() + "','" +
                        xiaoxi.getToId() + "','" +
                        xiaoxi.getToName() + "','" +
                        xiaoxi.getIsRead() + "','" +
                        xiaoxi.getData() + "','" +
                        xiaoxi.getPeiyangfanganID() + "','" +
                        xiaoxi.getHuifu() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public void add(List<Xiaoxi> xiaoxis) {
        List<String> sqls = new ArrayList<String>();
        for (Xiaoxi xiaoxi : xiaoxis){
            String sql =
                    "INSERT INTO T_XIAOXI(ID,FROM_ID,FROMNAME,TO_ID,TONAME,ISREAD,DATA,PEIYANGFANGANID,HUIFU) "+
                            "VALUES('"+
                            xiaoxi.getId() + "','" +
                            xiaoxi.getFromId() + "','" +
                            xiaoxi.getFromName() + "','" +
                            xiaoxi.getToId() + "','" +
                            xiaoxi.getToName() + "','" +
                            xiaoxi.getIsRead() + "','" +
                            xiaoxi.getData() + "','" +
                            xiaoxi.getPeiyangfanganID() + "','" +
                            xiaoxi.getHuifu() + "')";
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.addContent(sqls);
        if (check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_XIAOXI WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void readByID(String ID) {
        String sql = "UPDATE T_XIAOXI SET ISREAD='已读' WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("消息已读成功");
        } else {
            System.out.println("消息已读失败");
        }
    }

    public Xiaoxi getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XIAOXI WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Xiaoxi xiaoxi = new Xiaoxi(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("FROM_ID")),
                String.valueOf(list.get(0).get("FROMNAME")),
                String.valueOf(list.get(0).get("TO_ID")),
                String.valueOf(list.get(0).get("TONAME")),
                String.valueOf(list.get(0).get("ISREAD")),
                String.valueOf(list.get(0).get("DATA")),
                String.valueOf(list.get(0).get("PEIYANGFANGANID")),
                String.valueOf(list.get(0).get("HUIFU"))
        );
        return xiaoxi;
    }

    public List<Xiaoxi> getByToID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XIAOXI WHERE TO_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Xiaoxi> result = new ArrayList<Xiaoxi>();
        for (Map<String, Object> map : list) {
            Xiaoxi xiaoxi = new Xiaoxi(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("FROM_ID")),
                    String.valueOf(map.get("FROMNAME")),
                    String.valueOf(map.get("TO_ID")),
                    String.valueOf(map.get("TONAME")),
                    String.valueOf(map.get("ISREAD")),
                    String.valueOf(map.get("DATA")),
                    String.valueOf(map.get("PEIYANGFANGANID")),
                    String.valueOf(map.get("HUIFU")));
            result.add(xiaoxi);
        }
        return result;
    }

    public List<Xiaoxi> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_XIAOXI");
        if (list.isEmpty()) {
            return null;
        }
        List<Xiaoxi> result = new ArrayList<Xiaoxi>();
        for (Map<String, Object> map : list) {
            Xiaoxi xiaoxi = new Xiaoxi(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("FROM_ID")),
                    String.valueOf(map.get("FROMNAME")),
                    String.valueOf(map.get("TO_ID")),
                    String.valueOf(map.get("TONAME")),
                    String.valueOf(map.get("ISREAD")),
                    String.valueOf(map.get("DATA")),
                    String.valueOf(map.get("PEIYANGFANGANID")),
                    String.valueOf(map.get("HUIFU")));
            result.add(xiaoxi);
        }
        return result;
    }
}
