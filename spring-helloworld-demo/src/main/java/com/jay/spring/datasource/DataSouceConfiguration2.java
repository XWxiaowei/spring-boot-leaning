package com.jay.spring.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author xiang.wei
 * @date 2020/5/3 4:21 PM
 */
@Configuration
@ConfigurationProperties(prefix = "jdbc.mysql")
public class DataSouceConfiguration2 {

    public String url;

    public String user;

    public String password;


    //@Bean
    //public DataSource dataSource() {
    //    DataSource ds = new BasicDataSource();
    //    ds.setDriverClassName("com.mysql.jdbc.Driver");
    //    ds.setUrl(url);
    //    ds.setUsername(user);
    //    ds.setPassword(password);
    //    return ds;
    //}
}
