package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaProductsRelation;
import com.macro.mall.model.DmsBacteriaProductsRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaProductsRelationMapper {
    long countByExample(DmsBacteriaProductsRelationExample example);

    int deleteByExample(DmsBacteriaProductsRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaProductsRelation record);

    int insertSelective(DmsBacteriaProductsRelation record);

    List<DmsBacteriaProductsRelation> selectByExample(DmsBacteriaProductsRelationExample example);

    DmsBacteriaProductsRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaProductsRelation record, @Param("example") DmsBacteriaProductsRelationExample example);

    int updateByExample(@Param("record") DmsBacteriaProductsRelation record, @Param("example") DmsBacteriaProductsRelationExample example);

    int updateByPrimaryKeySelective(DmsBacteriaProductsRelation record);

    int updateByPrimaryKey(DmsBacteriaProductsRelation record);
}