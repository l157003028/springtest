package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/27 16:43
 * @Version 1.0
 **/
@ComponentScan(value = "com.demo",includeFilters = {@ComponentScan.Filter(
        type = FilterType.ANNOTATION,classes = {Controller.class})},
        useDefaultFilters = false)
public class AppConfig implements WebMvcConfigurer{
    public void configurePathMatch(PathMatchConfigurer pathMatchConfigurer) {

    }

    public void configureContentNegotiation(ContentNegotiationConfigurer contentNegotiationConfigurer) {

    }

    public void configureAsyncSupport(AsyncSupportConfigurer asyncSupportConfigurer) {

    }

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer) {

    }

    public void addFormatters(FormatterRegistry formatterRegistry) {

    }

    public void addInterceptors(InterceptorRegistry interceptorRegistry) {

    }

    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry) {

    }

    public void addCorsMappings(CorsRegistry corsRegistry) {

    }

    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {

    }

    public void configureViewResolvers(ViewResolverRegistry viewResolverRegistry) {

    }

    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> list) {

    }

    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> list) {

    }

    public void configureMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    public void extendMessageConverters(List<HttpMessageConverter<?>> list) {

    }

    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> list) {

    }

    public Validator getValidator() {
        return null;
    }

    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
