package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaType;
import com.macro.mall.model.DmsBacteriaTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaTypeMapper {
    long countByExample(DmsBacteriaTypeExample example);

    int deleteByExample(DmsBacteriaTypeExample example);

    int deleteByPrimaryKey(Integer bacteriaType);

    int insert(DmsBacteriaType record);

    int insertSelective(DmsBacteriaType record);

    List<DmsBacteriaType> selectByExample(DmsBacteriaTypeExample example);

    DmsBacteriaType selectByPrimaryKey(Integer bacteriaType);

    int updateByExampleSelective(@Param("record") DmsBacteriaType record, @Param("example") DmsBacteriaTypeExample example);

    int updateByExample(@Param("record") DmsBacteriaType record, @Param("example") DmsBacteriaTypeExample example);

    int updateByPrimaryKeySelective(DmsBacteriaType record);

    int updateByPrimaryKey(DmsBacteriaType record);
}