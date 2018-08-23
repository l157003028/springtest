package com.demo.config;

import com.demo.bean.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName MainConfigOfPropertyValues
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/20 10:14
 * @Version 1.0
 **/
//使用@PropertySource读取外部配置文件中的key/value保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource(value = {"classpath:/demo.properties"})
@Configuration
public class MainConfigOfPropertyValues {
    @Bean
    public Demo demo(){
        return new Demo();
    }
}
