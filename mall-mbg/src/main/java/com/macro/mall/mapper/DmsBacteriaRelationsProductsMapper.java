package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaRelationsProducts;
import com.macro.mall.model.DmsBacteriaRelationsProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaRelationsProductsMapper {
    long countByExample(DmsBacteriaRelationsProductsExample example);

    int deleteByExample(DmsBacteriaRelationsProductsExample example);

    int deleteByPrimaryKey(@Param("productsId") Integer productsId, @Param("bacteriaId") Integer bacteriaId);

    int insert(DmsBacteriaRelationsProducts record);

    int insertSelective(DmsBacteriaRelationsProducts record);

    List<DmsBacteriaRelationsProducts> selectByExample(DmsBacteriaRelationsProductsExample example);

    int updateByExampleSelective(@Param("record") DmsBacteriaRelationsProducts record, @Param("example") DmsBacteriaRelationsProductsExample example);

    int updateByExample(@Param("record") DmsBacteriaRelationsProducts record, @Param("example") DmsBacteriaRelationsProductsExample example);
}