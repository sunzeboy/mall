package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaLiterature;
import com.macro.mall.model.DmsBacteriaLiteratureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaLiteratureMapper {
    long countByExample(DmsBacteriaLiteratureExample example);

    int deleteByExample(DmsBacteriaLiteratureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaLiterature record);

    int insertSelective(DmsBacteriaLiterature record);

    List<DmsBacteriaLiterature> selectByExample(DmsBacteriaLiteratureExample example);

    DmsBacteriaLiterature selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaLiterature record, @Param("example") DmsBacteriaLiteratureExample example);

    int updateByExample(@Param("record") DmsBacteriaLiterature record, @Param("example") DmsBacteriaLiteratureExample example);

    int updateByPrimaryKeySelective(DmsBacteriaLiterature record);

    int updateByPrimaryKey(DmsBacteriaLiterature record);
}