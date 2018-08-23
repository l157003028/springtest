package com.demo.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName Car
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/17 15:25
 * @Version 1.0
 **/
@Component
public class Car {

    public Car() {
        System.out.println("car constructor......");
    }
    public void init(){
        System.out.println("car init......");
    }
    public void destory(){
        System.out.println("car destory......");
    }
}
