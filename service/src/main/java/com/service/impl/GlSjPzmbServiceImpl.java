package com.service.impl;/**
 * Created by 168 on 2019/3/1.
 */

import com.bean.GlSjPzmb;
import com.dao.GlSjPzmbMapper;
import com.service.GlSjPzmbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<GlSjPzmb> selectByGlSjPzmb(GlSjPzmb glSjPzmb) {
        return  glSjPzmbMapper.selectByGlSjPzmb(glSjPzmb);
    }

    @Override
    public GlSjPzmb selectByPrimaryKey(long ID1) {
        return glSjPzmbMapper.selectByPrimaryKey(ID1);
    }

    @Override
    public GlSjPzmb selectByMap(Map<String, Object> map) {
        return glSjPzmbMapper.selectByMap(map);
    }
}
