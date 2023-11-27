package com.rain.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtlis {

    private static final String url = "jdbc:mysql:///bookstore?useSSL=false";
    private static final String username = "root";
    private static final String password = "123456";

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closePst(Connection conn, PreparedStatement pst, ResultSet rs) {
        try {
            if (null != rs) {
                rs.close();
            }
            if (null != pst) {
                pst.close();
            }
            if (null != conn) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PageModel<Book> getList(String name, String author, String press, Integer page, Integer size) {
        Connection conn = getConnection();
        String sql = "select * from bookstore where 1 = 1";
        String sql2 = "select count(id) from bookstore where 1 = 1";
        ArrayList<String> params = new ArrayList<>(); // �洢����ֵ
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Book> list = new ArrayList<>();
        try {
            if (!name.isEmpty()) {
                sql += " and name like concat('%',?,'%')";
                sql2 += " and name like concat('%',?,'%')";
                params.add(name);
            }

            if (!author.isEmpty()) {
                sql += " and author like concat('%',?,'%')";
                sql2 += " and author like concat('%',?,'%')";
                params.add(author);
            }
            if (!press.isEmpty()) {
                sql += " and press like concat('%',?,'%')";
                sql2 += " and press like concat('%',?,'%')";
                params.add(press);
            }
            sql += " limit ?, ?";
            pst = conn.prepareStatement(sql);
            int i = 1;
            for (String param : params) {
                pst.setString(i, param);
                i++;
            }
            //System.out.println(sql);
            pst.setInt(i, (page - 1) * size);
            pst.setInt(i + 1, size);
            rs = pst.executeQuery();
            Book book = null;
            while (rs.next()) {
                book = new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setPress(rs.getString("press"));
                book.setAmount(rs.getInt("amount"));
                list.add(book);
            }
            pst = conn.prepareStatement(sql2);
            i = 1;
            for (Object param : params) {
                pst.setObject(i, param);
                i++;
            }
            ResultSet rs2 = pst.executeQuery();
            int total = 0;
            if (rs2.next()) {
                total = rs2.getInt(1);
            }
            rs2.close();

            PageModel<Book> pageModel = new PageModel<>();
            pageModel.setPage(page);
            pageModel.setSize(size);
            pageModel.setList(list);
            pageModel.setTotalSize(total);
            System.out.println(list);
            return pageModel;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closePst(conn, pst, rs);
        }
    }

    public PageModel<Book> queryList(Integer page, Integer size) {
        Connection conn = getConnection();
        String sql = "select * from bookstore limit ?, ?";
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Book> list = new ArrayList<>();
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, (page - 1) * size);
            pst.setInt(2, size);
            rs = pst.executeQuery();
            Book book = null;
            while (rs.next()) {
                book = new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setPress(rs.getString("press"));
                book.setAmount(rs.getInt("amount"));
                list.add(book);
            }
            ResultSet rs2 = pst.executeQuery("select count(id) from bookstore;");
            int total = 0;
            if (rs2.next()) {
                total = rs2.getInt(1);
            }
            rs2.close();

            PageModel<Book> pageModel = new PageModel<>();
            pageModel.setPage(page);
            pageModel.setSize(size);
            pageModel.setList(list);
            pageModel.setTotalSize(total);
            return pageModel;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closePst(conn, pst, rs);
        }
    }
    // ɾ���鼮��Ϣ
    public Integer deleteBook(Integer id) {
        Connection conn = getConnection();
        String sql = "delete from bookstore where bookstore.id = ?";
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1,id);
            int i = pst.executeUpdate();
            return i;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (null != pst) {
                    pst.close();
                }
                if (null != conn) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int buyBook(Integer id) {
        Connection conn = getConnection();
        String sql = "update bookstore set amount = amount - 1 where id = ? and amount > 0;";
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1,id);
            return pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (null != pst) {
                    pst.close();
                }
                if (null != conn) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int addBook(String name, String author, String press, Integer amount) {
        Connection conn = getConnection();
        String sql = "insert into bookstore (name, author, press, amount) values (?,?,?,?);";
        PreparedStatement pst = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,author);
            pst.setString(3,press);
            pst.setInt(4,amount);
            return pst.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (null != pst) {
                    pst.close();
                }
                if (null != conn) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
