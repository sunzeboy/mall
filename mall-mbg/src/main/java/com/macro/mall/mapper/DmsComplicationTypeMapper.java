package com.macro.mall.mapper;

import com.macro.mall.model.DmsComplicationType;
import com.macro.mall.model.DmsComplicationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsComplicationTypeMapper {
    long countByExample(DmsComplicationTypeExample example);

    int deleteByExample(DmsComplicationTypeExample example);

    int insert(DmsComplicationType record);

    int insertSelective(DmsComplicationType record);

    List<DmsComplicationType> selectByExample(DmsComplicationTypeExample example);

    int updateByExampleSelective(@Param("record") DmsComplicationType record, @Param("example") DmsComplicationTypeExample example);

    int updateByExample(@Param("record") DmsComplicationType record, @Param("example") DmsComplicationTypeExample example);
}