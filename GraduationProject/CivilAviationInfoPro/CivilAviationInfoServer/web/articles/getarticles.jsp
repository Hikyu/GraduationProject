<%@ page import="cauc.kyu.civilaviationinfoserver.process.ArticlesProcess" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/9
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%--文章数据--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String pageNo = request.getParameter("pageno");
    String pageSize = request.getParameter("pagesize");
    ArticlesProcess process=new ArticlesProcess();
    out.print(process.getArticles(pageNo,pageSize));
%>

