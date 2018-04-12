package com.admin.service.Impl;

import com.admin.dao.IUserDao;
import com.admin.model.User;
import com.admin.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User checkLogin(String username, String password) {

        User user = userDao.gerUserByName(username);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }else {
            return null;
        }
    }
}
