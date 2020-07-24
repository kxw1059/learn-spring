package com.kangxw.study.spring.mvc.dao.impl;

import com.kangxw.study.spring.mvc.dao.UserDao;
import com.kangxw.study.spring.mvc.vo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * {@code UserDaoImpl} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-24 16:48
 */
@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> list() {
        return getSqlSession().selectList("com.kangxw.study.spring.mvc.vo.user.mapper.list");
    }
}
