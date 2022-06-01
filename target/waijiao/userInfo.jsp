<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/4/2
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>
<table border=1>
    <tr>
        <td>Id:</td><td><%=request.getAttribute("id")%></td>
    </tr>
    <tr>
        <td>Username:</td><td><%=request.getAttribute("username")%></td>
    </tr>
    <tr>
        <td>Password:</td><td><%=request.getAttribute("password")%></td>
    </tr>
    <tr>
        <td>Email:</td><td><%=request.getAttribute("email")%></td>
    </tr>
    <tr>
        <td>Gender:</td><td><%=request.getAttribute("gender")%></td>
    </tr>
    <tr>
        <td>Birthday:</td><td><%=request.getAttribute("birthday")%></td>
    </tr>
</table>
<%@include file="footer.jsp"%>
