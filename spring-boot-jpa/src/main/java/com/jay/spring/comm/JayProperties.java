package com.jay.spring.comm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xiang.wei
 * @create 2018/6/14 10:37
 */
@Component
public class JayProperties {
    @Value("${com.jay.title}")
    private String title;
    @Value("${com.jay.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
