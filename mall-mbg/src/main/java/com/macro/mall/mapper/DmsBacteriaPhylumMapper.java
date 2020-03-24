package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaPhylum;
import com.macro.mall.model.DmsBacteriaPhylumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaPhylumMapper {
    long countByExample(DmsBacteriaPhylumExample example);

    int deleteByExample(DmsBacteriaPhylumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaPhylum record);

    int insertSelective(DmsBacteriaPhylum record);

    List<DmsBacteriaPhylum> selectByExample(DmsBacteriaPhylumExample example);

    DmsBacteriaPhylum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaPhylum record, @Param("example") DmsBacteriaPhylumExample example);

    int updateByExample(@Param("record") DmsBacteriaPhylum record, @Param("example") DmsBacteriaPhylumExample example);

    int updateByPrimaryKeySelective(DmsBacteriaPhylum record);

    int updateByPrimaryKey(DmsBacteriaPhylum record);
}