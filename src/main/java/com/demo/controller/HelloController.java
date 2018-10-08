package com.demo.controller;

import com.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/27 16:53
 * @Version 1.0
 **/
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String str = helloService.sayHello("spring");
        return str;
    }
}
