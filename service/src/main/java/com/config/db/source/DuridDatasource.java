package com.config.db.source;/**
 * Created by 168 on 2019/3/2.
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.config.db.JdbcConfig;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author: hailang
 * @create: 2019-03-02 18:07
 */
@Component
public class DuridDatasource {


    private JdbcConfig jdbcConfig;

    public JdbcConfig getJdbcConfig() {
        return jdbcConfig;
    }

    public void setJdbcConfig(JdbcConfig jdbcConfig) {
        this.jdbcConfig = jdbcConfig;
    }

    public DuridDatasource(JdbcConfig jdbcConfig){
        this.jdbcConfig = jdbcConfig;

    }


    public DruidDataSource dataSource(){

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcConfig.getDriverClassName());
        dataSource.setUsername(jdbcConfig.getUsername());
        dataSource.setPassword(jdbcConfig.getPassword());
        dataSource.setUrl(jdbcConfig.getUrl());

        return dataSource;

    }

}
