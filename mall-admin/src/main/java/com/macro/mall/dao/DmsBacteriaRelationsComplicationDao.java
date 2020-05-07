package com.macro.mall.dao;

import com.macro.mall.dto.DmsBacteriaRelationsComplicationDto;
import com.macro.mall.dto.DmsDiseaseComplicationDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DmsBacteriaRelationsComplicationDao {
    List<DmsBacteriaRelationsComplicationDto> findAll();
    List<DmsBacteriaRelationsComplicationDto> findAllByKeyword(@Param("keyword") String keyword);
}
