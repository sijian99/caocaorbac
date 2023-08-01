package com.caocaorbac.web;

import com.caocaorbac.CaocaoapiApplication;
import com.caocaorbac.feign.client.MockServiceClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients(clients = {MockServiceClient.class})
@MapperScan
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class CaocaowebApplication {
    public static void main(String[] args) {
        SpringApplication.run(CaocaowebApplication.class, args);
    }
}

