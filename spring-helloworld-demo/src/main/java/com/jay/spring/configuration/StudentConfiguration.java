package com.jay.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author xiang.wei
 * @date 2020/5/3 2:25 PM
 */
@Configuration
//可以同时导入多个配置文件，比如：@Import({A.class,B.class})
@Import(TeacherConfiguration.class)
public class StudentConfiguration {

    @Bean
    public StudentService studentService(TeacherService teacherService) {
        return new StudentServiceImpl(teacherService);
    }
}

