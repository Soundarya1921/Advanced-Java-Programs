<%@ page import="java.sql.*" %>
<%
    String empNoStr = request.getParameter("empno");
    String empName = request.getParameter("empname");
    String salaryStr = request.getParameter("basicsalary");

    int empNo = Integer.parseInt(empNoStr);
    int salary = Integer.parseInt(salaryStr);

    String url = "jdbc:mysql://localhost:3306/employee";
    String user = "root";
    String password = ""; // your MySQL password

    Connection con = null;
    PreparedStatement ps = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);

        String insertSQL = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        ps = con.prepareStatement(insertSQL);
        ps.setInt(1, empNo);
        ps.setString(2, empName);
        ps.setInt(3, salary);

        int result = ps.executeUpdate();
        if(result > 0) {
            out.println("<h3>Record inserted successfully!</h3>");
        } else {
            out.println("<h3>Failed to insert the record.</h3>");
        }

    } catch(Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    } finally {
        if(ps != null) ps.close();
        if(con != null) con.close();
    }
%>
