package com.example;

import com.example.service.MessageService;
import com.example.service.MyNameMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyApp {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext =
                new AnnotationConfigApplicationContext(MyApp.class);
        MyNameMessageService myNameMessageService = (MyNameMessageService) applicationContext.getBean("myNameMessageService");
        System.out.println(myNameMessageService.getMessage());
    }
}
