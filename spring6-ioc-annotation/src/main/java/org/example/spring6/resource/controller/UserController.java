package org.example.spring6.resource.controller;

import jakarta.annotation.Resource;
import org.example.spring6.resource.service.UserService;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {

    //根据名称进行注入
    @Resource(name = "myUserService")
    private UserService userService;

    public void add() {
        System.out.println("controller...");
        userService.add();
    }
}
