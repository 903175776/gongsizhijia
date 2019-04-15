package com.gongsizhijia.service.impl;

import com.gongsizhijia.dao.Userdao;
import com.gongsizhijia.entity.User;
import com.gongsizhijia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private Userdao userDao;

    @Override
    public List<User> selectUser() {
        return userDao.findAll();
    }

    @Override
    public User login(User user) {
        return userDao.getByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }

    @Override
    public void insertUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }
}