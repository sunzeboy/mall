package com.macro.mall.dao;

import com.macro.mall.dto.DmsExperimentalResultDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DmsExperimentalResultDao {
    List<DmsExperimentalResultDto> findAll();
    List<DmsExperimentalResultDto> findAllByKeyword(@Param("keyword") String keyword);
}
