package com;/**
 * Created by 168 on 2019/2/28.
 */

import com.alibaba.fastjson.JSON;
import com.bean.GlSjPzmb;
import com.service.GlSjPzmbService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description
 * @author: hailang
 * @create: 2019-02-28 16:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@org.springframework.boot.test.context.SpringBootTest
@WebAppConfiguration
@Slf4j
public class SpringBootShardingTest {




    @Autowired
    private GlSjPzmbService glSjPzmbService;

    @Test
    public void selectTest(){
        GlSjPzmb glSjPzmb = new GlSjPzmb();
        glSjPzmb.setID(12232L);
        List<GlSjPzmb> list = glSjPzmbService.selectByGlSjPzmb(glSjPzmb);
        System.out.println("输出结果："+ JSON.toJSONString(list));



        GlSjPzmb result =  glSjPzmbService.selectByPrimaryKey(12231L);
        System.out.println("输出结果："+ JSON.toJSONString(result));




        Map<String,Object> map = new HashMap<>();
        map.put("ID2",12232L);
        GlSjPzmb mapResult =  glSjPzmbService.selectByMap(map);
        System.out.println("输出结果："+ JSON.toJSONString(mapResult));





    }


    @Test
    public void InsertTest(){

        GlSjPzmb glSjPzmb = new GlSjPzmb();

        glSjPzmb.setID(12232L);
        glSjPzmb.setkSjpzmbid("111");
        glSjPzmb.setkSjztsjpzmbid(1212L);
        glSjPzmb.setkKjnd(2018);
        glSjPzmb.setkKjqj(12);
        glSjPzmb.setkZtdm("12121");


        glSjPzmbService.insertInto(glSjPzmb);


        glSjPzmb.setID(12231L);

        glSjPzmbService.insertInto(glSjPzmb);

    }


}
