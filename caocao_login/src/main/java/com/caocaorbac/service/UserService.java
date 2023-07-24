package com.caocaorbac.service;

import com.caocaorbac.pojo.ServiceResponse;
import com.caocaorbac.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //用户登录
    User login(String username, String pwd);

    List<Map<String, Object>> getAllUeserInfo();

    void addUser(User user);

    void batchAddUser(List<User> users);
    void deleteUser(String userCode);

    void updateUserInfo(User user);
}
