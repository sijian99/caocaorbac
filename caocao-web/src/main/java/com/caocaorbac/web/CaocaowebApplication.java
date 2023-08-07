package com.caocaorbac.web;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
//import jakarta.servlet.Servlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages = {"com.caocaorbac.web"})
@EnableFeignClients(clients = {com.caocaorbac.feign.client.MockServiceClient.class})
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class CaocaowebApplication {
    public static void main(String[] args) {
        SpringApplication.run(CaocaowebApplication.class, args);
    }

}

