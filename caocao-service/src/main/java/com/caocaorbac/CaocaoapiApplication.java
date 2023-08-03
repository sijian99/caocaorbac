package com.caocaorbac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
@MapperScan(basePackages = {"com.caocaorbac.mapper"})
public class CaocaoapiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CaocaoapiApplication.class, args);
    }
}
