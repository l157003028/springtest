package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/23 16:23
 * @Version 1.0
 **/
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "INSERT INTO user(id,name,address,email,phone) VALUES(5,?,?,?,?)";
        String name = "zhangSan";
        String address = "西安";
        String email = UUID.randomUUID().toString().substring(0,6).concat("@163.com");
        String phone = UUID.randomUUID().toString().substring(0,10);
        jdbcTemplate.update(sql,name,address,email,phone);
    }


}
