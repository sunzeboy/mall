package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaClass;
import com.macro.mall.model.DmsBacteriaClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaClassMapper {
    long countByExample(DmsBacteriaClassExample example);

    int deleteByExample(DmsBacteriaClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaClass record);

    int insertSelective(DmsBacteriaClass record);

    List<DmsBacteriaClass> selectByExample(DmsBacteriaClassExample example);

    DmsBacteriaClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaClass record, @Param("example") DmsBacteriaClassExample example);

    int updateByExample(@Param("record") DmsBacteriaClass record, @Param("example") DmsBacteriaClassExample example);

    int updateByPrimaryKeySelective(DmsBacteriaClass record);

    int updateByPrimaryKey(DmsBacteriaClass record);
}