<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/3/27
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>
<head>
    <title>Title</title>
</head>
<body>--%>
<%@include file="header.jsp"%>
<h1><%="Login"%></h1>
<%
    if (!(request.getAttribute("message") ==null)){
        out.println(request.getAttribute("message"));
    }
%>
<form method="post" action="login">
    Username:<input type="text" name="username"/><br/>
    Password :<input type="password" name="password"/><br/>
    <input type="submit" value="Login"/>
</form>
<%--</body>
</html>--%>
<%@include file="footer.jsp"%>
