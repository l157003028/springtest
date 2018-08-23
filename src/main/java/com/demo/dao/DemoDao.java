package com.demo.dao;

import org.springframework.stereotype.Repository;

/**
 * @InterfaceName DemoDao
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/16 16:03
 * @Version 1.0
 **/
@Repository
public class DemoDao {
    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "DemoDao{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
