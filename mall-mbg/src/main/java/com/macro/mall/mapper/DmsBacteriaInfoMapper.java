package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaInfo;
import com.macro.mall.model.DmsBacteriaInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaInfoMapper {
    long countByExample(DmsBacteriaInfoExample example);

    int deleteByExample(DmsBacteriaInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaInfo record);

    int insertSelective(DmsBacteriaInfo record);

    List<DmsBacteriaInfo> selectByExample(DmsBacteriaInfoExample example);

    DmsBacteriaInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaInfo record, @Param("example") DmsBacteriaInfoExample example);

    int updateByExample(@Param("record") DmsBacteriaInfo record, @Param("example") DmsBacteriaInfoExample example);

    int updateByPrimaryKeySelective(DmsBacteriaInfo record);

    int updateByPrimaryKey(DmsBacteriaInfo record);
}