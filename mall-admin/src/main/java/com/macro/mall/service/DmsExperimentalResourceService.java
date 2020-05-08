package com.macro.mall.service;

import com.macro.mall.model.DmsDiseaseInfo;
import com.macro.mall.model.DmsExperimentalResource;

import java.util.List;

public interface DmsExperimentalResourceService {
    int createExperimentalResource(DmsExperimentalResource dmsExperimentalResource);
    List<DmsExperimentalResource> listAllExperimentalResource(String keyword, Integer pageSize, Integer pageNum);
    int updateExperimentalResource(DmsExperimentalResource dmsExperimentalResource);
    int deleteExperimentalResourceById(int dmsExperimentalResourceId);
}
