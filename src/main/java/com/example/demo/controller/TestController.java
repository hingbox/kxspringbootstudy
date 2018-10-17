package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2018/10/17.
 */
@RestController
public class TestController {
    @RequestMapping("/say")
    private String say(){
        return "haha";
    }
}
