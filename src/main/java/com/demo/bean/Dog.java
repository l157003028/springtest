package com.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/20 09:37
 * @Version 1.0
 **/
@Component
public class Dog implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    public Dog(){
        System.out.println("dog constructor...");
    }
    @PostConstruct
    public void init(){
        System.out.println("Dog ...@PostConstruct...");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
