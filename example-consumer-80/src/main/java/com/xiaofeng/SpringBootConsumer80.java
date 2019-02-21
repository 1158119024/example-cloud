package com.xiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: 晓枫
 * @Date: 2019/1/20 22:08
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringBootConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsumer80.class, args);
    }
}
