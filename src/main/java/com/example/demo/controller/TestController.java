package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2018/10/17.
 */
@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    //@ApiIgnore//使用该注解忽略这个API
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @RequestMapping("/say")
    private String say(){
        logger.info("logback 访问hello");
        return "haha";
    }
}
