package com.tien;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteData {
    public static void main(String[] args) {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, 1);
            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Xóa thành công!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
