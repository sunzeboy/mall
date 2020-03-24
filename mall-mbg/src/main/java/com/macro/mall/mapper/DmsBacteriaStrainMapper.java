package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaStrain;
import com.macro.mall.model.DmsBacteriaStrainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaStrainMapper {
    long countByExample(DmsBacteriaStrainExample example);

    int deleteByExample(DmsBacteriaStrainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaStrain record);

    int insertSelective(DmsBacteriaStrain record);

    List<DmsBacteriaStrain> selectByExample(DmsBacteriaStrainExample example);

    DmsBacteriaStrain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaStrain record, @Param("example") DmsBacteriaStrainExample example);

    int updateByExample(@Param("record") DmsBacteriaStrain record, @Param("example") DmsBacteriaStrainExample example);

    int updateByPrimaryKeySelective(DmsBacteriaStrain record);

    int updateByPrimaryKey(DmsBacteriaStrain record);
}