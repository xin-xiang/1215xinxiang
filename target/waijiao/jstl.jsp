<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/5/14
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>week12-jstl</title>
</head>
<body>
This is my JSP Page.<br/>
<c:set var="foo" value="in page" scope="page"/>
<c:set var="foo" value="in request" scope="request"/>
<c:set var="foo" value="in session" scope="session"/>
<c:set var="foo" value="in application" scope="application"/>
<br/>
Get(use jstl):<c:out value="${foo}"/>
<br/>
Get(use El):${foo}
<br/>
Get(java code):<%=pageContext.findAttribute("foo")%>
<h3>Get from a scope</h3>
Page Att:<c:out value="${pageScope.foo}"/><br/>
Request Att:<c:out value="${requestScope.foo}"/><br/>
Session Att:<c:out value="${sessionScope.foo}"/><br/>
Application Att:<c:out value="${applicationScope.foo}"/><br/>
<c:remove var="foo" scope="request"/>
<h3>c:remove</h3>
Page Att:<c:out value="${pageScope.foo}"/><br/>
Request Att:<c:out value="${requestScope.foo}"/><br/>
Session Att:<c:out value="${sessionScope.foo}"/><br/>
Application Att:<c:out value="${applicationScope.foo}"/><br/>
<h3>c:catch</h3>
<c:catch var="myException">
<%=10/0%>
</c:catch>
Message:<c:out value="${myException}"/>

</body>
</html>
