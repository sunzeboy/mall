package com.macro.mall.dao;

import com.macro.mall.dto.DmsProductsRelationsItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DmsProductsRelationsDao {
    List<DmsProductsRelationsItem> findAll();
    List<DmsProductsRelationsItem> findAllByKeyword(@Param("keyword") String keyword);
}
