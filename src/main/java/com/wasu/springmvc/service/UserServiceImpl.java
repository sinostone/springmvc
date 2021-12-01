package com.wasu.springmvc.service;

import com.wasu.springmvc.dao.UserDao;
import com.wasu.springmvc.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

//    @Override
//    public List<User> queryUser(String username) {
//        List<User> users = userDao.selectUser(username);
//        return users;
//    }

    @Override
    public List<User> queryAllUsers() {
        List<User> users = userDao.selectUsers();
        return users;
    }

    @Override
    public boolean queryUser(String username, String password) {
        List<User> user = userDao.selectUser(username, password);
        Logger logger = LogManager.getLogger();
        logger.info("username: " + username + " password: " + password);
        logger.info(user.toString());
        if (user!=null && user.size()==1)
            return true;
        else
            return false;
    }

    @Override
    public int addUser(User user) {
        int rows = userDao.insertUser(user);
        return rows;
    }
}
