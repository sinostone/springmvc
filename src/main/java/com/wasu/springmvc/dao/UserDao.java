package com.wasu.springmvc.dao;

import com.wasu.springmvc.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
//    List<User> selectUser(String username);
    List<User> selectUsers();
    List<User> selectUser(@Param("name") String username, @Param("password") String password);
    int insertUser(User user);
}
