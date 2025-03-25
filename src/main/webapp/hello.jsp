<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String searchWord = request.getParameter("searchWord");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> Your searchWord : <%= searchWord%> </h1>
</body>
</html>
