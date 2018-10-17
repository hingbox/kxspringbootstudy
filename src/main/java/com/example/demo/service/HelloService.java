package com.example.demo.service;

import com.example.demo.bean.UserInfo;

/**
 * Created by Admin on 2018/10/17.
 */
public interface HelloService {
    public int testInterFace();

    public UserInfo testUser(String username);

    public int insertUser(String username,String password);//新增的接口
}
