package com.macro.mall.mapper;

import com.macro.mall.model.DmsDiseaseResult;
import com.macro.mall.model.DmsDiseaseResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsDiseaseResultMapper {
    long countByExample(DmsDiseaseResultExample example);

    int deleteByExample(DmsDiseaseResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsDiseaseResult record);

    int insertSelective(DmsDiseaseResult record);

    List<DmsDiseaseResult> selectByExample(DmsDiseaseResultExample example);

    DmsDiseaseResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsDiseaseResult record, @Param("example") DmsDiseaseResultExample example);

    int updateByExample(@Param("record") DmsDiseaseResult record, @Param("example") DmsDiseaseResultExample example);

    int updateByPrimaryKeySelective(DmsDiseaseResult record);

    int updateByPrimaryKey(DmsDiseaseResult record);
}