package com.gongsizhijia.service;

import com.gongsizhijia.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectUser();

    User login(User user);

    void deleteUser(int id);

    void insertUser(User user);

    void updateUser(User user);
}