package cauc.kyu.civilaviationinfoserver.model;

import cauc.kyu.civilaviationinfoserver.bean.AbstractBean;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/5/9.
 */
public interface IDao {
    void insert(AbstractBean bean);
    ArrayList getData(int pageNo, int pageSize) throws SQLException;
    void delete(int id);
}
