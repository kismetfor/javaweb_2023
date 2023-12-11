package com.servlet.rain.database;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
//2 然后，创建BookstoreDaoImpl类实现BookstoreDao接口，并使用JdbcTemplate来执行数据库操作：

public class BookstoreDaoImpl implements BookstoreDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertBook(Book book) {
        String sql = "INSERT INTO bookstore (name, author, press, amount) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, book.getName(), book.getAuthor(), book.getPress(), book.getAmount());
    }

    @Override
    public void updateBook(Book book) {
        String sql = "UPDATE bookstore SET name=?, author=?, press=?, amount=? WHERE id=?";
        jdbcTemplate.update(sql, book.getName(), book.getAuthor(), book.getPress(), book.getAmount(), book.getId());
    }

    @Override
    public void deleteBook(int bookId) {
        String sql = "DELETE FROM bookstore WHERE id=?";
        jdbcTemplate.update(sql, bookId);
    }

    @Override
    public Book getBookById(int bookId) {
        String sql = "SELECT * FROM bookstore WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{bookId}, new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM bookstore";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }
}
