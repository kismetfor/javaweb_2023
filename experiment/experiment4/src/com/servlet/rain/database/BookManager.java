package com.servlet.rain.database;


//用于执行增删改查操作

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class BookManager {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bookstore?useSSL=false&serverTimezone=GMT";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "3345576297ltLT";

    // 添加书籍
    public void addBook(String name, String author, String press, int amount) {
        String query = "INSERT INTO books (name, author, press, amount) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, press);
            preparedStatement.setInt(4, amount);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 删除书籍
    public void deleteBook(int bookId) {
        String query = "DELETE FROM books WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, bookId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 更新书籍信息
    public void updateBook(int bookId, String name, String author, String press, int amount) {
        String query = "UPDATE books SET name = ?, author = ?, press = ?, amount = ? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, press);
            preparedStatement.setInt(4, amount);
            preparedStatement.setInt(5, bookId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 获取所有书籍
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        String query = "SELECT * FROM books";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String author = resultSet.getString("author");
                String press = resultSet.getString("press");
                int amount = resultSet.getInt("amount");
                books.add(new Book(id, name, author, press, amount));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    // 根据ID获取书籍信息
    public Book getBookById(int bookId) {
        String query = "SELECT * FROM books WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, bookId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String author = resultSet.getString("author");
                    String press = resultSet.getString("press");
                    int amount = resultSet.getInt("amount");
                    return new Book(id, name, author, press, amount);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // 如果未找到对应ID的书籍，返回null
    }
}
