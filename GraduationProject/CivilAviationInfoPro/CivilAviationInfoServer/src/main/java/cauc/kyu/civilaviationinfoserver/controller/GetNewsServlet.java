package cauc.kyu.civilaviationinfoserver.controller;

import cauc.kyu.civilaviationinfoserver.process.NewsProcess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/5/10.
 */
@WebServlet("/GetNewsServlet")
public class GetNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        String pageNo = req.getParameter("pageno");
        String pageSize = req.getParameter("pagesize");
        NewsProcess newsProcess=new NewsProcess();

        System.out.println(newsProcess.getNews(type,pageNo,pageSize));
        resp.setCharacterEncoding("UTF-8");
//        resp.setHeader("content-type","text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(newsProcess.getNews(type,pageNo,pageSize));
    }
}
