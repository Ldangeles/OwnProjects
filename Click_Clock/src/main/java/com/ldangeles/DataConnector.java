package com.ldangeles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnector {

    private static Connection connection;

    public static Connection connect() throws SQLException {
        if(connection == null){
            String url = "jdbc:mysql://localhost:3306/Click_Clock";
            String user = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }

}
