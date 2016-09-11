package cauc.kyu.civilaviationinfoserver.controller;

/**
 * Created by Administrator on 2016/5/23.
 */

import cauc.kyu.civilaviationinfoserver.process.LoginProcess;
import cauc.kyu.civilaviationinfoserver.process.RegisterProcess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uName = req.getParameter("username");
        String psw = req.getParameter("password");
        RegisterProcess process=new RegisterProcess();

        resp.setCharacterEncoding("UTF-8");
//        resp.setHeader("content-type","text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(process.register(uName,psw));
    }
}
