package com.macro.mall.service;

import com.macro.mall.dto.DmsExperimentalResultDto;
import com.macro.mall.model.DmsDiseaseInfo;
import com.macro.mall.model.DmsExperimentalResource;
import com.macro.mall.model.DmsExperimentalResult;

import java.util.List;

public interface DmsExperimentalResourceService {
    int createExperimentalResource(DmsExperimentalResource dmsExperimentalResource);
    List<DmsExperimentalResource> listAllExperimentalResource(String keyword, Integer pageSize, Integer pageNum);
    int updateExperimentalResource(DmsExperimentalResource dmsExperimentalResource);
    int deleteExperimentalResourceById(int dmsExperimentalResourceId);

    int createExperimentalResult(DmsExperimentalResult dmsExperimentalResult);
    List<DmsExperimentalResultDto> listAllExperimentalResults(String keyword, Integer pageSize, Integer pageNum);
    int updateExperimentalResult(DmsExperimentalResult dmsExperimentalResult);
    int deleteExperimentalResultById(int dmsExperimentalResultId);
}
