package com.caocaorbac.service.impl;

import com.caocaorbac.mapper.UserMapper;
import com.caocaorbac.pojo.ServiceResponse;
import com.caocaorbac.pojo.User;
import com.caocaorbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    //声明mapper属性
    @Autowired
    private UserMapper userMapper;
    //用户登录
    @Override
    public User login(String username, String pwd) {
        User userDB = userMapper.login(username, pwd);

        if(userDB!=null){
            return userDB;
        }
        if(userDB == null) {
            throw new RuntimeException("validation failed");
        }
        throw new RuntimeException(" failed");
    }

    @Override
    public void addUser(User user){
        userMapper.addUser(user);
    }

    @Override
    public void batchAddUser(List<User> user) {
        userMapper.batchAddUser(user);
    }


    @Override
    public List<Map<String, Object>> getAllUeserInfo(){
        List<Map<String, Object>> users = userMapper.getAllUeserInfo();
        return users;
    }

    @Override
    public void deleteUser(String usercode){
        userMapper.deleteUser(usercode);
    }

    @Override
    public void updateUserInfo(User user){
        userMapper.updateUserInfo(user);
    }
}
