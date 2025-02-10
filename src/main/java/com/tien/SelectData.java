package com.tien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {
    public static void main(String[] args) {
        String sql = "SELECT * FROM users";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}