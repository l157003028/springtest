package com.demo.config;

import com.demo.bean.Color;
import com.demo.bean.ColorFactoryBean;
import com.demo.bean.Demo;
import com.demo.condition.LinuxCondition;
import com.demo.condition.MyImportBeanDefinitionRegistrar;
import com.demo.condition.MyImportSelector;
import com.demo.condition.WinCondition;
import org.springframework.context.annotation.*;

/**
 * @ClassName MainConfig1
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/16 17:06
 * @Version 1.0
 **/
@Configuration
//@Import导入组件，id默认是组件的全类名
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig1 {
    //默认是单实例的
    //默认是单实例的
    /**
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION	 sesssion
     * @return\
     * @Scope:调整作用域
     * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
     * 					每次获取的时候才会调用方法创建对象；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
     * 			以后每次获取就是直接从容器（map.get()）中拿，
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     *
     * 懒加载：
     * 		单实例bean：默认在容器启动的时候创建对象；
     * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
     *
     */
    @Bean(name = "demo")
//    @Scope("prototype")
    @Lazy
    public Demo demo(){
        System.out.println("给容器中添加Demo");
        return new Demo("spring annotation");
    }
    /**
     * @Conditional({Condition}) ： 按照一定的条件进行判断，满足条件给容器中注册bean
     *
     * 如果系统是windows，给容器中注册("bill")
     * 如果是linux系统，给容器中注册("linus")
     */
    @Conditional(WinCondition.class)
    @Bean(name = "windows")
    public Demo demo01(){
        return new Demo("spring Condition windows");
    }

    @Conditional(LinuxCondition.class)
    @Bean(name = "linux")
    public Demo demo02(){
        return new Demo("spring Condition linux");
    }
    /**
     * 给容器中注册组件；
     * 1）、包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
     * 2）、@Bean[导入的第三方包里面的组件]
     * 3）、@Import[快速给容器中导入一个组件]
     * 		1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
     * 		2）、ImportSelector:返回需要导入的组件的全类名数组；
     * 		3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中
     * 4）、使用Spring提供的 FactoryBean（工厂Bean）;
     * 		1）、默认获取到的是工厂bean调用getObject创建的对象
     * 		2）、要获取工厂Bean本身，我们需要给id前面加一个&
     * 			&colorFactoryBean
     */

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
