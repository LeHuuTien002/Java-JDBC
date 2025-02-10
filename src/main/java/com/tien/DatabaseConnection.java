package com.tien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASSWORD = "Tien@27022002";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Kết nối thành công!");
        }
    }
}
