package com.ghw.yygh.cmn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/15 16:03
 * @Version
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.ghw"})
public class ServiceCmnApplication {

    public static void main(String[] args){
        SpringApplication.run(ServiceCmnApplication.class, args);
    }
}
