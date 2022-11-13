package logic;

import java.sql.*;

public class BiyeyaoqiuMgr {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://43.139.96.180:3306/Protest?characterEncoding=utf-8&rewriteBatchedStatement=true";

    static final String USER = "root";
    static final String PASS = "Cxy_20020208";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开连接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // 执行查询
            System.out.println("实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "select * from T_BIYEYAOQIU";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                String id = rs.getNString("ID");
                String peiyangfanganID = rs.getNString("PEIYANGFANGAN_ID");
                String content = rs.getNString("CONTENT");

                // 输出数据
                System.out.println("ID:" + id);
                System.out.println("PEIYANGFANGAN_ID:" + peiyangfanganID);
                System.out.println("CONTENT:" + content);
            }

            // 完成后关闭连接
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }
    }
}
