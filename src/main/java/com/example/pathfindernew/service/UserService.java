package com.example.pathfindernew.service;

import com.example.pathfindernew.domain.serviceModel.UserServiceModel;

public interface UserService {

    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findUserByUserNameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    void logOutUser();
}
