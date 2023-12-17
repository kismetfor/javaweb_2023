package com.liutao;
import java.util.List;

public interface BookDao {
    int addBook(Book book);

    int updateBook(Book book);

    int deleteBook(int id);

    Book findBookById(int id);

    List<Book> findAllBooks();
}
