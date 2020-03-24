package com.macro.mall.mapper;

import com.macro.mall.model.DmsExperimentalResult;
import com.macro.mall.model.DmsExperimentalResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsExperimentalResultMapper {
    long countByExample(DmsExperimentalResultExample example);

    int deleteByExample(DmsExperimentalResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsExperimentalResult record);

    int insertSelective(DmsExperimentalResult record);

    List<DmsExperimentalResult> selectByExample(DmsExperimentalResultExample example);

    DmsExperimentalResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsExperimentalResult record, @Param("example") DmsExperimentalResultExample example);

    int updateByExample(@Param("record") DmsExperimentalResult record, @Param("example") DmsExperimentalResultExample example);

    int updateByPrimaryKeySelective(DmsExperimentalResult record);

    int updateByPrimaryKey(DmsExperimentalResult record);
}