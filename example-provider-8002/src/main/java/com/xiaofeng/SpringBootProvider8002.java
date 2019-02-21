package com.xiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: 晓枫
 * @Date: 2019/2/15 17:17
 * @Description:
 */
@EnableCircuitBreaker // 开启熔断
@SpringBootApplication
@EnableEurekaClient
public class SpringBootProvider8002 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProvider8002.class, args);
    }
}
