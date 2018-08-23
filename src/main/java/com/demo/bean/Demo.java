package com.demo.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/15 16:15
 * @Version 1.0
 **/
//@Data
public class Demo {
    //使用@Value赋值；
    //1、基本数值
    //2、可以写SpEL； #{}
    //3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）
//    @Value("spring")
    @Value("${demo.str}")
    private String str;

    public Demo() {
        System.out.println("this is a constructor");
    }

    public String getStr() {
        System.out.println("this is a getter");
        return str;
    }

    public void setStr(String str) {
        System.out.println("this is a setter");
        this.str = str;
    }

    public void printStr(){
        System.out.println(str);
    }

    public Demo(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "str='" + str + '\'' +
                '}';
    }
}
