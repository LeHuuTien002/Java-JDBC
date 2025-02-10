package com.tien;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "Nguyen Van A");
            pstmt.setString(2, "nguyenvana@example.com");
            pstmt.executeUpdate();

            System.out.println("Thêm dữ liệu thành công!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
