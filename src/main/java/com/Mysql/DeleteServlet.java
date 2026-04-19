//Develop a JDBC project using MySQL to delete the records in the table Emp of the database Employee by getting the name starting with ‘S’   through keyboard using JSP and Generate the report of the remaining records as follows


package com.Mysql;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ch = request.getParameter("letter");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee", "root", "yourpassword");

            // 🔴 STEP 1: DELETE records starting with given letter
            String deleteSQL = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
            PreparedStatement ps1 = con.prepareStatement(deleteSQL);
            ps1.setString(1, ch + "%");
            ps1.executeUpdate();

            // 🔵 STEP 2: SELECT remaining records
            String selectSQL = "SELECT * FROM Emp";
            PreparedStatement ps2 = con.prepareStatement(selectSQL);
            ResultSet rs = ps2.executeQuery();

            // 🔷 OUTPUT REPORT
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
