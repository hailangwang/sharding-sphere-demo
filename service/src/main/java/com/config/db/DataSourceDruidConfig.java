package com.config.db;/**
 * Created by 168 on 2019/2/28.
 */

/**
 * @description
 * @author: hailang
 * @create: 2019-02-28 16:00
 */
//@Configuration
//@ConfigurationProperties(prefix="spring.datasource")
public class DataSourceDruidConfig {




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

//    @Bean
//    public DataSource dataSource(){
//
//
//        System.out.println(username);
//
////        DruidDataSource dataSource = new DruidDataSource();
//
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        dataSource.setUrl(url);
//
//
//        return dataSource;
//
//    }

}
