package com.kangxw.study.spring.log;

/**
 * {@code Log} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-21 14:22
 */
public class Log {

    public void before()  {
        System.out.println("方法执行前");
    }

    public void after()  {
        System.out.println("方法执行后");
    }
}
