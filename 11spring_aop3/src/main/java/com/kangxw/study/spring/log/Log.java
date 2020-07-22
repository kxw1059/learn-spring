package com.kangxw.study.spring.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * {@code Log} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-21 14:22
 */
@Aspect
public class Log {

    @Before("execution(* com.kangxw.study.spring.service.impl.*.*(..))")
    public void before()  {
        System.out.println("方法执行前");
    }

    @After("execution(* com.kangxw.study.spring.service.impl.*.*(..))")
    public void after()  {
        System.out.println("方法执行后");
    }

    @Around("execution(* com.kangxw.study.spring.service.impl.*.*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名：" + jp.getSignature());
        Object result = jp.proceed();
        System.out.println("环绕后");
        return result;
    }
}
