package com.caocaorbac.feign.hystrix;

import com.caocaorbac.feign.client.MockServiceClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class MockServiceFallback implements FallbackFactory<MockServiceClient> {
    @Override
    public MockServiceClient create(Throwable cause) {
        return new MockServiceClient() {
            @Override
            public String mockGetData() {
                return new String("fallback; reason was: " + cause.getMessage());
            }
        };
    }
}