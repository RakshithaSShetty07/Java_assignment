<%@ page import="javax.servlet.http.Cookie" %>
<html>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
%>
            <p>
                Name: <%= c.getName() %> <br>
                Value: <%= c.getValue() %>
            </p>
            <hr>
<%
        }
    } else {
%>
        <p>No cookies found!</p>
<%
    }
%>

</body>
</html>