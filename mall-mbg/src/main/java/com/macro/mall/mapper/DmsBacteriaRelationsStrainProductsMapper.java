package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaRelationsStrainProducts;
import com.macro.mall.model.DmsBacteriaRelationsStrainProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaRelationsStrainProductsMapper {
    long countByExample(DmsBacteriaRelationsStrainProductsExample example);

    int deleteByExample(DmsBacteriaRelationsStrainProductsExample example);

    int deleteByPrimaryKey(@Param("bacteriaId") Integer bacteriaId, @Param("productsId") Integer productsId);

    int insert(DmsBacteriaRelationsStrainProducts record);

    int insertSelective(DmsBacteriaRelationsStrainProducts record);

    List<DmsBacteriaRelationsStrainProducts> selectByExample(DmsBacteriaRelationsStrainProductsExample example);

    int updateByExampleSelective(@Param("record") DmsBacteriaRelationsStrainProducts record, @Param("example") DmsBacteriaRelationsStrainProductsExample example);

    int updateByExample(@Param("record") DmsBacteriaRelationsStrainProducts record, @Param("example") DmsBacteriaRelationsStrainProductsExample example);
}