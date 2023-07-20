package com.caocaorbac.mapper;

import com.caocaorbac.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RoleMapper {

    /** get list of roles by usercode **/
    List<Role> getRoleByUserID(int userId);
}
