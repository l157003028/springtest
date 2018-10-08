package com.demo.extension;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyApplicationListener
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/24 16:04
 * @Version 1.0
 **/
@Component
public class MyApplicationListener implements ApplicationListener{
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到事件:"+event);
    }
}
