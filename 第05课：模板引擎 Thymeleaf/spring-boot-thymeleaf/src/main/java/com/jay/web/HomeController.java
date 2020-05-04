package com.jay.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiang.wei on 2018/6/21
 *
 * @author xiang.wei
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    @RequestMapping("/layout")
    public String layout() {
        return "layout";
    }
}
