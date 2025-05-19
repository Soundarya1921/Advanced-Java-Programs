<%@ page import="java.sql.*" %>
<%
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    int grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
        stmt = conn.createStatement();

        String query = "SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'";
        rs = stmt.executeQuery(query);

        out.println("<h2>Salary Report</h2>");
        while(rs.next()){
            int salary = rs.getInt("Basicsalary");
            grandTotal += salary;

            out.println("<hr>");
            out.println("Emp_No : " + rs.getInt("Emp_NO") + "<br>");
            out.println("Emp_Name : " + rs.getString("Emp_Name") + "<br>");
            out.println("Basic : " + salary + "<br>");
            out.println("<hr>");
        }

        out.println("<h3>Grand Total Salary: " + grandTotal + "</h3>");

    } catch(Exception e){
        out.println("Error: " + e.getMessage());
    } finally {
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
    }
%>
