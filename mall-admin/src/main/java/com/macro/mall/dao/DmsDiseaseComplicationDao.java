package com.macro.mall.dao;

import com.macro.mall.dto.DmsDiseaseComplicationDto;
import com.macro.mall.dto.DmsDiseaseRelationsItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DmsDiseaseComplicationDao {
    List<DmsDiseaseComplicationDto> findAll();
    List<DmsDiseaseComplicationDto> findAllByKeyword(@Param("keyword") String keyword);
}
