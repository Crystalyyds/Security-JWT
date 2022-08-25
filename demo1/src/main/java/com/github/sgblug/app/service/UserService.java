package com.github.sgblug.app.service;

import com.github.sgblug.app.model.entity.User;

public interface UserService {
    /**
     * 新建用户
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户
     */
    User newUser(String username, String password);
}
