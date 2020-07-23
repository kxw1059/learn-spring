package com.kangxw.study.spring.dao.impl;

import com.kangxw.study.spring.dao.UserDao;
import com.kangxw.study.spring.vo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * {@code UserDaoImpl} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-22 16:05
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public List<User> selectUser() {
        return getSqlSession().selectList("com.kangxw.study.spring.vo.user.mapper.selectAll");
    }
}
