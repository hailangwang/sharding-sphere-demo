package com.util;/**
 * Created by 168 on 2019/2/28.
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
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
public class DataSourceDruidConfig {




    private String password;

    private String username;

    private String jdbcUrl;

    private String driverClassName;




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
