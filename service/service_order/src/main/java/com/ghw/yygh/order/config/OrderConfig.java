package com.ghw.yygh.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lijian
 * @create 2021-05-03 18:38
 */
@Configuration
@MapperScan("com.ghw.yygh.order.mapper")
public class OrderConfig {
}
