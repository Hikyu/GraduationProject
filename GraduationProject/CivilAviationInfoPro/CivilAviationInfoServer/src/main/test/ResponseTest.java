import cauc.kyu.civilaviationinfoserver.bean.NewsBean;
import cauc.kyu.civilaviationinfoserver.utils.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/9.
 */
public class ResponseTest {
    @Test
    public void testObject() {
        NewsBean newsBean = new NewsBean();
        newsBean.setId(0);
        newsBean.setContent("这是一条测试信息");
        newsBean.setTitle("test");
        newsBean.setSource("yukai");
        newsBean.setDate("2016-5-9");
        newsBean.setTitleimg("kkk");
        String s = Response.json(200,"success",newsBean);
        System.out.println(s);
    }

    @Test
    public void testArray() {
        int size = 10;
        NewsBean beans[] = new NewsBean[size];
        for (int i = 0; i < size; ++i) {
            NewsBean newsBean = new NewsBean();
            newsBean.setId(i);
            newsBean.setContent("这是一条测试信息");
            newsBean.setTitle("test");
            newsBean.setSource("yukai");
            newsBean.setDate("2016-5-9");
//            newsBean.setTitleimg("kkk");
            beans[i] = newsBean;
        }
        String s = Response.json(201,"sucess",beans);
        System.out.println(s);
    }

    @Test
    public void testList(){
        List list=new ArrayList();
        for (int i = 0; i < 10; ++i) {
            NewsBean newsBean = new NewsBean();
            newsBean.setId(i);
            newsBean.setContent("这是一条测试信息");
            newsBean.setTitle("test");
            newsBean.setSource("yukai");
            newsBean.setDate("2016-5-9");
//            newsBean.setTitleimg("kkk");
            list.add(newsBean);
        }
        String s = Response.json(200,"success",list);
        System.out.println(s);
    }
}
