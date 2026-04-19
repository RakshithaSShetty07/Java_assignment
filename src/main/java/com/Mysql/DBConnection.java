//. Develop a JDBC project using JDBC to append  the fields empno,  empname and basicsalary into the table Emp of the database Employee by getting the fields  through keyboard using index.jsp  and Generate the report using Employee.jsp
package com.Mysql;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee",
                "root",
                "yourpassword" // change password if needed
            );
        } catch(Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}