package com.demo.config;

import com.demo.bean.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ClassName MainConfig
 * @Description 配置类，相当于spring的xml配置文件
 * @Author lyk
 * @Date 2018/8/16 09:59
 * @Version 1.0
 **/

@Configuration
@ComponentScan(value = "com.demo",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})},useDefaultFilters = false)
//@ComponentScan 指定要扫描的包
//excludeFilters = Filter[] 指定扫描时要排除哪些组建
//includeFilters = Filter[] 指定扫描时要包含哪些组建
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定类型
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {
    //给容器中注册Bean
    @Bean
    public Demo demo(){
        return new Demo("spring");
    }
}
