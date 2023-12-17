package com.liutao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class BookDaoImpl implements BookDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addBook(Book book) {
        String sql = "insert into books(name, author, press, amount) values (?, ?, ?, ?)";
        Object[] params = new Object[]{
                book.getName(),
                book.getAuthor(),
                book.getPress(),
                book.getAmount()
        };
        return this.jdbcTemplate.update(sql, params);
    }

    @Override
    public int updateBook(Book book) {
        String sql = "update books set name=?, author=?, press=?, amount=? where id=?";
        Object[] params = new Object[]{
                book.getName(),
                book.getAuthor(),
                book.getPress(),
                book.getAmount(),
                book.getId()
        };
        int ret = this.jdbcTemplate.update(sql, params);
        return ret;
    }

    @Override
    public int deleteBook(int id) {
        String sql = "delete from books where id=?";
        return this.jdbcTemplate.update(sql, id);
    }

    @Override
    public Book findBookById(int id) {
        String sql = "select * from books where id=?";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<>(Book.class);
        return this.jdbcTemplate.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<Book> findAllBooks() {
        String sql = "select * from books";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<>(Book.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }
}
