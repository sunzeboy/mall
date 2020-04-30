package com.macro.mall.mapper;

import com.macro.mall.model.DmsDiseaseRelationsStrain;
import com.macro.mall.model.DmsDiseaseRelationsStrainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsDiseaseRelationsStrainMapper {
    long countByExample(DmsDiseaseRelationsStrainExample example);

    int deleteByExample(DmsDiseaseRelationsStrainExample example);

    int deleteByPrimaryKey(@Param("strainId") Integer strainId, @Param("diseaseId") Integer diseaseId);

    int insert(DmsDiseaseRelationsStrain record);

    int insertSelective(DmsDiseaseRelationsStrain record);

    List<DmsDiseaseRelationsStrain> selectByExample(DmsDiseaseRelationsStrainExample example);

    int updateByExampleSelective(@Param("record") DmsDiseaseRelationsStrain record, @Param("example") DmsDiseaseRelationsStrainExample example);

    int updateByExample(@Param("record") DmsDiseaseRelationsStrain record, @Param("example") DmsDiseaseRelationsStrainExample example);
}