package org.example;

import org.example.bean.AnnotationApplicationContext;
import org.example.bean.ApplicationContext;
import org.example.service.UserService;

public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationApplicationContext("org.example");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
