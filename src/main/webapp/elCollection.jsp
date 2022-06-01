<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 朱鹏
  Date: 2022/5/7
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo 3-week 11+Demo 1-week 12</title>
</head>
<body>
<%
    //array
    String [] firstName={"Bill","Scott","Larry"};
    //list
    ArrayList<String> lastName=new ArrayList<>();
    lastName.add("Ellison");
    lastName.add("Gates");
    lastName.add("McNealy");
    //map
    HashMap<String,String> companyName=new HashMap<>();
    companyName.put("Ellison","Sun");
    companyName.put("Gates","Oracle");
    companyName.put("McNealy","Microsoft");
    //set attribute in any one scope
    request.setAttribute("firstname",firstName);
    request.setAttribute("lastname",lastName);
    request.setAttribute("company",companyName);
%>
<h2>get data from Array-->List-->Map -using EL code</h2>
<ul>
    <li>${firstname["0"]}-->${lastname["0"]}-->${company["Ellison"]}</li>
    <li>${firstname["1"]}-->${lastname["1"]}-->${company[lastname["1"]]}</li>
    <li>${firstname["2"]}-->${lastname["2"]}-->${company.McNealy}</li>
</ul>
<hr/>
<h3>Use JSTL c:forEach to get array elements</h3>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<ul>
    <c:forEach var="a" items="${firstname}">
        <li>${a}</li>
    </c:forEach>
</ul>
<h3>Use JSTL c:forEach to get List elements</h3>
<ul>
    <c:forEach var="a" items="${lastname}">
        <li>${a}</li>
    </c:forEach>
</ul>
<h3>Use JSTL c:forEach to get Map elements</h3>
<ul>
    <c:forEach var="a" items="${company}">
        <li>${a.key}-->${a.value}</li>
    </c:forEach>
</ul>

</body>
</html>
