<%@ page session="true" %>
<html>
<body>

<%
    String name = request.getParameter("username");

    // If user submits name for first time
    if (name != null) {
        session.setAttribute("user", name);
        session.setMaxInactiveInterval(60); // 1 minute expiry
    }

    // Get session value
    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire in 1 minute.</p>
<%
    } else {
%>
        <h2>Session expired!</h2>
        <p>Please enter your name again.</p>
        <a href="index.html">Go Back</a>
<%
    }
%>

</body>
</html>