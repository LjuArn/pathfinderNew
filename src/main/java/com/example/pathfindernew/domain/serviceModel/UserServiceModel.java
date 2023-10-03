package com.example.pathfindernew.domain.serviceModel;


import com.example.pathfindernew.domain.entity.RoleEntity;
import com.example.pathfindernew.domain.entity.enums.UserLevelEnum;

import java.util.Set;

public class UserServiceModel {

    private Long id;
    private String username;
    private String fullName;
    private String email;
    private Integer age;
    private String password;

    private Set<RoleEntity> roles;
    private UserLevelEnum level;


    public UserServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public UserServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserServiceModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserServiceModel setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public UserServiceModel setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
        return this;
    }

    public UserLevelEnum getLevel() {
        return level;
    }

    public UserServiceModel setLevel(UserLevelEnum level) {
        this.level = level;
        return this;
    }
}
