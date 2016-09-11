package cauc.kyu.civilaviationinfoserver.process;

import cauc.kyu.civilaviationinfoserver.model.CollectDao;
import cauc.kyu.civilaviationinfoserver.utils.Constant;
import cauc.kyu.civilaviationinfoserver.utils.IntegerHelp;
import cauc.kyu.civilaviationinfoserver.utils.Response;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/5/23.
 */
public class CollectProcess {

    public String addCollect(String userid, String articleid) {
        if (userid == null || articleid == null) {
            return Response.json(Constant.LACK_PARAM, "缺少参数!");
        }
        if (!IntegerHelp.isPositiveInteger(userid) || !IntegerHelp.isPositiveInteger(articleid)) {
            return Response.json(Constant.ERROR_REQUEST, "错误的参数!");
        }
        int uid = Integer.valueOf(userid);
        int aid = Integer.valueOf(articleid);
        CollectDao dao = new CollectDao();
        try {
            dao.addCollect(uid, aid);
        } catch (SQLException e) {
            e.printStackTrace();
            return Response.json(Constant.DB_ERROR, "数据库出错");
        }
        return Response.json(Constant.SUCCESS, "success");
    }

    public String getCollects(String userid) {
        if (userid == null) {
            return Response.json(Constant.LACK_PARAM, "缺少参数!");
        }
        if (!IntegerHelp.isPositiveInteger(userid)) {
            return Response.json(Constant.ERROR_REQUEST, "错误的参数!");
        }
        int uid = Integer.valueOf(userid);
        ArrayList data;
        CollectDao dao = new CollectDao();
        try {
            data = dao.getCollects(uid);
        } catch (SQLException e) {
            e.printStackTrace();
            return Response.json(Constant.DB_ERROR, "数据库出错");
        }
        return Response.json(Constant.SUCCESS, "success",data);
    }
}
