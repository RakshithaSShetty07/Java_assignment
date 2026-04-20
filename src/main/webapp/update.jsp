<!--Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee by getting the fields through JSP-->

<%@ page import="java.sql.*" %>
<%
String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String salary = request.getParameter("salary");

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee","root","yourpassword");

    String query = "UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?";
    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, empname);
    ps.setInt(2, Integer.parseInt(salary));
    ps.setInt(3, Integer.parseInt(empno));

    int rows = ps.executeUpdate();

    if(rows > 0) {
        out.println("Record Updated Successfully!");
    } else {
        out.println("No record found with given Emp_No");
    }

    ps.close();
    con.close();

} catch(Exception e) {
    out.println(e);
}
%>

<br><br>
<a href="index.jsp">Back</a>


