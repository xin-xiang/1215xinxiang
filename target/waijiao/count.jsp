<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/3/27
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Counter JSP</title>
</head>
<body>
this is count jsp page.<br>
<%!int getcount(){
    return ++count;
}%>
<%!int count=0;%>
<%--this page count is now : <%out.println(++count);%>--%>
the page count is now(using count()):<%out.println(getcount());%>
</body>
</html>
