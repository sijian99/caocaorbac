package com.caocaorbac.service.impl;

import com.caocaorbac.mapper.UserMapper;
import com.caocaorbac.pojo.User;
import com.caocaorbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //声明mapper属性
    @Autowired
    private UserMapper userMapper;
    //用户登录
    @Override
    public User selUserInfoService(String uname, String pwd) {
        return userMapper.selUserInfoMapper(uname, pwd);
    }
}
