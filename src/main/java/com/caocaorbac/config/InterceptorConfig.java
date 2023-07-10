package com.caocaorbac.config;

import com.caocaorbac.interceptor.JWTInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new JWTInterceptor())
                //.addPathPatterns(" ")
                .excludePathPatterns("/user/login");
    }

}
