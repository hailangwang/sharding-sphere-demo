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

    GlSjPzmb selectByPrimaryKey(Long kZtsjpzmbid);

    int updateByPrimaryKeySelective(GlSjPzmb record);

    int updateByPrimaryKeyWithBLOBs(GlSjPzmb record);

    int updateByPrimaryKey(GlSjPzmb record);

    GlSjPzmb querySjmb(Map<String, Object> condition);

    /**
     * 查询所有的额税金凭证模板数据
     * @return
     *
     */
    List<GlSjPzmb> queryAllSjjtpzMbDataList();

    /**
     * 根据账套代码查询税金凭证模板数据
     * @param ztdm  账套代码
     * @return
     */
    List<GlSjPzmb> queryMjSjjtPzMb(String ztdm);

    /**
     * 根据账套代码，会计年度和会计期间查询税金凭证模板数据
     * @param params
     * @return
     */
    List<GlSjPzmb> queryMjSjjtPzMbByZtdmAndKjndAndKjqj(Map<String, Object> params);

    /**
     * 根据上级凭证模板ID查询税金凭证模板信息
     * @param map
     * @return
     */
    GlSjPzmb selectBySjpzmbid(Map<String, Object> map);

    /**
     * 根据上级凭证模板ID和会计年度，账套代码和会计期价查询税金凭证模板信息
     * @param map
     * @return
     */
    GlSjPzmb selectBySjpzmbidAndKjndAndKjqj(Map<String, Object> map);

    List<GlSjPzmb> queryMjSjMbNoSysByZtdm(Map<String, Object> condition);

    List<GlSjPzmb> queryMjSjMbNoSysByZtdmAndKjndAndKjqj(Map<String, Object> condition);

    List<GlSjPzmb> selectListBySjpzmbid(Map<String, Object> condition);

    /**
     * 根据税金凭证模板Id，会计年度和会计期间查询税金凭证模板数据
     * @param condition
     * @return
     *
     */
    List<GlSjPzmb> selectListBySjpzmbidAndKjndAndKjqj(Map<String, Object> condition);

    /**
     * 根据账套代码删除税金凭证模板数据
     * @param ztdm 账套代码
     * @return
     */
    int deleteSjpzmbByZtdm(String ztdm);

    List<GlSjPzmb> queryByZtdm(String ztdm);

    List<GlSjPzmb> selectSjpzmbDataByCondition(Map<String, Object> params);

    int updatePzmbGs(Map<String, Object> condition);

    List<GlSjPzmb> selectBaseListByZtdmAndKjndAndKjqj(@Param("ztdm") String ztdm, @Param("kjnd") Integer kjnd, @Param("kjqj") Integer kjqj);
}