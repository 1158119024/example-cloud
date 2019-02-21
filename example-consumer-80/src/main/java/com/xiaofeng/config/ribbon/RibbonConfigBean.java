package com.xiaofeng.config.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 晓枫
 * @Date: 2019/2/15 17:30
 * @Description:
 */
@Configuration
public class RibbonConfigBean {
    @Bean
    @LoadBalanced   //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套   客户端负载均衡   的工具。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule getRule(){
        return new RoundRobinRule();
    }
}
