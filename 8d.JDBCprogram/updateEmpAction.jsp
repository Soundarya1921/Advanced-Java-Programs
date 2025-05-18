<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String salaryStr = request.getParameter("basicsalary");

    int empNo = Integer.parseInt(empNoStr);
    int salary = Integer.parseInt(salaryStr);

    String url = "jdbc:mysql://localhost:3306/employee";
    String user = "root";
    String password = ""; // change if your MySQL has a password

    Connection con = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);

        // Check if employee exists
        ps = con.prepareStatement("SELECT Emp_NO FROM Emp WHERE Emp_NO = ?");
        ps.setInt(1, empNo);
        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            out.println("<h3 style='color:red;'>Error: Employee ID " + empNo + " not found!</h3>");
        } else {
            ps.close();

            // Perform update
            ps = con.prepareStatement("UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?");
            ps.setString(1, empName);
            ps.setInt(2, salary);
            ps.setInt(3, empNo);

            int result = ps.executeUpdate();
            if (result > 0) {
                out.println("<h3 style='color:green;'>Record updated successfully for Emp No: " + empNo + "</h3>");
            } else {
                out.println("<h3 style='color:red;'>Update failed.</h3>");
            }
        }

    } catch(Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    } finally {
        if (ps != null) ps.close();
        if (con != null) con.close();
    }
%>
<br><br>
<a href="viewEmp.jsp">← Back to Employee List</a>
