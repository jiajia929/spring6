package org.example.iocxml.auto.controller;

import org.example.iocxml.auto.service.UserService;
import org.example.iocxml.auto.service.UserServiceImpl;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller方法执行了...");
        //调用service的方法
        userService.addUserService();
//        UserService userService = new UserServiceImpl();
//        userService.addUserService();
    }
}
