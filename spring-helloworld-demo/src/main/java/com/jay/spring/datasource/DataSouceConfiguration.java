package com.jay.spring.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiang.wei
 * @date 2020/5/3 4:21 PM
 */
@Configuration
public class DataSouceConfiguration {
    @Value("jdbc.mysql.url")
    public String url;
    @Value("jdbc.mysql.username")
    public String user;
    @Value("jdbc.mysql.password")
    public String password;


    //@Bean
    //public DataSource dataSource() {
    //    BasicDataSource ds = new BasicDataSource();
    //    ds.setDriverClassName("com.mysql.jdbc.Driver");
    //    ds.setUrl(url);
    //    ds.setUsername(user);
    //    ds.setPassword(password);
    //    return ds;
    //}
}
