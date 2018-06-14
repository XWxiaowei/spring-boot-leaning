package com.jay.spring.domain;

import com.jay.spring.model.UserRep;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author xiang.wei
 * @create 2018/6/14 12:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;

    @Test
    public void findByUserName() {
    }

    @Test
    public void findByUserNameOrEmail() {
    }

    @Test
    public void test() {
        Date date = new Date();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.LONG,Locale.ENGLISH);

        String formattedDate = dateInstance.format(date);
        userRepository.save(new UserRep("aa", "aa@126.com", "aa", "aa123456", formattedDate));
        userRepository.save(new UserRep("bb", "bb@126.com", "bb", "bb123456",formattedDate));
        userRepository.save(new UserRep("cc", "cc@126.com", "cc", "cc123456",formattedDate));

        Assert.assertEquals(9, userRepository.findAll().size());
        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa1"));

    }
}