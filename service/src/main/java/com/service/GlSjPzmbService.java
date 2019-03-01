package com.service;/**
 * Created by 168 on 2019/3/1.
 */

import com.bean.GlSjPzmb;

import java.util.List;

/**
 * @description
 * @author: hailang
 * @create: 2019-03-01 17:55
 */

public interface GlSjPzmbService {


    public void  insertInto(GlSjPzmb glSjPzmb);

    public List<GlSjPzmb> selectBaseListByZtdmAndKjndAndKjqj(String ztdm, Integer kjnd, Integer kjqj);

}
