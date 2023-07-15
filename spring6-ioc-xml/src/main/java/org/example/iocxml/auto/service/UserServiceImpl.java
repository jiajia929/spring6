package org.example.iocxml.auto.service;

import org.example.iocxml.auto.dao.UserDao;
import org.example.iocxml.auto.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("userService方法执行了...");
        userDao.addUserDao();
//        UserDao userDao = new UserDaoImpl();
//        userDao.addUserDao();
    }
}
