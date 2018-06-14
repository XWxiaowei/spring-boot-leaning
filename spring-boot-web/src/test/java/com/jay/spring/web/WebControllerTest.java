package com.jay.spring.web;

import com.jay.spring.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
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
        mockMvc.perform(MockMvcRequestBuilders.get("/getUser")).andDo(print());
    }

    @Test
    public void getUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/getUsers")).andDo(print());
    }
    @Test
    public void testGetUser2() throws Exception {
        User user=new User();
        user.setName("小明");
        user.setAge(12);
        user.setPass("123456");
        mockMvc.perform(MockMvcRequestBuilders.get("/getUser2").param("name",user.getName()).contentType("text/plain;charset=UTF-8")).andDo(print());
    }
    @Test
    public void testSaveUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                        .param("name","")
                        .param("age","666")
                        .param("pass","12345")).andDo(print());
    }
}