package com.ghw.yygh.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/19 15:51
 * @Version
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.ghw")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.ghw")
public class ServiceUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}
