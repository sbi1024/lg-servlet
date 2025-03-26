<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>

<%
    List<String> strList = (List<String>) request.getAttribute("strList");
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>String List</h1>
<%
    for (String str : strList) {
%>
<h4><%= str %>
</h4>
<%
    }
%>
</body>
</html>
