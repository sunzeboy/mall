package com.macro.mall.mapper;

import com.macro.mall.model.DmsDiseaseInfo;
import com.macro.mall.model.DmsDiseaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsDiseaseInfoMapper {
    long countByExample(DmsDiseaseInfoExample example);

    int deleteByExample(DmsDiseaseInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsDiseaseInfo record);

    int insertSelective(DmsDiseaseInfo record);

    List<DmsDiseaseInfo> selectByExample(DmsDiseaseInfoExample example);

    DmsDiseaseInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsDiseaseInfo record, @Param("example") DmsDiseaseInfoExample example);

    int updateByExample(@Param("record") DmsDiseaseInfo record, @Param("example") DmsDiseaseInfoExample example);

    int updateByPrimaryKeySelective(DmsDiseaseInfo record);

    int updateByPrimaryKey(DmsDiseaseInfo record);
}