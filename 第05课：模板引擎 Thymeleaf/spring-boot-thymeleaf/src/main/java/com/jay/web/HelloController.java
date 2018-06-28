package com.jay.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiang.wei on 2018/6/14
 *
 * @author xiang.wei
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("message", "http://www.ityouknow.com");
        return "hello";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
