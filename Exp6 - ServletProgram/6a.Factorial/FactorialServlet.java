package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("number"));
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Factorial of " + num + " is " + factorial + "</h2>");
    }
}

