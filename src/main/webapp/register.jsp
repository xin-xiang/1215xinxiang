<%--
  Created by IntelliJ IDEA.
  User: 风
  Date: 2022/5/18
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>

<%@include file="header.jsp"%>
<a href="https://www.yjwujian.cn/">go to yjwj</a>
<form method="post" action="/xx/register"><!--within dopost() in servlet-->
    username:<input name="username" type="text" ><br/>
    password:<input name="password" type="password" ><br/>
    Email:<input name="email" type="text" ><br/>
    Gender:<input type="radio" name="gender" value="male">Male<input type="radio" name="gender" value="female">Female<br/>
    Date of Birth:<input type="text name=" name="birthDate"><br/>
    <input type="submit" value="Register"/>
</form>
<%@include file="footer.jsp"%>

