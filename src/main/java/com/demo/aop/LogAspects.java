package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @ClassName LogAspects
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/21 17:18
 * @Version 1.0
 **/
//@Aspect： 告诉Spring当前类是一个切面类
@Aspect
public class LogAspects {

    //1.本类使用
    @Pointcut("execution(public int com.demo.aop.MathCalculator.*(..))")
    public void pointCut(){};
    //@Before在目标方法之前切入；切入点表达式（指定在哪个方法切入）
//    @Before("public int com.demo.aop.MathCalculator.*(..)")
//    @Before("public int com.demo.aop.MathCalculator.div(int,int)")
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(""+joinPoint.getSignature().getName()+"方法运行。。。@Before:参数列表是：{"+ Arrays.asList(args)+"}");

    }

    //2.其他的切面引用
    @After("com.demo.aop.LogAspects.pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("方法结束...");
        System.out.println(""+joinPoint.getSignature().getName()+"方法结束。。。@After");

    }

    //JoinPoint一定要出现在参数表的第一位
    @AfterReturning(value="pointCut()",returning="result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println(""+joinPoint.getSignature().getName()+"正常返回。。。@AfterReturning:运行结果：{"+result+"}");

    }

    @AfterThrowing(value="pointCut()",throwing="exception")
    public void logException(JoinPoint joinPoint,Exception exception){
        System.out.println(""+joinPoint.getSignature().getName()+"异常。。。异常信息：{"+exception+"}");

    }
}
