package com.yhgm.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author:yanghua
 * Date:2023/10/20 8:34
 */
public class UserData {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/petadopt";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet res = statement.executeQuery("select * from user;");
        while (res.next()) {
            System.out.println(res.getString("name"));
        }

    }
}
