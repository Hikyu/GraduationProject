package cauc.kyu.civilaviationinfoserver.model;

import cauc.kyu.civilaviationinfoserver.bean.UserBean;
import cauc.kyu.civilaviationinfoserver.utils.Constant;
import cauc.kyu.civilaviationinfoserver.utils.DBConnect;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/5/23.
 */
public class UserDao {
    private static final String TABLE_NAME = Constant.TABLE_USER;

    public UserBean getUser(int id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection con = DBConnect.getInstance().getConnection();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from ")
                .append(TABLE_NAME)
                .append(" where id = ")
                .append(id);
        UserBean user = queryRunner.query(con, sql.toString(), new BeanHandler<UserBean>(UserBean.class));
        return user;
    }

    public int createUser(String name,String psw) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection con = DBConnect.getInstance().getConnection();
        StringBuilder sql = new StringBuilder();
        sql.append("insert into ")
                .append(TABLE_NAME)
                .append("(name,password)")
                .append(" values(")
                .append('\'')
                .append(name)
                .append('\'')
                .append(",")
                .append('\'')
                .append(psw)
                .append('\'')
                .append(")");
        queryRunner.update(con, sql.toString());
        BigInteger id = (BigInteger) queryRunner.query(con,"SELECT LAST_INSERT_ID()",new ScalarHandler(1));
        return id.intValue();
    }
}
