package com.ghw.yygh.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/15 16:03
 * @Version
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.ghw"})
@EnableDiscoveryClient
public class ServiceCmnApplication {

    public static void main(String[] args){
        SpringApplication.run(ServiceCmnApplication.class, args);
    }
}
