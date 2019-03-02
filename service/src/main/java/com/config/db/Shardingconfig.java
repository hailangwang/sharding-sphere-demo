package com.config.db;/**
 * Created by 168 on 2019/3/2.
 */

import com.config.db.source.DuridDatasource;
import com.config.sharing.table.GlSjpmbRuleConfig;
import io.shardingjdbc.core.api.ShardingDataSourceFactory;
import io.shardingjdbc.core.api.config.ShardingRuleConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description
 * @author: hailang
 * @create: 2019-03-02 18:15
 */
public class Shardingconfig {


    @Autowired
    private  JdbcConfig jdbcConfig;

    @Autowired
    private GlSjpmbRuleConfig glSjpmbRuleConfig;

    @Bean
    public DataSource dataSource() throws SQLException {


        Map<String,DataSource> dataSourceMap = new HashMap<>();

        DuridDatasource duridDatasource = new DuridDatasource(jdbcConfig);
        DataSource  ds0 = duridDatasource.dataSource();
        dataSourceMap.put("ds0",ds0);



        // 配置分片规则
        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
        shardingRuleConfig.getTableRuleConfigs().add(glSjpmbRuleConfig.userRuleConfig());
        Properties p = new Properties();
        p.setProperty("sql.show",Boolean.TRUE.toString());


        DataSource dataSource  = ShardingDataSourceFactory.createDataSource(dataSourceMap,shardingRuleConfig,new ConcurrentHashMap(),p);

        return dataSource;
    }





}
