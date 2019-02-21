package com.xiaofeng.config.health;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xiaofeng.config.health.mapper.HealthMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @auther: 晓枫
 * @date: 2018/10/17 22:11
 * @Description: 健康检查
 */
@Log4j2
@Component
public class MyHealthIndicator implements HealthIndicator {

    @Resource
    private HealthMapper healthMapper;

    // 错误次数
    private int healthIndicatorErrorCount;
    // 错误次数上限
    private int healthIndicatorCount = 2;

    @Override
    @HystrixCommand(fallbackMethod = "connectDataBaseNo")
    public Health health() {
        log.info("health check");
        try{
            healthMapper.check();
            //查询通过后重置错误次数, 状态修改为up
            if( healthIndicatorErrorCount >= healthIndicatorCount ){
                healthIndicatorErrorCount = 0;
            }
        }catch (Exception e){
            healthIndicatorErrorCount++;
            log.error("health check: databases connection time out, connection count = "+healthIndicatorErrorCount);
        }
        if( healthIndicatorErrorCount >= healthIndicatorCount ){
            return new Health.Builder(Status.DOWN).build();
        }
        return new Health.Builder(Status.UP).build();
    }

    public Health connectDataBaseNo(){
        if( healthIndicatorErrorCount >= healthIndicatorCount ){
            return new Health.Builder(Status.DOWN).build();
        }
        return new Health.Builder(Status.UP).build();
    }
}
