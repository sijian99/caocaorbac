package com.caocaorbac.web.api;

import com.caocaorbac.feign.client.MockServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockWebController {
    @Autowired
    private MockServiceClient mockServiceClient;

    @GetMapping(value="mock/v2/common/getAllCities")
    public String mockGetData(){
        return mockServiceClient.mockGetData();
    }


}
