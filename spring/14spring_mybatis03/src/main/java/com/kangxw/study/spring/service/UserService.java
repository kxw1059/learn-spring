package com.kangxw.study.spring.service;

import com.kangxw.study.spring.vo.User;

import java.util.List;

/**
 * {@code UserService} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-23 14:25
 */
public interface UserService {
    public List<User> selectUser();
}
