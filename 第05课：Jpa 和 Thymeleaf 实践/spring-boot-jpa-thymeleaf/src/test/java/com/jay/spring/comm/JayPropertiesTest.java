package com.jay.spring.comm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xiang.wei
 * @create 2018/6/14 10:39
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JayPropertiesTest {

    @Autowired
    private JayProperties jayProperties;
    @Test
    public void testProperties() {
        Assert.assertEquals("飞飞_1024M", jayProperties.getTitle());
        Assert.assertEquals("努力学习", jayProperties.getDescription());

    }
}