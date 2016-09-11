package cauc.kyu.civilaviationinfoserver.utils;

/**
 * 常量
 * Created by Administrator on 2016/5/4.
 */
public class Constant {
    /******************************DBinfo**********************************/
    public static final String DBNAME = "civilaviationinfo";
    public static final String DBURL = "jdbc:mysql://localhost:3306/" + DBNAME;
    public static final String USER = "root";
    public static final String PASSWORD = "123456";


    /*******************************状态码************************************/
    public static final int SUCCESS = 0;  //成功
    public static final int ERROR_REQUEST = 201;  //错误的请求
    public static final int LACK_PARAM = 202;  //缺少参数
    public static final int SERVER_ERROR = 101;  //服务器错误
    public static final int SERVER_UNAVAILABLE = 102;  //服务器不可用
    public static final int DB_ERROR = 301;  //数据库访问出错

    /*********************************表名********************************/
    public static final String TABLE_HOTNEWS = "hotnews";
    public static final String TABLE_INTENEWS = "intenews";
    public static final String TABLE_GATNEWS = "gatnews";
    public static final String TABLE_ARTICLES = "articles";
    public static final String TABLE_IMG = "img";
    public static final String TABLE_USER = "user";
    public static final String TABLE_COLLECT = "collect";

}
