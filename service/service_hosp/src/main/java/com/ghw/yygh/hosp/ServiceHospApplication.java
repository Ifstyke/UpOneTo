package com.ghw.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/13 09:00
 * @Version
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.ghw")
public class ServiceHospApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
