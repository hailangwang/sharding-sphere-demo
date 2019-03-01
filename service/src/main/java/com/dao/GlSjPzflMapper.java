package com.dao;

import com.bean.GlSjPzfl;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GlSjPzflMapper {
    int deleteByPrimaryKey(Long kZtsjpzflid);

    int insert(GlSjPzfl record);

    int insertSelective(GlSjPzfl record);

    GlSjPzfl selectByPrimaryKey(Long kZtsjpzflid);

    int updateByPrimaryKeySelective(GlSjPzfl record);

    int updateByPrimaryKey(GlSjPzfl record);

    List<GlSjPzfl> selectByMbid(Long kZtsjpzmbid);

    int deleteByMbid(Long kZtsjpzmbid);

    /**
     * 根据税金凭证模板ID，会计年度和会计期间查询税金凭证分录数据
     * @param map
     * @return
     */
    List<GlSjPzfl> selectByMbidAndKjndAndKjqj(Map<String, Object> map);


    /**
     * 根据税金凭证模板ID删除税金凭证分录数据
     * @param kZtsjpzmbid
     * 
     */
    void deleteBykZtsjpzmbid(Long kZtsjpzmbid);

    /**
     * 根据账套代码查出税金凭证模板ID列表删除税金凭证分录数据
     * @param ztdm
     *
     */
    void batchDeleteByZtdm(@Param("ztdm") String ztdm);

    /**
     * 根据税金凭证模板ID和会计年度和会计期间删除税金凭证分录数据
     * @param map
     */
    void deleteBykZtsjpzmbidAndKjndAndKjqj(Map<String, Object> map);

    void updateGLSJPZFL(GlSjPzfl bean);

    List<GlSjPzfl> selectByCondition(Map<String, Object> map);

    List<GlSjPzfl> selectPzflListByZtdmAndKjndAndKjqjAndSjpzmbid(@Param("ztdm") String ztdm, @Param("kjnd") Integer kjnd,
                                                                 @Param("kjqj") Integer kjqj, @Param("sjpzmbid") String sjpzmbid);

    String selectKmnmByZtsjpzmbidAndKjndAndKjqjAndKmfx(@Param("kjnd") Integer kjnd,
                                                       @Param("kjqj") Integer kjqj, @Param("kmfx") Integer kmfx, @Param("ztsjpzmbid") Long ztsjpzmbid);

    void updateKmnmByZtsjpzmbidAndKjndAndKjqjAndKmfx(@Param("kmnm") String kmnm, @Param("ztsjpzmbid") Long ztsjpzmbid, @Param("kjnd") Integer kjnd,
                                                     @Param("kjqj") Integer kjqj, @Param("kmfx") Integer kmfx);
}