package com.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Boss
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/20 17:01
 * @Version 1.0
 **/
@Component
public class Boss {
    private Car car;

    //构造器要用的组件，都是从容器中获取
    //如果组件只有一个有参构造器，这个有参构造器的@Autowired可以省略，参数位置的组件还是可以自动从容器中获取
    @Autowired
    public Boss(Car car){
        this.car = car;
        System.out.println("Boss 有参构造器...");
    }

    public Car getCar() {
        return car;
    }
    //@Autowired标注在方法上，Spring容器创建当前对象，就会调用方法，完成赋值；
    //方法使用的参数，自定义类型的值从ioc容器中获取
//    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
