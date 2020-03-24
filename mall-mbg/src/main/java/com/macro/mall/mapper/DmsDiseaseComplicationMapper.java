package com.macro.mall.mapper;

import com.macro.mall.model.DmsDiseaseComplication;
import com.macro.mall.model.DmsDiseaseComplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsDiseaseComplicationMapper {
    long countByExample(DmsDiseaseComplicationExample example);

    int deleteByExample(DmsDiseaseComplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsDiseaseComplication record);

    int insertSelective(DmsDiseaseComplication record);

    List<DmsDiseaseComplication> selectByExample(DmsDiseaseComplicationExample example);

    DmsDiseaseComplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsDiseaseComplication record, @Param("example") DmsDiseaseComplicationExample example);

    int updateByExample(@Param("record") DmsDiseaseComplication record, @Param("example") DmsDiseaseComplicationExample example);

    int updateByPrimaryKeySelective(DmsDiseaseComplication record);

    int updateByPrimaryKey(DmsDiseaseComplication record);
}