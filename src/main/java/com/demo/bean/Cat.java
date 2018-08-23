package com.demo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/17 16:34
 * @Version 1.0
 **/
//把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>
@Component
public class Cat implements InitializingBean,DisposableBean{
    public Cat(){
        System.out.println("cat constructor......");
    }

    public void destroy() throws Exception {
        System.out.println("cat destroy......");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet......");
    }
}
