package com.demo.config;

import com.demo.bean.Boss;
import com.demo.bean.Car;
import com.demo.bean.Color;
import com.demo.service.DemoService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainConifgOfAutowiredTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);
    @Test
    public void test01(){
        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService);
//        DemoDao demoDao = applicationContext.getBean(DemoDao.class);
//        System.out.println(demoDao);

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);

        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);

        applicationContext.close();
    }
}