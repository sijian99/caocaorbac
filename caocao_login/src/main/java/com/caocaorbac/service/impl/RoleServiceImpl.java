package com.caocaorbac.service.impl;

import com.caocaorbac.mapper.RoleMapper;
import com.caocaorbac.mapper.UserMapper;
import com.caocaorbac.pojo.Role;
import com.caocaorbac.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoleByUserID(int userId){
        return roleMapper.getRoleByUserID(userId);
    }
}
