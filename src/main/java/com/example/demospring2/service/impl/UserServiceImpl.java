package com.example.demospring2.service.impl;

import com.example.demospring2.model.Role;
import com.example.demospring2.model.User;
import com.example.demospring2.repository.UserRepository;
import com.example.demospring2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean save(User user) {
        if (userRepository.findUserByEmail(user.getEmail()) == null){
            user.setRole(Role.USER);
            userRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllByName(String name) {
        return userRepository.findUserByLastName(name);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
