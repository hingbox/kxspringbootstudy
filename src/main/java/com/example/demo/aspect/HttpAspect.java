package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 2018/10/19.
 */
@Aspect
@Component
public class HttpAspect {
    /**
     * @Before 在方法执行之前执行
     */
    @Before("execution(public * com.example.demo.controller.TestController.*(..))")
    public void log() {
        System.out.println("doBefore");

    }

    /**
     * @After在方法执行之后执行
     */
    @After("execution(public * com.example.demo.controller.TestController.*(..))")
    public void doAfter() {
        System.out.println("doAfter");
    }
}
