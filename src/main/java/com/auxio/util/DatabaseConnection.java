package com.auxio.util;

import java.sql.Connection;
import java.sql.DriverManager;

import io.github.cdimascio.dotenv.Dotenv;

public class DatabaseConnection {

    private static final Dotenv dotenv = Dotenv.load();
    private static final String URL = dotenv.get("DB_URL");
    private static final String USERNAME = dotenv.get("DB_USERNAME");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    public static Connection getConnection() throws Exception {
    return DriverManager.getConnection(URL, USERNAME, PASSWORD);
}

}