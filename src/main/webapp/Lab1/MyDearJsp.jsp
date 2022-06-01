<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/5/18
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>using JSP</title>
</head>
<body>
<h2>This is MyDearJsp page</h2>

<%
    String name=request.getParameter("name");
    String class1=request.getParameter("class");
    String id=request.getParameter("id");
    request.setAttribute("name",name);
    request.setAttribute("class1",class1);
    request.setAttribute("id",id);
%>
<h2>Use java code</h2>
<%out.println("Name:"+name);%><br/>
<%out.println("Class:"+class1);%><br/>
<%out.println("ID:"+id);%><br/>
<h2>Use EL</h2>
Name:${name}<br/>
Class:${class1}<br/>
ID:${id}<br/>
</body>
</html>
