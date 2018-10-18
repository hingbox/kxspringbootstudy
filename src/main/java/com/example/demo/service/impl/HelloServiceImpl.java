package com.example.demo.service.impl;

import com.example.demo.bean.UserInfo;
import com.example.demo.dao.HelloDao;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 2018/10/17.
 */
@Service
public class HelloServiceImpl implements HelloService {

    //引入dao层接口
    @Autowired
    private HelloDao helloDao;

    @Override
    public int testInterFace() {
        return 0;
    }

    @Override
    public UserInfo testUser(String username) {
        return helloDao.findByName(username);
    }

    @Override
    public int updatetUser(String username, String id) {
        return helloDao.update(username,id);
    }

    @Override
    public int insertUser(String username, String password) {
        return helloDao.insert(username,password);
    }
}
