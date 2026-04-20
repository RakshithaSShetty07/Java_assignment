<!-- Construct a Cookie Management program using JSP to get the fields Name, Domain and Max
Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information.
Then it has to go to show the active cookie list when you press the link go to the active cookie list -->


<%@ page import="javax.servlet.http.Cookie" %>
<html>
<body>

<%
    String name = request.getParameter("cname");
    String domain = request.getParameter("cdomain");
    int age = Integer.parseInt(request.getParameter("cage"));

    // Create cookie
    Cookie cookie = new Cookie(name, "Active");

    cookie.setDomain(domain);   // set domain
    cookie.setMaxAge(age);      // expiry time

    response.addCookie(cookie);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain:</b> <%= domain %></p>
<p><b>Max Age:</b> <%= age %> seconds</p>

<br>
<a href="listCookies.jsp">Go to Active Cookie List</a>

</body>
</html>