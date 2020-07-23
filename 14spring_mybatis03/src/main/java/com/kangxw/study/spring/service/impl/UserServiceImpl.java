package com.kangxw.study.spring.service.impl;

import com.kangxw.study.spring.dao.UserMapper;
import com.kangxw.study.spring.service.UserService;
import com.kangxw.study.spring.vo.User;

import java.util.List;

/**
 * {@code UserServiceImpl} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-23 14:26
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper = null;

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
