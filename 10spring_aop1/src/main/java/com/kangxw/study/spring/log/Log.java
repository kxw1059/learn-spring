package com.kangxw.study.spring.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * {@code Log} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-21 14:22
 */
public class Log implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法被执行");
    }
}
