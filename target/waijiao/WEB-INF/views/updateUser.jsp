<%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/4/16
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Update</h1>
<%
    User u=(User) session.getAttribute("user");
%>
<form method="post" action="updateUser">
<%--    Id:<input type="text" name="id"/><br/>--%>
    <input type="hidden" name="id" value="<%=u.getId()%>">
    Username:<input type="text" name="username" value="<%=u.getUsername()%>"/><br/>
    Password:<input type="password" name="password" value="<%=u.getPassword()%>"/><br/>
    Email:<input type="text" name="email" value="<%=u.getEmail()%>"/><br/>
    Gender:<input type="radio" name="gender" value="male" <%="male".equals(u.getGender())?"checked":""%>>Male
    <input type="radio" name="gender" value="female" <%="female".equals(u.getGender())?"checked":""%>>Female<br/>
    Date of Birth:<input type="text" name="birthDate" value="<%=u.getBirthday()%>"><br/>
    <input type="submit" value="Save changes"/>
</form>
<%@include file="footer.jsp"%>
