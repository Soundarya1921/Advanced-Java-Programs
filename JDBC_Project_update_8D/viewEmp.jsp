<%@ page import="java.sql.*" %>
<html>
<body>
<h2>Employee List</h2>
<%
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    int grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr><th>Emp No</th><th>Emp Name</th><th>Basic Salary</th></tr>");
        while(rs.next()) {
            int basic = rs.getInt("Basicsalary");
            grandTotal += basic;

            out.println("<tr>");
            out.println("<td>" + rs.getInt("Emp_NO") + "</td>");
            out.println("<td>" + rs.getString("Emp_Name") + "</td>");
            out.println("<td>" + basic + "</td>");
            out.println("</tr>");
        }

      
      
        out.println("<td colspan='2' align='right'>Grand Salary:</td>");
        out.println("<td>" + grandTotal + "</td>");
        out.println("</tr>");

        out.println("</table>");
    } catch(Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(con != null) con.close();
    }
%>
</body>
</html>

