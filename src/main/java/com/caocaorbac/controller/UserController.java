package com.caocaorbac.controller;

import com.caocaorbac.pojo.User;
import com.caocaorbac.service.UserService;
import com.caocaorbac.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //user login
    @PostMapping("/user/login")
    @ResponseBody
    public Map<String, Object> login(User user){
        Map<String, Object> map = new HashMap<>();
        try{
            //find user in database
            User userDB = userService.selUserInfoService(user.getUser_name(), user.getPwd());
            Map<String, String> payload = new HashMap<>();
            //put info into payload: id, username, usercode, role?
            payload.put("id",userDB.getId().toString());
            payload.put("name", userDB.getUser_name());
            payload.put("code", userDB.getUser_code());

            //generate JWT token
            String token = JWTUtils.getToken(payload);
            map.put("state","true");
            map.put("msg","login success");
            map.put("token",token);

            //get role and dept of this user



            //get list of url of this user


        } catch (Exception e){
            map.put("state", false);
            map.put("msg", e.getMessage());
        }
        return map;
    }

}
