package com.dao;


import com.bean.GlSjPzmb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface GlSjPzmbMapper {
    int deleteByPrimaryKey(Long kZtsjpzmbid);

    int insert(GlSjPzmb record);

    int insertSelective(GlSjPzmb record);

    GlSjPzmb selectByPrimaryKey(Long ID1);

    int updateByPrimaryKeySelective(GlSjPzmb record);

    List<GlSjPzmb> selectBaseListByZtdmAndKjndAndKjqj(@Param("ztdm") String ztdm, @Param("k_kjnd") Integer kjnd, @Param("kjqj") Integer kjqj);

    List<GlSjPzmb> selectByGlSjPzmb(GlSjPzmb glSjPzmb);


    GlSjPzmb selectByMap(Map<String,Object> map);
}