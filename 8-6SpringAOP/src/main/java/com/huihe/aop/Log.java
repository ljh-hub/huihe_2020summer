package com.huihe.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //标识切面
public class Log{

    @Before("execution(* com.huihe.service.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("====方法执行前");
    }
    @After("execution(* com.huihe.service.impl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后====");
    }
}
