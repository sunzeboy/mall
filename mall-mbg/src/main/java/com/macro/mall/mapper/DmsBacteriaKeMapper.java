package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaKe;
import com.macro.mall.model.DmsBacteriaKeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaKeMapper {
    long countByExample(DmsBacteriaKeExample example);

    int deleteByExample(DmsBacteriaKeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaKe record);

    int insertSelective(DmsBacteriaKe record);

    List<DmsBacteriaKe> selectByExample(DmsBacteriaKeExample example);

    DmsBacteriaKe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaKe record, @Param("example") DmsBacteriaKeExample example);

    int updateByExample(@Param("record") DmsBacteriaKe record, @Param("example") DmsBacteriaKeExample example);

    int updateByPrimaryKeySelective(DmsBacteriaKe record);

    int updateByPrimaryKey(DmsBacteriaKe record);
}