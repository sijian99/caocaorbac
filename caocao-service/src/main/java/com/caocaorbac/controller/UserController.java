package com.caocaorbac.controller;

import com.caocaorbac.mapper.UserMapper;
import com.caocaorbac.service.UserService;
import com.caocaorbac.vo.OrdercarVo;
import com.caocaorbac.vo.QueryCityVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

   @RequestMapping(value="/v2/common/queryCity",method= RequestMethod.GET)
    public String queryCityId(QueryCityVO queryCityVO){
        return userMapper.queryCityId(queryCityVO);
    }
}
