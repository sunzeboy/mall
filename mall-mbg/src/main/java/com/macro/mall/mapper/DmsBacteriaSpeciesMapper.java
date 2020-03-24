package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaSpecies;
import com.macro.mall.model.DmsBacteriaSpeciesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaSpeciesMapper {
    long countByExample(DmsBacteriaSpeciesExample example);

    int deleteByExample(DmsBacteriaSpeciesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaSpecies record);

    int insertSelective(DmsBacteriaSpecies record);

    List<DmsBacteriaSpecies> selectByExample(DmsBacteriaSpeciesExample example);

    DmsBacteriaSpecies selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaSpecies record, @Param("example") DmsBacteriaSpeciesExample example);

    int updateByExample(@Param("record") DmsBacteriaSpecies record, @Param("example") DmsBacteriaSpeciesExample example);

    int updateByPrimaryKeySelective(DmsBacteriaSpecies record);

    int updateByPrimaryKey(DmsBacteriaSpecies record);
}