package com.cn.service;

import com.cn.entity.User;

public interface UserService {
    User getUserByNameAndPass(String username, String password);
}
