package com.config.db;/**
 * Created by 168 on 2019/3/2.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @description
 * @author: hailang
 * @create: 2019-03-02 18:05
 */
@Configuration
@ConfigurationProperties(prefix="spring.datasource")
public class JdbcConfig {


    private String password;

    private String username;

    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
