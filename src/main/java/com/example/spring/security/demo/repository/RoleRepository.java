package com.example.spring.security.demo.repository;

import com.example.spring.security.demo.modal.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
