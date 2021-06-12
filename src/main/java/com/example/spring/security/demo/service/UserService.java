package com.example.spring.security.demo.service;

import com.example.spring.security.demo.modal.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
