<%@ page import="java.sql.*" %>
<html>
<body>

<h2>Salary Report</h2>
<hr>

<%
int total = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "yourpassword");

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");

    while(rs.next()) {
        int no = rs.getInt(1);
        String name = rs.getString(2);
        int sal = rs.getInt(3);

        total += sal;
%>

Emp_No : <%= no %> <br>
Emp_Name : <%= name %> <br>
Basic : <%= sal %> <br>
<hr>

<%
    }
%>

<h3>Grand Salary : <%= total %></h3>

<%
    con.close();
} catch(Exception e) {
    out.println(e);
}
%>

</body>
</html>