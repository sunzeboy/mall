package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaGenus;
import com.macro.mall.model.DmsBacteriaGenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaGenusMapper {
    long countByExample(DmsBacteriaGenusExample example);

    int deleteByExample(DmsBacteriaGenusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaGenus record);

    int insertSelective(DmsBacteriaGenus record);

    List<DmsBacteriaGenus> selectByExample(DmsBacteriaGenusExample example);

    DmsBacteriaGenus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaGenus record, @Param("example") DmsBacteriaGenusExample example);

    int updateByExample(@Param("record") DmsBacteriaGenus record, @Param("example") DmsBacteriaGenusExample example);

    int updateByPrimaryKeySelective(DmsBacteriaGenus record);

    int updateByPrimaryKey(DmsBacteriaGenus record);
}