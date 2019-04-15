package com.gongsizhijia;

import com.gongsizhijia.dao.Userdao;
import com.gongsizhijia.entity.User;
import com.gongsizhijia.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends GongsizhijiaApplicationTests {
    @Autowired
    private UserService userService;
    @Autowired
    private Userdao userdao;

    @Test
    public void selectAll() {
        System.out.println(userService.selectUser());
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        user.setId(1);
        userService.updateUser(user);
//        System.out.println(userService.selectUser());
    }
    @Test
    public void deleteByid(){
        userService.deleteUser(1);
    }
}