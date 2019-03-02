package com.service;/**
 * Created by 168 on 2019/3/1.
 */

import com.bean.GlSjPzmb;

import java.util.List;
import java.util.Map;

/**
 * @description
 * @author: hailang
 * @create: 2019-03-01 17:55
 */

public interface GlSjPzmbService {


    public void  insertInto(GlSjPzmb glSjPzmb);

    public List<GlSjPzmb> selectBaseListByZtdmAndKjndAndKjqj(String ztdm, Integer kjnd, Integer kjqj);

    List<GlSjPzmb> selectByGlSjPzmb(GlSjPzmb glSjPzmb);

    GlSjPzmb selectByPrimaryKey(long ID1);

    GlSjPzmb selectByMap(Map<String, Object> map);
}
