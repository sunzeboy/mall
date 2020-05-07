package com.macro.mall.mapper;

import com.macro.mall.model.DmsDiseaseRelationsBacteria;
import com.macro.mall.model.DmsDiseaseRelationsBacteriaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsDiseaseRelationsBacteriaMapper {
    long countByExample(DmsDiseaseRelationsBacteriaExample example);

    int deleteByExample(DmsDiseaseRelationsBacteriaExample example);

    int deleteByPrimaryKey(@Param("bacteriaId") Integer bacteriaId, @Param("diseaseId") Integer diseaseId);

    int insert(DmsDiseaseRelationsBacteria record);

    int insertSelective(DmsDiseaseRelationsBacteria record);

    List<DmsDiseaseRelationsBacteria> selectByExample(DmsDiseaseRelationsBacteriaExample example);

    int updateByExampleSelective(@Param("record") DmsDiseaseRelationsBacteria record, @Param("example") DmsDiseaseRelationsBacteriaExample example);

    int updateByExample(@Param("record") DmsDiseaseRelationsBacteria record, @Param("example") DmsDiseaseRelationsBacteriaExample example);
}