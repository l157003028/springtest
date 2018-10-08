package com.demo.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName HelloService
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/27 17:07
 * @Version 1.0
 **/
@Service
public class HelloService {
    public String sayHello(String name){
        return "hello".concat(name);
    }
}
