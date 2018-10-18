package com.example.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Admin on 2018/10/17.
 */
@ApiModel(description = "项目管理实体")
public class UserInfo {
    private String id;
    @ApiModelProperty(name = "username", value = "项目名称", required = true, position = 1,example="张三")
    private String username;
    @ApiModelProperty(name = "password", value = "密码", required = false, position = 2, example = "123456")
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
