package com.caocaorbac.feign.client;

//import com.caocaorbac.feign.hystrix.MockServiceFallback;
import com.caocaorbac.feign.hystrix.MockServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "caocao-service", url = "http://localhost:9090/mock/v2/common/getAllCities",fallback = MockServiceFallback.class)
@Component
public interface MockServiceClient {
    @GetMapping
    String mockGetData();

}
