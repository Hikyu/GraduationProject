package cauc.kyu.civilaviationinfoserver.controller;

import cauc.kyu.civilaviationinfoserver.process.CollectProcess;
import cauc.kyu.civilaviationinfoserver.process.LoginProcess;
import cauc.kyu.civilaviationinfoserver.utils.Constant;
import cauc.kyu.civilaviationinfoserver.utils.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/5/23.
 */
@WebServlet("/CollectServlet")
public class CollectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        String type = req.getParameter("type");
        if ("add".equals(type)){
            String userid = req.getParameter("userid");
            String articleid = req.getParameter("articleid");
            CollectProcess process = new CollectProcess();
            out.print(process.addCollect(userid,articleid));
        }else if ("get".equals(type)){
            String userid = req.getParameter("userid");
            CollectProcess process = new CollectProcess();
            out.print(process.getCollects(userid));
        }else {
            out.print(Response.json(Constant.ERROR_REQUEST,"参数错误"));
        }
    }
}
