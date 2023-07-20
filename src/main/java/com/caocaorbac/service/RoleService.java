package com.caocaorbac.service;

import com.caocaorbac.pojo.Role;

import java.util.List;

public interface RoleService {

    //get list of role by usercode
    List<Role> getRoleByUserID(int userId);
}
