package com.demo.transaction;


import com.demo.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionConfigTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService);
        userService.insertUser();

        applicationContext.close();
    }

}