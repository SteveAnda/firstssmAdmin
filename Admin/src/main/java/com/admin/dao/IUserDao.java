package com.admin.dao;

import com.admin.model.User;
import org.springframework.stereotype.Repository;

public interface IUserDao {

    public User gerUserByName(String username);
}
