package com.ghw.yygh.hosp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/13 10:13
 * @Version
 */
@Configuration
@MapperScan("com.ghw.yygh.hosp.mapper")
public class HospConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
