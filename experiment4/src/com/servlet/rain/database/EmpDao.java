package com.servlet.rain.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bookstore?useSSL=false&serverTimezone=GMT";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "3345576297ltLT";

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void closePst(Connection conn, PreparedStatement pst, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PageModel<EmpEntity> queryEmpList(int pageNum, int pageSize) {
        Connection conn = getConnection();
        String sql = "SELECT * FROM books LIMIT ?, ?";
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<EmpEntity> list = new ArrayList<>();

        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, (pageNum - 1) * pageSize);
            pst.setInt(2, pageSize);
            rs = pst.executeQuery();

            while (rs.next()) {
                EmpEntity emp = new EmpEntity();
                emp.setId(rs.getInt("id"));
                emp.setAuthor(rs.getString("author"));
                emp.setPress(rs.getString("press"));
                emp.setAmount(rs.getInt("amount"));
                list.add(emp);
            }

            // 获取总的数据条数
            String countSql = "SELECT COUNT(*) FROM books";
            PreparedStatement countPst = conn.prepareStatement(countSql);
            ResultSet rs2 = countPst.executeQuery();
            int total = 0;
            if (rs2.next()) {
                total = rs2.getInt(1);
            }
            rs2.close();

            // 构建 PageModel 对象
            PageModel<EmpEntity> pageModel = new PageModel<EmpEntity>();
            pageModel.setPageNum(pageNum);
            pageModel.setPageSize(pageSize);
            pageModel.setTotalSize(total);
            pageModel.setList(list);
            EmpEntity.sortByEmpId(pageModel.getList());

            return pageModel;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closePst(conn, pst, rs);
        }
        return null;
    }




}
