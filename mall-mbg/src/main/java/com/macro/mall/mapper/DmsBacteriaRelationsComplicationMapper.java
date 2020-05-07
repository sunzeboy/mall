package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaRelationsComplication;
import com.macro.mall.model.DmsBacteriaRelationsComplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaRelationsComplicationMapper {
    long countByExample(DmsBacteriaRelationsComplicationExample example);

    int deleteByExample(DmsBacteriaRelationsComplicationExample example);

    int deleteByPrimaryKey(@Param("bacteriaId") Integer bacteriaId, @Param("complicationId") Integer complicationId);

    int insert(DmsBacteriaRelationsComplication record);

    int insertSelective(DmsBacteriaRelationsComplication record);

    List<DmsBacteriaRelationsComplication> selectByExample(DmsBacteriaRelationsComplicationExample example);

    int updateByExampleSelective(@Param("record") DmsBacteriaRelationsComplication record, @Param("example") DmsBacteriaRelationsComplicationExample example);

    int updateByExample(@Param("record") DmsBacteriaRelationsComplication record, @Param("example") DmsBacteriaRelationsComplicationExample example);
}