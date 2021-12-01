package com.wasu.springmvc.service;

import com.wasu.springmvc.domain.User;

import java.util.List;

public interface UserService {
//    List<User> queryUser(String username);
    List<User> queryAllUsers();
    boolean queryUser(String username, String password);
    int addUser(User user);
}
