<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>--%>
<%@include file="header.jsp"%>
<%--<h1><%= "Hello World!!!" %><%System.out.println("service");%>
    Date and Time:<%out.print(new Date());%>
</h1>--%>
<h1>
    <%="Welcome to my home page."%>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet-week1</a>
<br/>
<a href="hello">Student Info Servlet-week2</a>
<br/>
<a href="life">Life Cycle Servlet-week3</a>
<br/>
<a href="register.jsp">Register-getParameter-week3</a>
<br/>
<a href="config">Config parameter-week4</a>
<br/>
<a href="register.jsp">Register JDBC-week4</a>
<br/>
<a href="index.jsp">include-week5</a>
<br/>
<a href="login.jsp">Login-week5</a>
<h2>
    <%="Welcome to my search page."%>
</h2>
<form method="get" target="_blank" action="search">
    <input type="text" name="txt" size="30"/>
    <select name="search">
        <option value="baidu">Baidu</option>
        <option value="bing">Bing</option>
        <option value="google">Google</option>

    </select>
    <input type="submit" value="Search"/>

</form>
<%--
</body>
</html>--%>
<%@include file="footer.jsp"%>