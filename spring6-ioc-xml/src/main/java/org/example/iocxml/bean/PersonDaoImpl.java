package org.example.iocxml.bean;

public class PersonDaoImpl implements UserDao {

    @Override
    public void run() {
        System.out.println("person run...");
    }
}
