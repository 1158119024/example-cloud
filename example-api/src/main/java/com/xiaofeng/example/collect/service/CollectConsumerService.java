package com.xiaofeng.example.collect.service;

import com.xiaofeng.example.collect.entity.CollectEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Auther: 晓枫
 * @Date: 2019/2/4 12:04
 * @Description:
 */
@FeignClient("example-provider")   // 指向对应服务的spring.application.name
public interface CollectConsumerService {

    @RequestMapping(value = "/collect/list", method = RequestMethod.GET)
    List<CollectEntity> list();

    @RequestMapping(value = "/collect/getService", method = RequestMethod.GET)
    String getService();
}
