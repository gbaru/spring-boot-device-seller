package com.sha.springbootdeviceseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/*
 @autor gbar
  */
@Data
@Entity
@Table(name = "users") // not user => because it is reserved by Postgres
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(name = "username", unique = true, nullable = false, length = 100)
 private String username;

 @Column(name = "password", nullable = false, length = 100)
 private String password;

 @Column(name = "name", nullable = false, length = 100)
 private String name;

 @Column(name = "create_time", nullable = false)
 private LocalDateTime createTime;

 @Enumerated(EnumType.STRING)
 @Column(name = "role", nullable = false)
 private Role role;

 @Transient
 private String token;


 // public void setCreateTime(LocalDateTime now) {
 // }
}
