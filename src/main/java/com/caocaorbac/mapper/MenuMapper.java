package com.caocaorbac.mapper;

import com.caocaorbac.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MenuMapper {

    /** get list of Menus by roleId **/
    List<Menu> getAllMenuByRoleID(int roleId);

    List<String> getAllChildByPID(int parentId, int level);

}

