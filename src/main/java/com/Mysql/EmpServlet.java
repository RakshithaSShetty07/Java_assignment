//Develop a JDBC project using MySQL after appending  the fields empno,  empname and basicsalary into the table Emp of the database Employee in Mysql and by getting a character   through keyboard using JSP  and Generate the query report as follows


package com.Mysql;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ch = request.getParameter("letter");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee", "root", "yourpassword");

            String sql = "SELECT * FROM Emp WHERE Emp_Name LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ch + "%");

            ResultSet rs = ps.executeQuery();

            out.println("<h2>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h2>");
            out.println("<h2>Salary Report</h2>");
            out.println("<h2>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h2>");

            while (rs.next()) {
                out.println("Emp_No : " + rs.getInt(1) + "<br>");
                out.println("Emp_Name : " + rs.getString(2) + "<br>");
                out.println("Basic : " + rs.getInt(3) + "<br>");
                out.println("<h3>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h3>");
            }

            con.close();

        } catch (Exception e) {
            out.println("Error: " + e);
        }
    }
}