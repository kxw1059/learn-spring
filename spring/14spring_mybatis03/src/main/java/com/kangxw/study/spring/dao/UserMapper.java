package com.kangxw.study.spring.dao;

import com.kangxw.study.spring.vo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * {@code UserMapper} .
 *
 * @author KangXW
 * @version v1.0
 * @date 2020-07-23 14:17
 */
public interface UserMapper {
    @Select("select * from user")
    public List<User> selectUser();
}
