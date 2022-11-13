package logic;

import database.ConnectDB;
import entity.Dangqianmubiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DangqianmubiaoMgr {

    // 增加单条信息
    public static void add(Dangqianmubiao d) {
        String sql =
                "INSERT INTO T_DANGQIANMUBIAO(ID,DANGQIANKECHENG_ID,MUBIAO_ID,CONTENT) "+
                        "VALUES('"+
                        d.getId()+ "','"+
                        d.getDangqiankechengId() + "','" +
                        d.getMubiaoId()+ "','" +
                        d.getContent() + ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public static void add(List<Dangqianmubiao> ds) {
        List<String> sqls = new ArrayList<String>();
        for (Dangqianmubiao d :ds){
            String sql =
                    "INSERT INTO T_DANGQIANMUBIAO(ID,DANGQIANKECHENG_ID,MUBIAO_ID,CONTENT) "+
                            "VALUES('"+
                            d.getId()+ "','"+
                            d.getDangqiankechengId() + "','" +
                            d.getMubiaoId()+ "','" +
                            d.getContent() + ")";
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
    public static void deleteByID(String ID) {
        String sql = "DELETE FROM T_DANGQIANMUBIAO WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过当前课程ID删除
    public static void deleteByDangqiankechengID(String ID) {
        String sql = "DELETE FROM T_DANGQIANMUBIAO WHERE DANGQIANKECHENG_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过目标ID删除
    public static void deleteByMubiaoID(String ID) {
        String sql = "DELETE FROM T_DANGQIANMUBIAO WHERE MUBIAO_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 删除所有ID
    public static void deleteAll(){
        List<Dangqianmubiao> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Dangqianmubiao d : list) {
            String sql = "DELETE FROM T_DANGQIANMUBIAO WHERE ID = "+ d.getId();
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
    public static Dangqianmubiao getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANMUBIAO WHERE ID = " + ID);
        Dangqianmubiao d = new Dangqianmubiao(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("DANGQIANKECHENG_ID")),
                String.valueOf(list.get(0).get("MUBIAO_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return d;
    }
    // 通过当前课程ID
    public static List<Dangqianmubiao> getByDangqiankechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANMUBIAO WHERE DANGQIANKECHENG_ID = " + ID);
        List<Dangqianmubiao> result = new ArrayList<Dangqianmubiao>();
        for (Map<String,Object> map : list) {
            Dangqianmubiao d = new Dangqianmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("MUBIAO_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(d);
        }
        return result;
    }
    // 通过目标ID查
    public static List<Dangqianmubiao> getByMubiaoID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANMUBIAO WHERE MUBIAO_ID = " + ID);
        List<Dangqianmubiao> result = new ArrayList<Dangqianmubiao>();
        for (Map<String,Object> map : list) {
            Dangqianmubiao d = new Dangqianmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("MUBIAO_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(d);
        }
        return result;
    }
    // 查所有ID
    public static List<Dangqianmubiao> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANMUBIAO");
        List<Dangqianmubiao> result = new ArrayList<Dangqianmubiao>();
        for (Map<String,Object> map : list) {
            Dangqianmubiao d = new Dangqianmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("MUBIAO_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(d);
        }
        return result;
    }
}
