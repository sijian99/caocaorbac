package com.caocaorbac.service.impl;

import com.caocaorbac.mapper.MenuMapper;
import com.caocaorbac.pojo.Menu;
import com.caocaorbac.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenuByRoleID(int roleId){
        return menuMapper.getAllMenuByRoleID(roleId);
    }

    @Override
    public List<String> getAllChildByPID(int parentId, int level){
        return menuMapper.getAllChildByPID(parentId, level);
    }

    @Override
    public List<Menu> constructTreeResult(List<Menu> pMenus, List<Menu> allMenus){
        for (Menu menu: pMenus){
            menu.setChildMenus(this.getChildMenuByParentId(menu.getMenu_id(), allMenus));

            if (menu.getChildMenus().isEmpty()){
                continue;
            }
            constructTreeResult(menu.getChildMenus(), allMenus);
        }
        return pMenus;
    }

    @Override
    public List<Menu> getChildMenuByParentId(int parentId, List<Menu> menulist){
        List<Menu> children = new ArrayList<>();
        for(Menu menu: menulist) {
            if(parentId == menu.getParent_id()){
                Menu temp= new Menu();
                temp = menu;
                children.add(temp);
            }
        }
        return children.stream().distinct().collect(Collectors.toList());
    }

}
