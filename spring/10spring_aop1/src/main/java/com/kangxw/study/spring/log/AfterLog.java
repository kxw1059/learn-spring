package com.kangxw.study.spring.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * {@code AfterLog} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-21 15:55
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法被成功执行，返回值是：" + returnValue);
    }
}
