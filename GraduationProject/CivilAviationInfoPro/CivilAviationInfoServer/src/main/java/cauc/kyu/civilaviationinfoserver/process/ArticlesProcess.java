package cauc.kyu.civilaviationinfoserver.process;

import cauc.kyu.civilaviationinfoserver.model.ArticlesDao;
import cauc.kyu.civilaviationinfoserver.model.IDao;
import cauc.kyu.civilaviationinfoserver.utils.Constant;
import cauc.kyu.civilaviationinfoserver.utils.IntegerHelp;
import cauc.kyu.civilaviationinfoserver.utils.Response;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/5/10.
 */
public class ArticlesProcess {
    public String getArticles(String pageNo, String pageSize) {
        if (pageNo == null || pageSize == null) {
            return Response.json(Constant.LACK_PARAM, "缺少参数!");
        }
        if (!IntegerHelp.isPositiveInteger(pageNo)
                || !IntegerHelp.isPositiveInteger(pageSize)) {
            //pageNo需为正整数，pageSize需为正整数
            return Response.json(Constant.ERROR_REQUEST, "错误的参数!");
        }
        int pageNoTmp = Integer.valueOf(pageNo);
        int pageSizeTmp = Integer.valueOf(pageSize);
        return process(pageNoTmp, pageSizeTmp);
    }

    private String process(int pageNo, int pageSize) {
        ArrayList data;
        IDao dao = new ArticlesDao();
        try {
            data = dao.getData(pageNo, pageSize);
        } catch (SQLException e) {
            return Response.json(Constant.DB_ERROR, "无法连接到数据库!");
        }
        return Response.json(Constant.SUCCESS, "success", data);
    }
}
