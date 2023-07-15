package org.example.spring6.resource.service;

import jakarta.annotation.Resource;
import org.example.spring6.resource.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserServiceImpl implements UserService {

    //不指定名称，根据属性名称进行注入
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("service...");
        myUserDao.add();
    }
}
