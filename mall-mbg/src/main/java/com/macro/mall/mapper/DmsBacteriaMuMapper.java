package com.macro.mall.mapper;

import com.macro.mall.model.DmsBacteriaMu;
import com.macro.mall.model.DmsBacteriaMuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBacteriaMuMapper {
    long countByExample(DmsBacteriaMuExample example);

    int deleteByExample(DmsBacteriaMuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsBacteriaMu record);

    int insertSelective(DmsBacteriaMu record);

    List<DmsBacteriaMu> selectByExample(DmsBacteriaMuExample example);

    DmsBacteriaMu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsBacteriaMu record, @Param("example") DmsBacteriaMuExample example);

    int updateByExample(@Param("record") DmsBacteriaMu record, @Param("example") DmsBacteriaMuExample example);

    int updateByPrimaryKeySelective(DmsBacteriaMu record);

    int updateByPrimaryKey(DmsBacteriaMu record);
}