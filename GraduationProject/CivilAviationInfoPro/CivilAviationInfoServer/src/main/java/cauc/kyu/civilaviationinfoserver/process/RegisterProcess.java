package cauc.kyu.civilaviationinfoserver.process;

import cauc.kyu.civilaviationinfoserver.bean.UserBean;
import cauc.kyu.civilaviationinfoserver.model.UserDao;
import cauc.kyu.civilaviationinfoserver.utils.Constant;
import cauc.kyu.civilaviationinfoserver.utils.IntegerHelp;
import cauc.kyu.civilaviationinfoserver.utils.Response;

import java.sql.SQLException;

/**
 * Created by Administrator on 2016/5/23.
 */
public class RegisterProcess {
    public String register(String name, String password) {
        if (name == null || password == null) {
            return Response.json(Constant.LACK_PARAM, "缺少参数!");
        }
        UserDao dao = new UserDao();
        try {
            int id = dao.createUser(name, password);
            return Response.json(Constant.SUCCESS, "success", id);
        } catch (SQLException e) {
            e.printStackTrace();
            return Response.json(Constant.DB_ERROR, e.getMessage());
        }
    }
}
