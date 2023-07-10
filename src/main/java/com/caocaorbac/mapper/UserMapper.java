package com.caocaorbac.mapper;

import com.caocaorbac.pojo.Role;
import com.caocaorbac.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

   /// @Select("select * from User where user_name=#{user_name} and pwd=#{pwd}")


    /** get User by login **/
    User selUserInfoMapper(@Param("username") String username, @Param("pwd") String pwd);


    /** get role by user id**/
    Role getRoleByUser(@Param("id") Integer id);

}
