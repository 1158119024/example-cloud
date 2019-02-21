package com.xiaofeng.config.health.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: 晓枫
 * @Date: 2019/1/23 15:40
 * @Description:
 */
@Mapper
public interface HealthMapper {

    @Select("SELECT 1")
    public Long check();
}
