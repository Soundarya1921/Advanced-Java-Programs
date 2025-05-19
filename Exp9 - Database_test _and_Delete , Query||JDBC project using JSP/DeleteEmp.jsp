<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Employee By ID</title></head>
<body>

<h2>Delete Employee By ID</h2>
<form method="post" action="DeleteEmp.jsp"> <!-- change this to your file name -->
    Enter Employee No to Delete: <input type="text" name="empno">
    <input type="submit" value="Delete">
</form>

<%
    Connection conn = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;
    int grandTotal = 0;

    String empnoParam = request.getParameter("empno");

    try {  
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

        if (empnoParam != null && !empnoParam.trim().isEmpty()) {
            int empno = Integer.parseInt(empnoParam);

            String deleteQuery = "DELETE FROM Emp WHERE Emp_NO = ?";
            pst = conn.prepareStatement(deleteQuery);
            pst.setInt(1, empno);
            int deleted = pst.executeUpdate();

            out.println("<h3>" + deleted + " record(s) deleted with Emp_NO = " + empno + "</h3><br>");
        }

        // Display remaining employees
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<h2>Salary Report</h2>");

        while (rs.next()) {
            int salary = rs.getInt("Basicsalary");
            grandTotal += salary;

            out.println("<hr>");
            out.println("Emp_No : " + rs.getInt("Emp_NO") + "<br>");
            out.println("Emp_Name : " + rs.getString("Emp_Name") + "<br>");
            out.println("Basic : " + salary + "<br>");
            out.println("<hr>");
        }

        out.println("<h3>Grand Total Salary: " + grandTotal + "</h3>");

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) try { rs.close(); } catch (Exception e) {}
        if (stmt != null) try { stmt.close(); } catch (Exception e) {}
        if (pst != null) try { pst.close(); } catch (Exception e) {}
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>

</body>
</html>
