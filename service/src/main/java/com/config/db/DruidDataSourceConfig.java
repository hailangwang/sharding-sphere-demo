package com.config.db;/**
 * Created by 168 on 2019/3/2.
 */

import com.config.db.source.DuridDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @description
 * @author: hailang
 * @create: 2019-03-02 18:18
 */
public class DruidDataSourceConfig {

   @Autowired
   private  JdbcConfig jdbcConfig;


    @Bean
    public DataSource dataSource(){
        DuridDatasource dataSource = new DuridDatasource(jdbcConfig);
        return dataSource.dataSource();
    }

}
