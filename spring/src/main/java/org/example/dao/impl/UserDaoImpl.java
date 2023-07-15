package org.example.dao.impl;

import org.example.anno.Bean;
import org.example.dao.UserDao;

@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao...");
    }
}
