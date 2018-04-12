package com.admin.service;

import com.admin.model.User;
import org.springframework.stereotype.Service;

public interface IUserService {

    public User checkLogin(String username, String password);
}
