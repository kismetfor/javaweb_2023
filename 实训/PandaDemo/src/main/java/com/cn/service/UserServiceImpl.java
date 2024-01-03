package com.cn.service;

import com.cn.dao.UserDao;
import com.cn.entity.User;

public class UserServiceImpl implements UserService {
    public User getUserByNameAndPass(String username, String password) {
        UserDao userDao = new UserDao();
        User user = userDao.getUserByNameAndPass(username,password);
        return user;
    }
}
