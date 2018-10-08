package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ClassName RootConfig
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/27 16:43
 * @Version 1.0
 **/
@ComponentScan(value = "com.demo",excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})})
public class RootConfig {
}
