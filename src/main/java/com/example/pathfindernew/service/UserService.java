package com.example.pathfindernew.service;

import com.example.pathfindernew.domain.entity.UserEntity;
import com.example.pathfindernew.domain.serviceModel.UserServiceModel;

public interface UserService {

    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findUserByUserNameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    void logOutUser();

    UserServiceModel findById(Long id);

    boolean isNameExistMetod(String username);

    UserEntity findCurrentLoginUser();
}
