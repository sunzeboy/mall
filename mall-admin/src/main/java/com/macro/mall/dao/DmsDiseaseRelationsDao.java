package com.macro.mall.dao;

import com.macro.mall.dto.DmsDiseaseRelationsItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DmsDiseaseRelationsDao {
    List<DmsDiseaseRelationsItem> findAll();
    List<DmsDiseaseRelationsItem> findAllByKeyword(@Param("keyword") String keyword);
}
