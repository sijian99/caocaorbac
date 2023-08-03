package com.caocaorbac.web;


import com.caocaorbac.feign.client.MockServiceClient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication(scanBasePackages = {"com.caocaorbac.web", "com.caocaorbac.service", "com.caocaorbac"})
@MapperScan(basePackages = {"com.caocaorbac.mapper"})
@EnableFeignClients(clients = {com.caocaorbac.feign.client.MockServiceClient.class})
@EnableDiscoveryClient
public class CaocaowebApplication {
    public static void main(String[] args) {
        SpringApplication.run(CaocaowebApplication.class, args);
    }
}

