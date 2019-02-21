package com.xiaofeng.example.collect.mapper;

import com.xiaofeng.example.collect.entity.CollectEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: 晓枫
 * @Date: 2019/1/21 22:15
 * @Description:
 */
@Mapper
public interface CollectMapper {

    @Select("select * from example_collect")
    List<CollectEntity> list();
}
