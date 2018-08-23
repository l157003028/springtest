package com.demo;

import com.demo.bean.Bule;
import com.demo.bean.Demo;
import com.demo.config.MainConfig1;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig1.class);

    @Test
    public void test01(){
        String[] beanNames = ac.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println(beanName);
        }
    }

    @Test
    public void test02(){
        String[] beanNames = ac.getBeanDefinitionNames();
        for (String beanName : beanNames){
            System.out.println(beanName);
        }
        System.out.println("ioc容器创建完成......");
        Object bean1 = ac.getBean("demo");
        Object bean2 = ac.getBean("demo");
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean1 == bean2);

    }

    @Test
    public void test03(){
        String[] names = ac.getBeanNamesForType(Demo.class);
        for (String name : names){
            System.out.println(name);
        }

        Map<String,Demo> demoNames = ac.getBeansOfType(Demo.class);
        System.out.println(demoNames);
    }

    @Test
    public void testImport(){
        printBeans(ac);
        Bule bean1 = ac.getBean(Bule.class);
        System.out.println(bean1);
        //工厂Bean获取的是调用getObject创建的对象
        Object bean2 = ac.getBean("colorFactoryBean");
        System.out.println(bean2.getClass());

        //"&colorFactoryBean"获取到的是工厂bean调用getObject创建的对象
        Object bean3 = ac.getBean("&colorFactoryBean");
        System.out.println(bean3.getClass());
    }
    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
