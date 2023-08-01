package com.caocaorbac.feign.controller;

import com.caocaorbac.controller.MockController;
import com.caocaorbac.feign.client.MockServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FeignClientMockController implements MockServiceClient {

    @Autowired
    private MockController mockController;

    @Override
    public String mockGetData(){
        return mockController.mockGetData();
    }
}
