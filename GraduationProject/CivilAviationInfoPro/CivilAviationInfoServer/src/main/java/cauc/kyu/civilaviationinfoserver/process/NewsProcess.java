package cauc.kyu.civilaviationinfoserver.process;

import cauc.kyu.civilaviationinfoserver.model.IDao;
import cauc.kyu.civilaviationinfoserver.model.NewsDao;
import cauc.kyu.civilaviationinfoserver.utils.Constant;
import cauc.kyu.civilaviationinfoserver.utils.IntegerHelp;
import cauc.kyu.civilaviationinfoserver.utils.Response;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 新闻数据请求处理入口
 * Created by Administrator on 2016/5/9.
 */
public class NewsProcess {
    private static List NEWS_TYPES;
    private final static String HOT = "hotnews";
    private final static String INTE = "intenews";
    private final static String GAT = "gatnews";

    static {
        NEWS_TYPES = new ArrayList();
        NEWS_TYPES.add(HOT);
        NEWS_TYPES.add(INTE);
        NEWS_TYPES.add(GAT);
    }

    public String getNews(String type, String pageNo, String pageSize) {
        if (type == null || pageNo == null || pageSize == null) {
            return Response.json(Constant.LACK_PARAM, "缺少参数!");
        }
        if (!NEWS_TYPES.contains(type) || !IntegerHelp.isPositiveInteger(pageNo)
                || !IntegerHelp.isPositiveInteger(pageSize)) {
            //pageNo需为正整数，pageSize需为正整数
            return Response.json(Constant.ERROR_REQUEST, "错误的参数!");
        }
        int pageNoTmp = Integer.valueOf(pageNo);
        int pageSizeTmp = Integer.valueOf(pageSize);
        return process(type, pageNoTmp, pageSizeTmp);
    }

    private String process(String type, int pageNo, int pageSize) {
        ArrayList data;
        IDao dao = null;
        switch (type) {
            case HOT:
                dao = new NewsDao(Constant.TABLE_HOTNEWS);
                break;
            case INTE:
                dao = new NewsDao(Constant.TABLE_INTENEWS);
                break;
            case GAT:
                dao = new NewsDao(Constant.TABLE_GATNEWS);
                break;
            default:
                break;
        }
        try {
            data = dao.getData(pageNo, pageSize);
        } catch (SQLException e) {
            return Response.json(Constant.DB_ERROR, "无法连接到数据库!");
        }
        return Response.json(Constant.SUCCESS, "success", data);
    }
}
