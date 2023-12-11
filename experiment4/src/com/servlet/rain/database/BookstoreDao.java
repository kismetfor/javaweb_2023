package com.servlet.rain.database;

import java.util.List;

//1 首先，创建一个BookstoreDao接口，定义对bookstore表的操作：

public interface BookstoreDao {
    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(int bookId);

    Book getBookById(int bookId);

    List<Book> getAllBooks();
}
