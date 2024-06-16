/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/shopping_mall_db";
    private static final String USER = "root";
    private static final String PASSWORD = "123";

    private Connection connection;

    public DatabaseConnector() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null){
                System.out.println("success connection");
            }else{
                System.out.println("failed connection");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("failed connection");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
