package com.demo;

import com.demo.bean.Demo;
import com.demo.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @ClassName IOCTest_PropertyValue
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/20 10:17
 * @Version 1.0
 **/
public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
    @Test
    public void test01(){
        printBeans(applicationContext);
        Demo demo = (Demo) applicationContext.getBean("demo");
        System.out.println(demo);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("demo.str");
        System.out.println(property);
        applicationContext.close();
    }
    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }


}
