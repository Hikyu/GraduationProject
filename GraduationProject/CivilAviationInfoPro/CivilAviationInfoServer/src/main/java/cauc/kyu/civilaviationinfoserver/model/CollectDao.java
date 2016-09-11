package cauc.kyu.civilaviationinfoserver.model;

import cauc.kyu.civilaviationinfoserver.bean.ArticleBean;
import cauc.kyu.civilaviationinfoserver.utils.Constant;
import cauc.kyu.civilaviationinfoserver.utils.DBConnect;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/23.
 */
public class CollectDao {
    private static final String TABLE_NAME = Constant.TABLE_COLLECT;

    public void addCollect(int userid, int articleid) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection con = DBConnect.getInstance().getConnection();
        StringBuilder sql = new StringBuilder();
        sql.append("insert into ")
                .append(TABLE_NAME)
                .append("(user_id,articles_id)")
                .append(" values(")
                .append(userid)
                .append(",")
                .append(articleid)
                .append(")");
        queryRunner.update(con, sql.toString());
    }

    public ArrayList<ArticleBean> getCollects(int uid) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection con = DBConnect.getInstance().getConnection();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from ")
                .append(Constant.TABLE_ARTICLES)//WHERE uid IN(SELECT uid FROM user WHERE status=0)
                .append(" where id in(select articles_id from ")
                .append(TABLE_NAME)
                .append(" where user_id=")
                .append(uid).append(")");
        ResultSetHandler<List<ArticleBean>> handler = new BeanListHandler<ArticleBean>(ArticleBean.class);
        List<ArticleBean> data = queryRunner.query(con, sql.toString(), handler);
        return (ArrayList) data;
    }
}
