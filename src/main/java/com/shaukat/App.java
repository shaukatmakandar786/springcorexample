package com.shaukat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext conext=new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) conext.getBean("student1");
        System.out.println(student1);
    }
}
