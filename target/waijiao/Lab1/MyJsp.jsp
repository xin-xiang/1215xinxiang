<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/5/18
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab1-MyJsp</title>
</head>
<body>
<h2>This is MyJsp.jsp page</h2>
<form method="post" action="MyDearJsp.jsp"> <%--using servlet action="myDear"--%>
  Name:<input type="text" name="name"/><br/>
  Class:<input type="text" name="class"/><br/>
  ID:<input type="text" name="id"/><br/>
  <input type="submit" value="Send data to server">

</form>
</body>
</html>
