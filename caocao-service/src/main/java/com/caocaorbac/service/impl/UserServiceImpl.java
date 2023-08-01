package com.caocaorbac.service.impl;

import com.caocaorbac.mapper.UserMapper;
import com.caocaorbac.vo.QueryCityVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public String queryCityId(QueryCityVO queryCityVO){
        return userMapper.queryCityId(queryCityVO);
    }
}
