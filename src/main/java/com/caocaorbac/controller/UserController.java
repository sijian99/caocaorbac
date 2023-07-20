package com.caocaorbac.controller;

import com.caocaorbac.pojo.Menu;
import com.caocaorbac.pojo.Role;
import com.caocaorbac.pojo.ServiceResponse;
import com.caocaorbac.pojo.User;
import com.caocaorbac.service.MenuService;
import com.caocaorbac.service.RoleService;
import com.caocaorbac.service.UserService;
import com.caocaorbac.utils.JWTUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private MenuService menuService;

    //user login
    @GetMapping("/user/login")
    @ResponseBody
    public Map<String, Object> login(String username, String pwd){

        Map<String, Object> map = new HashMap<>();
        try{
            //find user in database
            User userDB = userService.login(username, pwd);
            Map<String, String> payload = new HashMap<>();
            //put info into payload: id, username, usercode, role?
            payload.put("id",userDB.getId().toString());
            payload.put("name", userDB.getUser_name());
            payload.put("code", userDB.getUser_code());

            //generate JWT token
            String token = JWTUtils.getToken(payload);
            map.put("status",0);
            map.put("message","login success");
            map.put("token",token);

            //get role this user
            List<Role> roles = roleService.getRoleByUserID(userDB.getId());
            map.put("roles", roles);

            //get all menus of this user
            List<Menu> allmenus = new ArrayList<Menu>();
            for(Role role: roles){
                int roleId = role.getRole_id();
                List<Menu> menuOfRole = menuService.getAllMenuByRoleID(roleId);
                for(Menu menu: menuOfRole){
                    allmenus.add(menu);
                }
            }

            //get list of menu of the highest level
            List<Menu> pMenus = menuService.getChildMenuByParentId(1,allmenus);

            //get tree result of certain parent menu
            List<Menu> treeMenus = menuService.constructTreeResult(pMenus,allmenus);

            //put the final result into map
            map.put("menus", treeMenus);


        } catch (Exception e){
            map.put("status",1);
            Map<String, Object> statusInfoMap = new HashMap<>();
            statusInfoMap.put("message", "login failed");
            statusInfoMap.put("detail", e.getMessage());
            map.put("statusInfo", statusInfoMap);
        }
        return map;
    }


    /** Add User **/
    @RequestMapping("/user")
    public ServiceResponse<String> addUser(User user){
        ServiceResponse<String> response = new ServiceResponse<>();
        try {
            userService.addUser(user);
            response.setStatus(0);
            response.setMessage("ok");
            response.setData("add User success");
        } catch (Exception e){
            response.setStatus(1);
            response.setData("error");
            response.setMessage("detail:" + e.getMessage());
        }

        return response;
    }

    /** Add User batch **/
    @RequestMapping(value="/batchadd/users",method=RequestMethod.POST)
    public ServiceResponse<String> batchAddUserInfo(@RequestBody List<User> users){
        ServiceResponse<String> response = new ServiceResponse<>();
        try{
            userService.batchAddUser(users);
            response.setStatus(0);
            response.setMessage("ok");
            response.setData("Batch add success");
        } catch (Exception e){
            response.setStatus(1);
            response.setData("error");
            response.setMessage("detail:" + e.getMessage());
        }
    return response;
    }

    /** Get all User info**/
    @RequestMapping("/users")
    public   ServiceResponse<List<Map<String, Object>>> getAllUeserInfo(){
        ServiceResponse<List<Map<String, Object>>> response = new ServiceResponse<>();
        try{
            List<Map<String,Object>> users = userService.getAllUeserInfo();
            response.setStatus(0);
            response.setMessage("ok");
            response.setData(users);
        } catch (Exception e){
            response.setStatus(1);
            response.setMessage("detail:" + e.getMessage());
        }
        return response;
    }

    /** Delete one User**/
    @GetMapping("delete/user")
    public ServiceResponse<String> deleteUser(String userCode){
        ServiceResponse<String> response = new ServiceResponse<>();
        try{
            userService.deleteUser(userCode);
            response.setStatus(0);
            response.setMessage("ok");
            response.setData("delete success");
        } catch (Exception e){
            response.setStatus(1);
            response.setData("error");
            response.setMessage("detail:" + e.getMessage());
        }
        return response;
    }

    /** update one user info**/
    @PostMapping("update/user")
    public ServiceResponse<String> updateUserInfo(@RequestBody User user){
        ServiceResponse<String> response = new ServiceResponse<>();
        try{
            userService.updateUserInfo(user);
            response.setStatus(0);
            response.setMessage("ok");
            response.setData("update success");
        }catch (Exception e){
            response.setStatus(1);
            response.setData("error");
            response.setMessage("detail:" + e.getMessage());
        }
        return response;
    }


}
