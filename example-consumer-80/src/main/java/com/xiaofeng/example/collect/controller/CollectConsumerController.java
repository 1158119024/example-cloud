package com.xiaofeng.example.collect.controller;

import com.xiaofeng.example.collect.entity.CollectEntity;
import com.xiaofeng.example.collect.service.CollectConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 晓枫
 * @Date: 2019/2/4 12:02
 * @Description:
 */
@RequestMapping("/collect")
@RestController
public class CollectConsumerController {

    @Resource
    private CollectConsumerService collectConsumerService;

    @RequestMapping("/list")
    public List<CollectEntity> list(){
        return collectConsumerService.list();
    }

    @RequestMapping("/getService")
    public String getService(){
        return collectConsumerService.getService();
    }
}
