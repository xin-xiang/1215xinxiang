<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.xinxiang.week11.Dog" %>
<%@ page import="com.xinxiang.week11.Person" %><%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/5/14
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>week13-jstl2</title>
</head>
<body>
<h2>use c:set to set bean property</h2>
<%
        Person p=new Person();
        Dog d=new Dog();
        request.setAttribute("p",p);
        request.setAttribute("d",d);
%>
<c:set target="${p}" property="name" value="person1"/>
<c:set target="${d}" property="name" value="dog1"/>
<c:set target="${p}" property="dog" value="${d}"/>
Dog Name:<c:out value="${p.dog.name}"/>
<hr/>
<h2>Use c:if</h2>
<ul>
    <c:forEach var="i" begin="1" end="10">
        <li>
            ${i}
            <c:if test="${i>7}">
                (greater than 7)
            </c:if>
        </li>
    </c:forEach>
</ul>
<hr/>
<h2>Use c:choose,c:when,c:otherwise</h2>
<ul>
    <c:forEach var="i" begin="1" end="10">
        <li>
            ${i}
            <c:choose>
                <c:when test="${i<4}">
                    (Small)
                </c:when>
                <c:when test="${i<8}">
                    (Medium)
                </c:when>
                <c:otherwise>
                    (Large)
                </c:otherwise>
            </c:choose>
        </li>
    </c:forEach>
</ul>
<hr/>
<h2>Use c:import</h2>
<%--<c:import url="https://www.baidu.com"/>--%>
<hr/>
<h2>Use c:URL</h2>
<a href="home">Go to home(without c:url</a><br>
<a href="<c:url value="home"/> ">Go to home(using c:url)</a>
<c:url var="myUrl" value="home">
    <c:param name="productId" value="2312"/>
    <c:param name="username" value="admin"/>
</c:url>
<form action="${myUrl}">

</form>
<br>
<a href="${myUrl}">Go to home(use c:url with c:param</a>
<hr/>
<h2>use:c redirect</h2>
<c:redirect url="${myUrl}"/>
</body>
</html>
