package com.caocaorbac.mapper;

import com.caocaorbac.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuMapper {

    /** get urls by menu**/
    Role getMenuById(@Param("id") Integer id);
}
