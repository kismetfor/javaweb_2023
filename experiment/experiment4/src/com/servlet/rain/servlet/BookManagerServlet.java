package com.servlet.rain.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.rain.database.Book;
import com.servlet.rain.database.BookManager;


@WebServlet("/BookManagerServlet")
public class BookManagerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BookManager bookManager;

    public void init() {
        bookManager = new BookManager();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // 添加书籍
            bookManager.addBook("软件工程（普通高等院校计算机类专业规划教材）", "吕兰兰、黄丽韶、张雷", "中国铁道出版社出版", 10);
            out.println("Book added successfully.<br>");

            // 获取所有书籍并打印到浏览器
            out.println("<h3>所有书籍</h3>");
            List<Book> allBooks = bookManager.getAllBooks();
            out.println("All Books in Bookstore:<br>");
            for (Book book : allBooks) {
                out.println(book.getName() + " by " + book.getAuthor() + "<br>");
            }


            // 更新书籍信息
            bookManager.updateBook(1, "Java Web程序设计教程", "辛宇", "清华大学出版社", 15);
            out.println("Book information updated successfully.<br>");

            // 获取更新后的书籍信息并打印到浏览器
            out.println("<h3>更新书籍信息</h3>");
            Book updatedBook = bookManager.getBookById(2);
            if (updatedBook != null) {
                out.println("Updated Book Information:<br>");
                out.println("Name: " + updatedBook.getName() + "<br>");
                out.println("Author: " + updatedBook.getAuthor() + "<br>");
                // 其他信息...
            } else {
                out.println("Book not found.<br>");
            }

            // 删除书籍
            out.println("<h3>删除书籍</h3>");
            out.println("删除了编号为2的书籍:<br>");
            bookManager.deleteBook(2); //后面是书的id
            out.println("Book deleted successfully.<br>");

            // 获取删除后的所有书籍并打印到浏览器

            List<Book> remainingBooks = bookManager.getAllBooks();
            out.println("Remaining Books in Bookstore:<br>");
            for (Book book : remainingBooks) {
                out.println(book.getName() + " by " + book.getAuthor() + "<br>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

