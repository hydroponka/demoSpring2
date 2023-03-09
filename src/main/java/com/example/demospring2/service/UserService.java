package com.example.demospring2.service;

import com.example.demospring2.model.User;

import java.util.List;

public interface UserService {
    boolean save(User user);
    List<User> findAll();
    List<User> findAllByName(String name);
    User findByEmail(String email);
}
