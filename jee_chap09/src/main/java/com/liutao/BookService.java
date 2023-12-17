package com.liutao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Transactional
    public void addBookAndThenUpdate(Book newBook) {


        // 添加新书籍
        bookDao.addBook(newBook);

        // 获取添加书籍之前的所有书籍信息
        List<Book> beforeAdding = bookDao.findAllBooks();
         // 在发生异常之前输出所有书籍信息
        System.out.println("添加书籍之前的所有书籍信息：");
        printBookList(beforeAdding);
        // 模拟制造一个异常
        int a = 1 / 0;

        // 这里不会执行，因为上面的异常已经导致事务回滚
        Book bookToUpdate = bookDao.findBookById(newBook.getId());
        bookToUpdate.setAmount(5);
        bookDao.updateBook(bookToUpdate);
    }

    public List<Book> getAllBooks() {
        return bookDao.findAllBooks();
    }

    public void printBookList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

