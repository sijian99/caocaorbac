package com.caocaorbac.web.api;

import com.caocaorbac.feign.client.MockServiceClient;
import com.caocaorbac.web.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {
    @Autowired
    private MockService mockService;

    @RequestMapping(value="mock/v2/common/getAllCities",method= RequestMethod.GET)
    public String mockGetData(){
        return mockService.mockGetData();
    }


}
