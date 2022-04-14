package org.example;

import java.sql.*;

public class JDBC_like_example {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/test",
                    "root",
                    ""
            );
            if(connection == null) {
                System.out.println("Brak połączia z bazą danych");
            } else {
                System.out.println("Połączono!");
            }

            statement = connection.createStatement();

            String sqlSelect = "SELECT * FROM employees WHERE name LIKE '%ko%'; ";

            resultSet = statement.executeQuery(sqlSelect);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                int salary = resultSet.getInt("salary");
                System.out.println(
                        "id: " + id +
                                " name: " + name +
                                " address: " + address +
                                " salary: " + salary
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
