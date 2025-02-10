package com.tien;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String sql = "CREATE TABLE users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(100), " +
                "email VARCHAR(100) UNIQUE)";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Tạo bảng users thành công!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
