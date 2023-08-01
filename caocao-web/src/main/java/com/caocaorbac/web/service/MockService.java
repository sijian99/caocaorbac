package com.caocaorbac.web.service;

import com.caocaorbac.feign.client.MockServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class MockService {

    @Resource
    private MockServiceClient mockServiceClient;

    public String mockGetData(){
        return mockServiceClient.mockGetData();
    }
}
