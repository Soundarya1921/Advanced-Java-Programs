/*8a. Q1. Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively*/

package com.mysql;
import java.sql.*;
import java.util.Properties;

public class Mysql_select {
    public static void main(String[] args) {
        Connection dbConnection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", ""); // Replace with your MySQL password if needed

            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            // SELECT query
            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("price");
                System.out.format("\n%d, %s, %d", id, coffee_name, price);
            }

            // INSERT query
            String insertQuery = "INSERT INTO coffee (coffee_name, price) VALUES (?, ?)";
            PreparedStatement stmt = dbConnection.prepareStatement(insertQuery);
            stmt.setString(1, "Tajmahal");
            stmt.setInt(2, 950);
            stmt.executeUpdate();
            stmt.close();

            System.out.println("\nInserted new coffee record successfully.");

        } catch (SQLException e) {
            System.err.println("SQL Exception occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Unexpected Exception occurred.");
            e.printStackTrace();
        }
    }
}
