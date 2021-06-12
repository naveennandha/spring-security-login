package com.example.spring.security.demo.repository;

import com.example.spring.security.demo.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
