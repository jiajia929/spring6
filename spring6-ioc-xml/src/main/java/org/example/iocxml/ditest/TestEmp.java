package org.example.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-ditest.xml");
        //员工对象
        Emp emp = context.getBean("emp3", Emp.class);
        emp.work();
    }
}
