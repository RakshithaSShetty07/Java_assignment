<%@ page import="java.sql.*" %>
<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "yourpassword");

    Statement st = con.createStatement();

    st.executeUpdate("INSERT INTO Emp VALUES (101,'Ramesh',25000)");
    st.executeUpdate("INSERT INTO Emp VALUES (102,'Ravi',20000)");
    st.executeUpdate("INSERT INTO Emp VALUES (103,'Adhya',29000)");
    st.executeUpdate("INSERT INTO Emp VALUES (104,'Neha',30000)");
    st.executeUpdate("INSERT INTO Emp VALUES (105,'Sneha',35000)");

    out.println("5 Records Inserted Successfully<br>");
    out.println("<a href='Employee.jsp'>View Salary Report</a>");

    con.close();

} catch(Exception e) {
    out.println(e);
}
%>