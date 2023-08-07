package com.caocaorbac.web.api;

import com.caocaorbac.feign.client.MockServiceClient;
//import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MockWebController {
    @Resource
    private MockServiceClient mockServiceClient;

    @GetMapping(value="mock/v2/common/getAllCities")
    public String mockGetData(){
        return mockServiceClient.mockGetData();
    }


}
