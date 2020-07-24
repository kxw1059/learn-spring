package com.kangxw.study.spring.mvc.service.impl;

import com.kangxw.study.spring.mvc.dao.UserDao;
import com.kangxw.study.spring.mvc.service.UserService;
import com.kangxw.study.spring.mvc.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@code UserServiceImpl} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 16:50
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> list() {
        return userDao.list();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
