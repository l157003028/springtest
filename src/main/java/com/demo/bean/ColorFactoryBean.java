package com.demo.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName ColorFactoryBean
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/17 15:03
 * @Version 1.0
 **/
//创建Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color>{
    public Color getObject() throws Exception {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
