package com.gongsizhijia.controller;

import com.gongsizhijia.entity.User;
import com.gongsizhijia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(User user) {
        if (userService.login(user) != null) {
            return "redirect:/main.jsp";
        }
        return "redirect:/error.jsp";
    }

    @RequestMapping("insertUser")
    public String insertUser(User user) {
        userService.insertUser(user);
        return "redirect:/login.jsp";
    }
}
