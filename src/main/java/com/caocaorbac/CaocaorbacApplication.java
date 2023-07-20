package com.caocaorbac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = {"com.caocaorbac.mapper"})
public class CaocaorbacApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaocaorbacApplication.class, args);
    }

}
