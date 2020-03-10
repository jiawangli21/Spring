package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试页面
 */
@Controller
public class test {

    @RequestMapping("index")
    public String directToIndex(){
        return "index";
    }

}
