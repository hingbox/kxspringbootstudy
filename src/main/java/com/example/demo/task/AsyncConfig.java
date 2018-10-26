package com.example.demo.task;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by Admin on 2018/10/18.
 */
@Configuration
@EnableAsync
public class AsyncConfig {
    /*
    此处成员变量应该使用@Value从配置中读取
     */
    //private int corePoolSize = 10;
    private int maxPoolSize = 200;
    //private int queueCapacity = 10;
    @Value("${server.corePoolSize}")
    int corePoolSize;
    @Value("${server.queueCapacity}")
    int queueCapacity;

    @Bean
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.initialize();
        return executor;
    }

}
