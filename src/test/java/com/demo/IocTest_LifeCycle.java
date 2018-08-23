package com.demo;

import com.demo.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName IocTest_LifeCycle
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/17 15:34
 * @Version 1.0
 **/
public class IocTest_LifeCycle {
    @Test
    public void test01(){
        //1.创建IOC容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("IOC容器创建完成......");
        //2.关闭容器
//        ac.getBean("car");
        ac.close();
        System.out.println("IOC容器关闭......");
    }
}
