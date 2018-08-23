package com.demo.controller;

import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/16 16:02
 * @Version 1.0
 **/
@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;
}
