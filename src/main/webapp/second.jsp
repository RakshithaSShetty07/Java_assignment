<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Session Check</title>
</head>
<body>

<h2>Session Status</h2>

<%
String name = (String) session.getAttribute("user");

if (name == null) {
%>
    <h3 style="color:red;">Sorry! Session has expired</h3>
<%
} else {
%>
    <h3 style="color:green;">Hello <%= name %></h3>
    <p>Session is still active</p>
<%
}
%>

</body>
</html>