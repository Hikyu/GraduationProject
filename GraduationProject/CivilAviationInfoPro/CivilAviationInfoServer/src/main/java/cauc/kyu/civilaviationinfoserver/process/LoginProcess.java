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
public class LoginProcess {
    public String verification(String id, String password) {
        if (id == null || password == null) {
            return Response.json(Constant.LACK_PARAM, "缺少参数!");
        }
        if (!IntegerHelp.isPositiveInteger(id)) {
            return Response.json(Constant.ERROR_REQUEST, "错误的参数!");
        }
        int uid = Integer.valueOf(id);
        UserDao dao = new UserDao();
        try {
            UserBean bean = dao.getUser(uid);
            if (bean!=null) {
                if (password.equals(bean.getPassword())) {
                    return Response.json(Constant.SUCCESS, "success", bean);
                } else {
                    return Response.json(Constant.DB_ERROR, "密码错误");
                }
            } else {
                return Response.json(Constant.DB_ERROR, "用户不存在");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return Response.json(Constant.DB_ERROR, e.getMessage());
        }
    }
}
