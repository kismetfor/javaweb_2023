package com.cn.dao;

import com.cn.entity.User;
import com.cn.util.DBUtils;

import java.util.List;

public class UserDao {
    public User getUserByNameAndPass(String username, String password) {
        String sql = "select * from where username = ? and password = ?";
        List<User> list = DBUtils.executeQuery(sql, User.class, username, password);
        if (list != null && !list.isEmpty()) {
            User user = list.get(0);
            return user;
        }
        return null;
    }
}
