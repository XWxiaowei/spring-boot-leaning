package com.jay.spring.web;

import com.alibaba.fastjson.JSON;
import com.jay.spring.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang.wei
 * @create 2018/6/12 12:41
 */
@RestController
@RequestMapping(produces = "text/plain;charset='utf-8'")
public class WebController {
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public User getUser() {
        User user=new User();
        user.setName("小明");
        user.setAge(12);
        user.setPass("123456");
        return user;
    }
    @RequestMapping(value = "/getUsers",method = RequestMethod.POST)
    public List<User> getUsers() {
        List<User> users=new ArrayList<User>();
        User user1=new User();
        user1.setName("neo");
        user1.setAge(30);
        user1.setPass("neo123");
        users.add(user1);
        User user2=new User();
        user2.setName("小明");
        user2.setAge(12);
        user2.setPass("123456");
        users.add(user2);
        return users;
    }

    @RequestMapping(value = "getUser2", method = RequestMethod.GET)
    public String getUser2(User user) {
        return JSON.toJSONString(user);
    }
    @RequestMapping(value = "get/{name}", method = RequestMethod.GET)
    public User get(@PathVariable String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user" + user.toString());
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getCode()+"-"+allError.getDefaultMessage());
            }
        }
    }
}
