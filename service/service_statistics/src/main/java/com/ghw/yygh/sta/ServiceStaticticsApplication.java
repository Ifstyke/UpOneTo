package com.ghw.yygh.sta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/31 16:04
 * @Version
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.ghw"})
@ComponentScan(basePackages = {"com.ghw"})
public class ServiceStaticticsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceStaticticsApplication.class, args);
    }
}