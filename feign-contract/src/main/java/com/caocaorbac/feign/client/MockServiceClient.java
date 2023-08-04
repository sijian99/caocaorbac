package com.caocaorbac.feign.client;

//import com.caocaorbac.feign.hystrix.MockServiceFallback;
import com.caocaorbac.feign.hystrix.MockServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "caocao-service", path = "/mock", fallback = MockServiceFallback.class)
@Component
public interface MockServiceClient {
    @GetMapping(value="/v2/common/getAllCities")
    String mockGetData();

}
