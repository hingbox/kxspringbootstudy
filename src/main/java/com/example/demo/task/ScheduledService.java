package com.example.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 2018/10/18.
 */

/**
 * 使用的是同一个线程  如果一个线程死掉，后面任务无法执行 此方法不可行
 */
@Slf4j
@Component
@Async//配置多线程定时任务
public class ScheduledService {
    private static Logger LOGGER = LoggerFactory.getLogger(ScheduledService.class);
    @Scheduled(cron = "0/5 * * * * *")//通过表达式来配置任务执行时间
    public void scheduled(){
        LOGGER.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }
    @Scheduled(fixedRate = 5000)//定义一个按一定频率执行的定时任务
    public void scheduled1() {
        LOGGER.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
    }
    @Scheduled(fixedDelay = 5000)//定义一个按一定频率执行的定时任务，与上面不同的是，改属性可以配合initialDelay， 定义该任务延迟执行时间
    public void scheduled2() {
        LOGGER.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
    }
}
