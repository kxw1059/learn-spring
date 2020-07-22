package com.kangxw.study.spring.dao.impl;

import com.kangxw.study.spring.dao.UserDao;
import com.kangxw.study.spring.vo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * {@code UserDaoImpl} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-22 16:05
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionTemplate sqlSession;



    @Override
    public List<User> selectUser() {
        User user = new User();
        user.setUsername("王五");
        user.setPassword("5555");
        sqlSession.insert("com.kangxw.study.spring.vo.user.mapper.add", user);
        sqlSession.delete("com.kangxw.study.spring.vo.user.mapper.remove", 20);
        return sqlSession.selectList("com.kangxw.study.spring.vo.user.mapper.selectAll");
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
}
