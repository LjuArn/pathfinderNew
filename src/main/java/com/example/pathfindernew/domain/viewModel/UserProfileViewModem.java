package com.example.pathfindernew.domain.viewModel;

import com.example.pathfindernew.domain.entity.RoleEntity;
import com.example.pathfindernew.domain.entity.enums.UserLevelEnum;
import jakarta.persistence.*;

import java.util.Set;

public class UserProfileViewModem {

    private Long id;
    private String username;
    private String fullName;
    private Integer age;
    private UserLevelEnum level;

    public UserProfileViewModem() {
    }

    public Long getId() {
        return id;
    }

    public UserProfileViewModem setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserProfileViewModem setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserProfileViewModem setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserProfileViewModem setAge(Integer age) {
        this.age = age;
        return this;
    }

    public UserLevelEnum getLevel() {
        return level;
    }

    public UserProfileViewModem setLevel(UserLevelEnum level) {
        this.level = level;
        return this;
    }
}
