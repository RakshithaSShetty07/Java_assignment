/*Build a servlet program to create a cookie to get your name through text box and press submit button(
through HTML) to display the message by greeting Welcome back your name ! , you have visited this page
n times ( n = number of your visit ) along with the list of cookies and demonstrate the expiry of cookie also.*/


package com.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        // Check existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }

                if (c.getName().equals("username")) {
                    username = c.getValue();
                }
            }
        }

        // Create cookies
        Cookie nameCookie = new Cookie("username", username);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry (demo purpose)
        nameCookie.setMaxAge(30);   // expires in 30 sec
        countCookie.setMaxAge(30);  // expires in 30 sec

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + username + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");

        // Display all cookies
        out.println("<h3>List of Cookies:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>");
                out.println("Name: " + c.getName() + "<br>");
                out.println("Value: " + c.getValue());
                out.println("</p>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }

        out.println("<p><i>Cookie expires in 30 seconds</i></p>");
        out.println("</body></html>");
    }
}