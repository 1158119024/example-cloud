package com.xiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: 晓枫
 * @Date: 2019/1/20 21:40
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringBootEureka7001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEureka7001.class, args);
    }
}
