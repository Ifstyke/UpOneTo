package com.ghw.yygh.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lijian
 * @create 2021-05-03 18:29
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.ghw"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.ghw"})
public class ServiceOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceOrderApplication.class, args);
    }
}
