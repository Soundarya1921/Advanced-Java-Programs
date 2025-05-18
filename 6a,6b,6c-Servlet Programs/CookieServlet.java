/*6b. Build a servlet program to create a cookie to get your name through text box and press submit
button( through HTML) to display the message by greeting Welcome back your name ! , you have
visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also. */

package com.cookie;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        // Get cookies from request
        Cookie[] cookies = request.getCookies();
        boolean nameCookieExists = false;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("visitCount".equals(cookie.getName())) {
                    visitCount = Integer.parseInt(cookie.getValue()) + 1;
                }
                if ("username".equals(cookie.getName())) {
                    name = cookie.getValue();  // use cookie value
                    nameCookieExists = true;
                }
            }
        }

        // Create or update cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry: e.g., 30 seconds (for demo)
        nameCookie.setMaxAge(30);  
        countCookie.setMaxAge(30); 

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Display output
        out.println("<html><body>");
        out.println("<h2>Welcome back, " + name + "!</h2>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");
        out.println("<p>(Cookie will expire in 30 seconds)</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
