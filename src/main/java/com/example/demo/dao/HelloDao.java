package com.example.demo.dao;

import com.example.demo.bean.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Admin on 2018/10/17.
 */
@Mapper
//@Repository
public interface HelloDao {
    @Select("SELECT * FROM userinfo WHERE username = #{username}")
    UserInfo findByName(@Param("username") String username);

    @Insert("INSERT INTO userinfo(username, password) VALUES(#{username}, #{password})")
    int insert(@Param("username") String name, @Param("password") String password);

}
