package org.wz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wz.dao.UserDao;
import org.wz.entity.User;
import org.wz.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getUser(String id) {
        return userDao.getUserById(id);
    }
}
