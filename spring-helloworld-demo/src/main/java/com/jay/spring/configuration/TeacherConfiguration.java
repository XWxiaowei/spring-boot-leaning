package com.jay.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiang.wei
 * @date 2020/5/3 2:22 PM
 */
@Configuration
public class TeacherConfiguration {

    @Bean
    public TeacherService teacherService(){
        return new TeacherServiceImpl();
    }
}
