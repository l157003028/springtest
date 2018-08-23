package com.demo;

import com.demo.bean.Demo;
import com.demo.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        //1.配置文件
//        //创建spring的IOC容器对象(读取配置文件)
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //从IOC容器中获取Bean，并实例化
//        Demo demo = (Demo) ctx.getBean("demo");
//        //调用实例的方法
//        demo.printStr();
//        //创建IOC容器对象的时候就调用了Demo类的构造方法和setter方法

        //2.配置类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Demo demoBean = applicationContext.getBean(Demo.class);
        System.out.println(demoBean.getStr());

        String[] names = applicationContext.getBeanNamesForType(Demo.class);
        for (String name : names){
            System.out.println(name);
        }

    }
}
