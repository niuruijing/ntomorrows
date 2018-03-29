package com.tomorrow.service.impl;

import com.tomorrow.mapper.UserMapper;
import com.tomorrow.model.User;
import com.tomorrow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by niuruijing on 2018/3/28.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        return  userMapper.insert(user);
    }
}
