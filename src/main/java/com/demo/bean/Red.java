package com.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @ClassName Red
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/17 09:52
 * @Version 1.0
 **/
@Component
public class Red implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware{
    private ApplicationContextAware applicationContextAware;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("IOC容器:"+applicationContext);
        this.applicationContextAware = applicationContextAware;
    }

    public void setBeanName(String beanName) {
        System.out.println("beanName:"+beanName);
    }

    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        String resolver = stringValueResolver.resolveStringValue("系统版本：${os.name} ${os.version} ${os.arch}");
        System.out.println(System.getProperty("os.name"));
        System.out.println("解析:"+resolver);
    }
}
