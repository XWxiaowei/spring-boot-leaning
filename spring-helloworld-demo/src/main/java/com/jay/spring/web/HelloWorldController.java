package com.jay.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiang.wei
 * @create 2018/6/12 12:41
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(String name) {
        return "Hello world,"+name;
    }
}
