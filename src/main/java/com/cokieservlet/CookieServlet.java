/*Build a servlet program to create a cookie to get your name through text box and press submit button( 
through HTML) to display the message by greeting Welcome back your name ! , you have visited this page 
n times ( n = number of your visit ) and demonstrate the expiry of cookie also. */


package com.cokieservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

        // Expiry (important part)
        nameCookie.setMaxAge(30);   // 30 seconds
        countCookie.setMaxAge(30);  // 30 seconds

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        out.println("<html><body>");
        out.println("<h2>Welcome back " + username + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");
        out.println("<p>Cookie expires in 30 seconds.</p>");
        out.println("</body></html>");
    }
}