package com.example.demo.controller;

import com.example.demo.bean.UserInfo;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2018/10/17.
 */
@RestController
@ComponentScan(basePackages={"com.example.demo.service"})//添加的注解
public class HelloWordController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value="/hello")
    public String hello(){
        System.out.println("进入springboot hello");
        return "欢迎来到springboot世界";
    }

    //增加新的对外访问接口
    @RequestMapping("/get")
    @ResponseBody UserInfo get() {
        UserInfo userInfo = helloService.testUser("username123寇鑫");
        return userInfo;
    }
    //增加新的对外访问接口
    @RequestMapping("/add")
    @ResponseBody String add() {
        helloService.insertUser("username123寇鑫","password123寇鑫");
        return "插入成功";
    }

}
