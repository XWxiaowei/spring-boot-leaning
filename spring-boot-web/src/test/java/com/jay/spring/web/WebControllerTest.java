package com.jay.spring.web;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @author xiang.wei
 * @create 2018/6/12 13:05
 */
@SpringBootTest
public class WebControllerTest {
    private MockMvc mockMvc;
    @Test
    public void hello() {
        System.out.println("hello world");
    }
    @Before
    public void  setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }
    @Test
    public void getUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andDo(print());
    }

    @Test
    public void getUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/getUsers")).andDo(print());
    }
}