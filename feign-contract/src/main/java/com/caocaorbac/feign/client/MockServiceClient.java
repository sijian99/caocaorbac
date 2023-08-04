package com.caocaorbac.feign.client;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@FeignClient(name = "caocao-service", path = "/mock")
@Component
public interface MockServiceClient {
    @GetMapping(value="/v2/common/getAllCities")
    String mockGetData();

}
