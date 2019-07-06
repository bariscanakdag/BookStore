package com.bookstore.service;

import com.bookstore.entity.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
