package com.caocaorbac.feign.client;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient(name = "mock-service", path = "/mock")
@Component
public interface MockServiceClient {
    @RequestMapping(value="/v2/common/getAllCities",method= RequestMethod.GET)
    String mockGetData();

}
