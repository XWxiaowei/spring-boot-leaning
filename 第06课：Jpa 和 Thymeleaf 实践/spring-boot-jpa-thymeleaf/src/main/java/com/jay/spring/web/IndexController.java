package com.jay.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiang.wei on 2018/6/14
 *
 * @author xiang.wei
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @RequestMapping("/home")
    public String home() {
        System.out.println("你好");
        return "layout";
    }
}
