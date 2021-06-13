package com.example.spring.security.demo.modal;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String userlocation;

    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

}
