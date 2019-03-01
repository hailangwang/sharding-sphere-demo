package com;/**
 * Created by 168 on 2019/2/28.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @description
 * @author: hailang
 * @create: 2019-02-28 15:27
 */
@SpringBootApplication
@MapperScan("com.dao")
@PropertySource("classpath:application.yml")
public class SphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(SphereApplication.class, args);
    }

}
