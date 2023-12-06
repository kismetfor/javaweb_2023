package com.example.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//通知类
@Component//让spring知道这是Bean
@Aspect//aop通知类
public class MyAspect {
    @Pointcut("execution(void com.example.bean.Corp.add_worker(*))")
    private void pt() {
    }

    @Before("pt()")
    public void beforeAdvice() {
        System.out.println("<--使用Before为addWorker方法添加前置通知-->");
    }
    @After("pt()")
    public void afterAdvice() {
        System.out.println("<--使用After为addWorker方法添加后置通知-->");
    }

    @Around("pt()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        //如果addWorker方法没有返回值则可以就写void，如果有返回值就写Object
        System.out.println("\n"+"<-----使用Around为addWorker方法添加前置通知----->");
        Object obj=joinPoint.proceed(); // 调用目标方法
        System.out.println("<-----使用Around为addWorker方法添加后置通知----->"+"\n");
        return obj;
    }
}
