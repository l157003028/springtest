package com.demo;

import com.demo.config.AppConfig;
import com.demo.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ClassName MyWebApplicationInitializer
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/27 16:15
 * @Version 1.0
 **/
//web容器启动时创建对象，调用方法来初始化前端控制器
public class MyWebApplicationInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer{
    //获取根容器的配置类，（spring的配置文件）父容器
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }
    //获取web容器的配置类，（springMVC配置文件）子容器
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }
    //获取DispatcherServlet的映射信息
    protected String[] getServletMappings() {
        //  /：拦截所有请求（包括静态资源（xx.js,xx.png）），但是不包括*.jsp；
        //  /*：拦截所有请求；连*.jsp页面都拦截；jsp页面是tomcat的jsp引擎解析的；
        return new String[]{"/"};
    }
}
