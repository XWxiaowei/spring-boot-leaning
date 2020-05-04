package com.jay.spring.configuration;

/**
 * @author xiang.wei
 * @date 2020/5/3 2:27 PM
 */
public class StudentServiceImpl implements StudentService {

    private TeacherService teacherService;

    public StudentServiceImpl(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
