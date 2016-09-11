package cauc.kyu.civilaviationinfoserver.model;

import cauc.kyu.civilaviationinfoserver.bean.AbstractBean;
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
 * Created by Administrator on 2016/5/10.
 */
public class ArticlesDao implements IDao {
    private static final String TABLE_NAME = Constant.TABLE_ARTICLES;

    @Override
    public void insert(AbstractBean bean) {

    }

    @Override
    public ArrayList getData(int pageNo, int pageSize) throws SQLException {
        QueryRunner queryRunner = new QueryRunner();
        Connection con = DBConnect.getInstance().getConnection();
        StringBuilder sql = new StringBuilder();
        sql.append("select * from ")
                .append(TABLE_NAME)
                .append(" order by date desc limit ")
                .append(pageNo)
                .append(", ")
                .append(pageSize);
        ResultSetHandler<List<ArticleBean>> handler = new BeanListHandler<ArticleBean>(ArticleBean.class);
        List<ArticleBean> data = queryRunner.query(con, sql.toString(), handler);
        return (ArrayList) data;
    }

    @Override
    public void delete(int id) {

    }
}
