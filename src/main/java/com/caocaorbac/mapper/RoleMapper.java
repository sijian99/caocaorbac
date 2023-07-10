package com.caocaorbac.mapper;

import com.caocaorbac.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {

    /** get Menu of role**/
    Role getMenuById(@Param("id") Integer id);

}
