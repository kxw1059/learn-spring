package com.kangxw.study.spring.service.impl;

import com.kangxw.study.spring.service.UserService;

/**
 * {@code UserServiceImpl} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-21 14:38
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public int update(int i) {
        System.out.println("修改用户");
        return i + 1;
    }

    @Override
    public void search() {
        System.out.println("查询用户");
    }
}
