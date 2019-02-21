package com.xiaofeng.example.collect.controller;

import com.xiaofeng.example.collect.entity.CollectEntity;
import com.xiaofeng.example.collect.service.CollectService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 晓枫
 * @Date: 2019/1/21 22:12
 * @Description:
 */
@RestController
@RequestMapping("/collect")
@Log
public class CollectController {

    @Autowired
    private CollectService collectService;

    @RequestMapping("/list")
    public List<CollectEntity> list(){
        return collectService.list();
    }

    @RequestMapping("/getService")
    public String getService(){
        return "provider-8002提供服务";
    }
}
