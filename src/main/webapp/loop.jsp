<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/5/14
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loop.page-week12</title>
</head>
<body>
This is loop.JSP page <br>
<c:set var="user" value="admin"/>
<h2>welcome,<c:out value="${user}" default="<font color=red>Guest</font>" escapeXml="false"/> </h2>
<hr/>
<h2>Looping with Simple Numeric Values</h2>
<ul>
    <c:forEach var="i" begin="1" end="10">
        <li>${i}</li>
    </c:forEach>
</ul>
<hr/>
<h2>Looping with a Designated Step Size</h2>
<ul>
    <c:forEach var="i" begin="1" end="10" step="2">
        <li>${i}</li>
    </c:forEach>
</ul>
<hr/>
<h2>Use C:forEach to get item from array</h2>
<%
    String [] words={"foo","biz","pom"};
    request.setAttribute("words",words);
%>
<ul>
<c:forEach var="w" items="${words}">
    <li>${w}</li>
</c:forEach>
</ul>
</body>
</html>
