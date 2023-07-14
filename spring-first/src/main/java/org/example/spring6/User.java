package org.example.spring6;

public class User {

    private String name;

    private Person person;

    //无参构造
    public User() {
        System.out.println("0: 无参构造执行了...");
    }

    public void add() {
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
