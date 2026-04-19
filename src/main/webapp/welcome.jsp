<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Welcome Page</title>
</head>
<body>

<%
String name = request.getParameter("uname");
String timeStr = request.getParameter("time");

// Convert minutes (decimal allowed)
double timeMinutes = Double.parseDouble(timeStr);

// Convert to seconds
int timeSeconds = (int)Math.round(timeMinutes * 60);

// Store in session
session.setAttribute("user", name);

// Set session expiry time
session.setMaxInactiveInterval(timeSeconds);
%>

<h2>Hello <%= name %></h2>
<p>Session has started...</p>
<p>Your name is stored in session</p>
<p>Session expiry time set to <%= timeMinutes %> minutes</p>

<p>Click below link within given time or wait to check expiry:</p>

<a href="second.jsp">Check Session</a>

</body>
</html>