package logic;

import java.sql.*;

public class Mysql {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://43.139.96.180:3306/Protest?characterEncoding=utf-8&rewriteBatchedStatement=true";

    static final String USER = "cxy";
    static final String PASS = "Cxy_20020208";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            //加载mysql的驱动类
            Class.forName(JDBC_DRIVER);
            //获取数据库连接
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            //mysql查询语句
            String sql = "SELECT ID FROM T_ERROR";
            PreparedStatement prst = connection.prepareStatement(sql);
            //结果集
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                System.out.println("ID:" + rs.getString("ID"));
            }
            rs.close();
            prst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}