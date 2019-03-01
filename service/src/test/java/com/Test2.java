package com;/**
 * Created by 168 on 2019/2/28.
 */

import com.bean.GlSjPzmb;
import com.service.GlSjPzmbService;
import com.util.DataSourceDruidConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @description
 * @author: hailang
 * @create: 2019-02-28 16:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class Test2 {



    @Autowired
    private  DataSourceDruidConfig dataSourceDruidConfig;

    @Autowired
    private GlSjPzmbService glSjPzmbService;

    @Test
    public void test(){

        List<GlSjPzmb> list =  glSjPzmbService.selectBaseListByZtdmAndKjndAndKjqj("1485080844783",2017,7);
        System.out.println(list.size());
    }



}
