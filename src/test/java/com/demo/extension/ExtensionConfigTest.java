package com.demo.extension;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExtensionConfigTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtensionConfig.class);

        //发表事件
        applicationContext.publishEvent(new ApplicationEvent(new String("发布事件")) {
        });

        applicationContext.close();
    }

}