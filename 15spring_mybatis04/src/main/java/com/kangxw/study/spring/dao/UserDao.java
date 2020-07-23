package com.kangxw.study.spring.dao;

import com.kangxw.study.spring.vo.User;

import java.util.List;

/**
 * {@code UserDao} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-22 16:04
 */
public interface UserDao {
    public List<User> selectUser();
}
