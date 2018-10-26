package com.example.demo.controller;

import com.example.demo.bean.ResponseResult;
import com.example.demo.bean.UserInfo;
import com.example.demo.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Admin on 2018/10/17.
 */
@Api(tags = "hello管理")
@RestController
@ComponentScan(basePackages={"com.example.demo.service"})//添加的注解
public class HelloWordController {
    private static Logger LOGGER = LoggerFactory.getLogger(HelloWordController.class);

    @Autowired
    private HelloService helloService;

    @RequestMapping(value="/hello")
    public String hello(){
        System.out.println("进入springboot hello");
        return "欢迎来到springboot世界";
    }

    /**
     * 查询用户
     * @return
     */
    @RequestMapping(value="/getUserInfo",method = {RequestMethod.POST,RequestMethod.GET},produces = "application/json;charset=UTF-8")
    @ApiOperation(value="获取用户信息（/demo/getUserInfo）",notes = "根据用户名查询用户信息",nickname = "kx")
    //@ApiImplicitParam(name="username",value="用户名",required = true,dataType = "String")
    //@RequestBody Map<String,Object> reqMap
    public ResponseResult get(@RequestBody @Valid UserInfo userInfo) {
        ResponseResult result = new ResponseResult();
        String username = userInfo.getUsername();
        UserInfo userInfos = helloService.testUser(username);
        result.setData(userInfos);
        LOGGER.info("kk");
        return result;
    }
    //增加新的对外访问接口
    @RequestMapping("/add")
    @ResponseBody String add() {
        helloService.insertUser("username123寇鑫","password123寇鑫");
        return "插入成功";
    }

    //更新新的对外访问接口
    @ApiOperation(value="更新用户信息（/demo/update）",notes = "根据id更新用户信息",nickname = "kx")
    @RequestMapping(value="/update",method = {RequestMethod.POST,RequestMethod.GET},produces = "application/json;charset=UTF-8")
    @ResponseBody ResponseResult update(@RequestBody @Valid UserInfo userInfo) {
        ResponseResult result = new ResponseResult(200,"成功",null);
        String id = userInfo.getId();
        String username = userInfo.getUsername();
        helloService.updatetUser(username,id);
        return result;
    }

    @RequestMapping("/v")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @RequestMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("dist/home");
    }

}
