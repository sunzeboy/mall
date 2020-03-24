package com.macro.mall.mapper;

import com.macro.mall.model.DmsExperimentalResource;
import com.macro.mall.model.DmsExperimentalResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsExperimentalResourceMapper {
    long countByExample(DmsExperimentalResourceExample example);

    int deleteByExample(DmsExperimentalResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsExperimentalResource record);

    int insertSelective(DmsExperimentalResource record);

    List<DmsExperimentalResource> selectByExample(DmsExperimentalResourceExample example);

    DmsExperimentalResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsExperimentalResource record, @Param("example") DmsExperimentalResourceExample example);

    int updateByExample(@Param("record") DmsExperimentalResource record, @Param("example") DmsExperimentalResourceExample example);

    int updateByPrimaryKeySelective(DmsExperimentalResource record);

    int updateByPrimaryKey(DmsExperimentalResource record);
}