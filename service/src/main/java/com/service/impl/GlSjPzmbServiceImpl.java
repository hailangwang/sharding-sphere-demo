package com.service.impl;/**
 * Created by 168 on 2019/3/1.
 */

import com.bean.GlSjPzmb;
import com.dao.GlSjPzmbMapper;
import com.service.GlSjPzmbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author: hailang
 * @create: 2019-03-01 17:55
 */
@Service
public class  GlSjPzmbServiceImpl implements GlSjPzmbService {



    @Autowired
    private GlSjPzmbMapper glSjPzmbMapper;

    @Override
    public void insertInto(GlSjPzmb glSjPzmb) {

        glSjPzmbMapper.insertSelective(glSjPzmb);

    }

    @Override
    public List<GlSjPzmb> selectBaseListByZtdmAndKjndAndKjqj(String ztdm, Integer kjnd, Integer kjqj) {


        return  glSjPzmbMapper.selectBaseListByZtdmAndKjndAndKjqj(ztdm,kjnd,kjqj);

    }
}
