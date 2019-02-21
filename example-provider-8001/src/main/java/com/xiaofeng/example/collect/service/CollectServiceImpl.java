package com.xiaofeng.example.collect.service;

import com.xiaofeng.example.collect.entity.CollectEntity;
import com.xiaofeng.example.collect.mapper.CollectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 晓枫
 * @Date: 2019/1/21 22:38
 * @Description:
 */
@Service
public class CollectServiceImpl implements CollectService {

    @Resource
    private CollectMapper collectMapper;

    public List<CollectEntity> list(){
        return collectMapper.list();
    }
}
