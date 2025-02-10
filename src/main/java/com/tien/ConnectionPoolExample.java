package com.tien;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolExample {
    private static final HikariConfig config = new HikariConfig();
    private static final HikariDataSource ds;

    static {
        config.setJdbcUrl("jdbc:mysql://localhost:3306/mydb");
        config.setUsername("root");
        config.setPassword("Tien@27022002");
        config.setMaximumPoolSize(10);

        ds = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Kết nối thành công với HikariCP!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
