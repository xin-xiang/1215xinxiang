<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/3/27
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    public void jspInit(){
        System.out.println("i am in jspInit()");
    }

%>
<html>
<head>
    <title>Life Cycle Jsp</title>
</head>
<body>
<%System.out.println("i am in jspservice()");%>
</body>
</html>
<%!
    public void jspDestroy(){
        System.out.println("i am in jspDestroy()");
    }

%>