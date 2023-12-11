package com.servlet.rain.service;

import com.servlet.rain.database.Book;
import com.servlet.rain.database.BookstoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookstoreService {

    @Autowired
    private BookstoreDao bookstoreDao;

    @Transactional
    public void addBook(Book book) {
        bookstoreDao.insertBook(book);
        // 如果抛出异常，事务会回滚
        // throw new RuntimeException("Test rollback");
    }
}
