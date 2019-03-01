package com.util;/**
 * Created by 168 on 2019/2/28.
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @description
 * @author: hailang
 * @create: 2019-02-28 16:00
 */
@Configuration
@AutoConfigureAfter(DataSourceDruidConfig.class)
@ConfigurationProperties(prefix="spring1")
public class DataSourceDruidConfig {




    private String password;

    private String username;

    private String jdbcUrl;

    private String driverClassName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    @Bean
    public DataSource dataSource(){

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);

        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(jdbcUrl);





        return dataSource;
//        dataSource.


    }

}
