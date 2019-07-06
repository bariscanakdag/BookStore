package com.bookstore.service.impl;

import com.bookstore.entity.User;
import com.bookstore.repository.RoleRepository;
import com.bookstore.repository.UserRepository;
import com.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.google.common.collect.Sets;

import java.util.HashSet;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<com.bookstore.entity.Role>(Sets.newHashSet(roleRepository.findAll())));

        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUserName(username);
    }
}
