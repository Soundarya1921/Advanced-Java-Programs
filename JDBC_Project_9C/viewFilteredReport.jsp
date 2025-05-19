<%@ page import="java.sql.*" %>
<%
    String letter = request.getParameter("startLetter");

    if(letter == null || !letter.matches("(?i)[a-z]")){
        out.println("<h3>Invalid input. Please enter a single letter A-Z.</h3>");
        return;
    }

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int grandTotal = 0;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");

        String query = "SELECT * FROM Emp WHERE Emp_Name LIKE ?";
        pst = conn.prepareStatement(query);
        pst.setString(1, letter.toUpperCase() + "%");

        rs = pst.executeQuery();

        out.println("<h2>Salary Report for names starting with '" + letter.toUpperCase() + "'</h2>");

        boolean found = false;
        while(rs.next()) {
            found = true;
            int salary = rs.getInt("Basicsalary");
            grandTotal += salary;

            out.println("<hr>");
            out.println("Emp_No : " + rs.getInt("Emp_NO") + "<br>");
            out.println("Emp_Name : " + rs.getString("Emp_Name") + "<br>");
            out.println("Basic : " + salary + "<br>");
            out.println("<hr>");
        }

        if (!found) {
            out.println("<p><strong>No employees found starting with '" + letter.toUpperCase() + "'.</strong></p>");
        } else {
            out.println("<h3>Grand Total Salary: " + grandTotal + "</h3>");
        }

    } catch(Exception e){
        out.println("Error: " + e.getMessage());
    } finally {
        if(rs != null) try { rs.close(); } catch(Exception e) {}
        if(pst != null) try { pst.close(); } catch(Exception e) {}
        if(conn != null) try { conn.close(); } catch(Exception e) {}
    }
%>
