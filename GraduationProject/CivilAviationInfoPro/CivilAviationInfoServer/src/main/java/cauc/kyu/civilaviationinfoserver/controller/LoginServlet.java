package cauc.kyu.civilaviationinfoserver.controller;

import cauc.kyu.civilaviationinfoserver.process.LoginProcess;

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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String psw = req.getParameter("password");
        LoginProcess process=new LoginProcess();

        System.out.println(process.verification(id,psw));
        resp.setCharacterEncoding("UTF-8");
//        resp.setHeader("content-type","text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(process.verification(id,psw));
    }
}
