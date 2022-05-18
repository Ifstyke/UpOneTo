package com.ghw.yygh.cmn.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/15 16:12
 * @Version
 */
@Configuration
@MapperScan("com.ghw.yygh.cmn.mapper")
public class CmnConfig {
    /**
     * 分页插件
     */

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
