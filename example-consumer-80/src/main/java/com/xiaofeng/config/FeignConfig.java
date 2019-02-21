package com.xiaofeng.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 晓枫
 * @Date: 2019/2/4 13:27
 * @Description:
 */
@Configuration
public class FeignConfig {

    // 安全校验信息
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "lzj1158119024");
    }

    // feign日志星级
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
