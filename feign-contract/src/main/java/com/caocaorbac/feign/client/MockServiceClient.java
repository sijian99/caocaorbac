package com.caocaorbac.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "mock-service", path = "/mock")
public interface MockServiceClient {
    @RequestMapping(value="get/mockdata",method= RequestMethod.GET)
    String mockGetData();

}
