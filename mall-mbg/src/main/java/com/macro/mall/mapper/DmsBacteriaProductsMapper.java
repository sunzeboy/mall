package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaProducts;
import com.macro.mall.model.DmsBacteriaProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaProductsMapper {
    long countByExample(DmsBacteriaProductsExample example);

    int deleteByExample(DmsBacteriaProductsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaProducts record);

    int insertSelective(DmsBacteriaProducts record);

    List<DmsBacteriaProducts> selectByExample(DmsBacteriaProductsExample example);

    DmsBacteriaProducts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaProducts record, @Param("example") DmsBacteriaProductsExample example);

    int updateByExample(@Param("record") DmsBacteriaProducts record, @Param("example") DmsBacteriaProductsExample example);

    int updateByPrimaryKeySelective(DmsBacteriaProducts record);

    int updateByPrimaryKey(DmsBacteriaProducts record);
}