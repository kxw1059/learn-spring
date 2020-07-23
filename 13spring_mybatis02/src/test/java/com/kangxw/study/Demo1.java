package com.kangxw.study;

import com.kangxw.study.spring.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * {@code Demo1} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-21 14:07
 */
public class Demo1 {
    @Test
    public void func1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        System.out.println(userDao.selectUser());
    }
}
