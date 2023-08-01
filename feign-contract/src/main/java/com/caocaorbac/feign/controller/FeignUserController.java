package com.caocaorbac.feign.controller;

import com.caocaorbac.controller.UserController;
import com.caocaorbac.feign.client.UserServiceClient;
import com.caocaorbac.vo.QueryCityVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FeignUserController implements UserServiceClient {
    @Autowired
    private UserController userController;

    @Override
    public String queryCityId(QueryCityVO queryCityVO){
        return userController.queryCityId(queryCityVO);
    }
}
