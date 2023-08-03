package com.caocaorbac.web.api;

import com.caocaorbac.web.service.MockWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockWebController {
    @Autowired
    private MockWebService mockWebService;

    @RequestMapping(value="mock/v2/common/getAllCities",method= RequestMethod.GET)
    public String mockGetData(){
        return mockWebService.mockGetData();
    }


}
