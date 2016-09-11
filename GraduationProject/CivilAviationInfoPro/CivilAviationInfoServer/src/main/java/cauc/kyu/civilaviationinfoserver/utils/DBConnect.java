package cauc.kyu.civilaviationinfoserver.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库管理类
 * Created by Administrator on 2016/5/6.
 */
public class DBConnect {
    private static String user;
    private static String password;

    private static DBConnect instance = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        user = Constant.USER;
        password = Constant.PASSWORD;
    }

    private DBConnect() {
    }


    public static DBConnect getInstance() {
        if (instance == null) {
            synchronized (DBConnect.class) {
                if (instance == null) {
                    instance = new DBConnect();
                    return instance;
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);
        info.put("useSSL", "false");
        info.put("useUnicode","true");
        info.put("characterEncoding","utf8");
        Connection con = DriverManager.getConnection(Constant.DBURL, info);
        return con;
    }

}
