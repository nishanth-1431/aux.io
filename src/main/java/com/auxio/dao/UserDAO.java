package com.auxio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.auxio.model.User;
import com.auxio.util.DatabaseConnection;

public class UserDAO {

    public boolean createUser(User user) {

        String sql = """
                INSERT INTO Users (user_name, password_hash, usertype)
                VALUES (?, ?, ?)
                """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, user.getUserName());
            stmt.setString(2, user.getpasswordHash());
            stmt.setString(3, user.getUserType().name());

            int rowsAffected = stmt.executeUpdate();

            
            return rowsAffected > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}