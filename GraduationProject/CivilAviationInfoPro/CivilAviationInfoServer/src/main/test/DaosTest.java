import cauc.kyu.civilaviationinfoserver.model.ArticlesDao;
import cauc.kyu.civilaviationinfoserver.model.NewsDao;
import cauc.kyu.civilaviationinfoserver.utils.Constant;
import com.google.gson.Gson;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Administrator on 2016/5/10.
 */
public class DaosTest {
    @Test
    public void testNewsDao() {
        NewsDao dao = new NewsDao(Constant.TABLE_HOTNEWS);
        try {
            Gson gson =new Gson();
            System.out.println(gson.toJson(dao.getData(1,1)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testArticlesDao(){
        ArticlesDao dao= new ArticlesDao();
        try {
            Gson gson =new Gson();
            System.out.println(gson.toJson(dao.getData(1,10)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
