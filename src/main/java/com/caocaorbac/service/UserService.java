package com.caocaorbac.service;

import com.caocaorbac.pojo.User;

public interface UserService {
    //用户登录

    User selUserInfoService(String user_name,String pwd);
}
