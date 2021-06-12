package com.example.spring.security.demo.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
