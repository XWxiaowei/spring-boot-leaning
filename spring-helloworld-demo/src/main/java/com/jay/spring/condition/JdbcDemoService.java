package com.jay.spring.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * @author xiang.wei
 * @date 2020/5/3 2:50 PM
 */
@Conditional(JdbcTemplateCondition.class)
@Service
public class JdbcDemoService {

}

