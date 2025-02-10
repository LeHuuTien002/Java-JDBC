package com.tien;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) {
        String sql = "UPDATE users SET email = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "newemail@example.com");
            pstmt.setInt(2, 1);
            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Cập nhật thành công!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

