package com.demo.service;

import com.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @InterfaceName DemoService
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/16 16:03
 * @Version 1.0
 **/
@Service
public class DemoService {
//    @Qualifier("demoDao")
    @Autowired(required=false)
//    @Autowired
    private DemoDao demoDao;

    public void print(){
        System.out.println("demoDao");
}

    @Override
    public String toString() {
        return "DemoService{" +
                "demoDao=" + demoDao +
                '}';
    }
}
