package com.demo.extension;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName ListenerService
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/24 17:28
 * @Version 1.0
 **/
@Service
public class ListenerService {
    @EventListener(classes = ApplicationEvent.class)
    public void listen(ApplicationEvent event){
        System.out.println("UserService...监听到的事件:"+event);
    }
}
