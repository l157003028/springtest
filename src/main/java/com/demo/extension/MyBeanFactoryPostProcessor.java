package com.demo.extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName MyBeanFactoryPostProcessor
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/24 15:09
 * @Version 1.0
 **/
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor.postProcessBeanFactory()......");
        int count = configurableListableBeanFactory.getBeanDefinitionCount();
        String[] beanNames = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println("当前BeanFactory中有"+count+"个bean");
        System.out.println(Arrays.asList(beanNames));
    }
}
