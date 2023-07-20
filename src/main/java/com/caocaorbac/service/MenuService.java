package com.caocaorbac.service;

import com.caocaorbac.pojo.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getAllMenuByRoleID(int roleId);

    List<Menu> constructTreeResult(List<Menu> pMenus, List<Menu> allMenus);

    List<Menu> getChildMenuByParentId(int parentId, List<Menu> menulist);

    List<String> getAllChildByPID(int parentId, int level);
}
