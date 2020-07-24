package com.kangxw.study.spring.mvc.service;

import com.kangxw.study.spring.mvc.vo.User;

import java.util.List;

/**
 * {@code UserService} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 16:50
 */
public interface UserService {
    List<User> list();
}
