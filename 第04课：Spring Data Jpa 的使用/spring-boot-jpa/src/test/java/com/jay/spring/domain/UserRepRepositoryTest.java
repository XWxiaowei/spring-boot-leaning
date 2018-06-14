package com.jay.spring.domain;

import com.jay.spring.domain.primary.UserPrimaryRepository;
import com.jay.spring.domain.secondary.UserSecondaryRepository;
import com.jay.spring.model.UserRep;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author xiang.wei
 * @create 2018/6/14 18:52
 */
public class UserRepRepositoryTest {
    @Resource
    private UserPrimaryRepository userPrimaryRepository;
    @Resource
    private UserSecondaryRepository userSecondaryRepository;

    @Test
    public void test() {
        userPrimaryRepository.deleteAll();
        Date date = new Date();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);

        String formattedDate = dateInstance.format(date);
        userPrimaryRepository.save(new UserRep("aa", "aa@126.com", "aa", "aa123456", formattedDate, "xiang", 18,"wei"));
        userPrimaryRepository.save(new UserRep("bb", "bb@126.com", "bb", "bb123456", formattedDate, "liu", 19,"wen"));
        userSecondaryRepository.save(new UserRep("aa", "aa@126.com", "aa", "aa123456", formattedDate, "xiang", 18,"wei"));



    }

}
