package com.example;

import com.example.services.RandomTextMessageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService randomTextMessageService = applicationContext.getBean("randomTextMessageService", RandomTextMessageService.class);
        MessageService randomTextMessageServiceCopy = applicationContext.getBean("randomTextMessageService", RandomTextMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(randomTextMessageService.getMessage());

        System.out.println(randomTextMessageService.hashCode());
        System.out.println(randomTextMessageServiceCopy.hashCode());

        applicationContext.close();
    }
}
