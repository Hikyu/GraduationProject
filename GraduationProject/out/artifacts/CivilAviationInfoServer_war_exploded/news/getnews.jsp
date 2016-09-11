<%@ page import="cauc.kyu.civilaviationinfoserver.process.NewsProcess" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/8
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%--新闻数据--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>title</title>
</head>
<body>
    <%
        String type = request.getParameter("type");
        String pageNo = request.getParameter("pageno");
        String pageSize = request.getParameter("pagesize");
        NewsProcess newsProcess=new NewsProcess();
        out.print(newsProcess.getNews(type,pageNo,pageSize));
    %>
</body>
</html>
