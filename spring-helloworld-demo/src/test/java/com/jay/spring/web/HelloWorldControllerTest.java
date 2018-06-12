package com.jay.spring.web;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @author xiang.wei
 * @create 2018/6/12 13:05
 */
@SpringBootTest
public class HelloWorldControllerTest {
    private MockMvc mockMvc;
    @Test
    public void hello() {
        System.out.println("hello world");
    }
    @Before
    public void  setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }
    @Test
    public void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/hello?name=小明").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }

}