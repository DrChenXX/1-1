package logic;

import database.ConnectDB;
import entity.Error;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ErrorMgr {

    // 增加单条信息
    public static void add(Error e) {
        String sql =
                "INSERT INTO T_ERROR(ID,SHIJIAN,CONTENT) "+
                        "VALUES('"+
                        e.getId()+ "','"+
                        e.getShijian() + "','" +
                        e.getContent()+ "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public static void add(List<Error> es) {
        List<String> sqls = new ArrayList<String>();
        for (Error e : es){
            String sql =
                    "INSERT INTO T_ERROR(ID,SHIJIAN,CONTENT) "+
                            "VALUES('"+
                            e.getId()+ "','"+
                            e.getShijian() + "','" +
                            e.getContent()+ "')";
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
        String sql = "DELETE FROM T_ERROR WHERE ID = " + ID;
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
        List<Error> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Error e : list) {
            String sql = "DELETE FROM T_ERROR WHERE ID = "+ e.getId();
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
    public static Error getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ERROR WHERE ID = " + ID);
        Error e = new Error(
                String.valueOf(list.get(0).get("ID")),
                Timestamp.valueOf(String.valueOf(list.get(0).get("SHIJIAN"))),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return e;
    }
    // 查全部ID
    public static List<Error> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ERROR");
        List<Error> result = new ArrayList<Error>();
        for (Map<String,Object> map : list) {
            Error e = new Error(
                    String.valueOf(list.get(0).get("ID")),
                    Timestamp.valueOf(String.valueOf(list.get(0).get("SHIJIAN"))),
                    String.valueOf(list.get(0).get("CONTENT"))
            );
            result.add(e);
        }
        return result;
    }
}
