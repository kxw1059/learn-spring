package com.kangxw.study.spring.mvc.dao;

import com.kangxw.study.spring.mvc.vo.User;

import java.util.List;

/**
 * {@code UserDao} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 16:47
 */
public interface UserDao {
    List<User> list();
}
