<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/5/2
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if("admin".equals(password)){
%>
<jsp:forward page="welcome.jsp"/>
<%}else{
        out.write("Username Password Error!!!");
        %>
<jsp:include page="login2.jsp"/>
<%}%>
</body>
</html>
