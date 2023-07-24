package com.caocaorbac.mapper;

import com.caocaorbac.pojo.ServiceResponse;
import com.caocaorbac.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface UserMapper {

    /** get User by login **/
    User login(@Param("username") String username, @Param("pwd") String pwd);;

    /** get All User Information **/
    List<Map<String, Object>> getAllUeserInfo();

    /** add user **/
    void addUser(User user);

    /** batch add user **/
    void batchAddUser(List<User> userItems);

    /** delete user **/
    void deleteUser(String userCode);

    /** update user info**/
    void updateUserInfo(User user);


    //    /** get role by user id**/
//    Role getRoleByUser(@Param("id") Integer id);



}
