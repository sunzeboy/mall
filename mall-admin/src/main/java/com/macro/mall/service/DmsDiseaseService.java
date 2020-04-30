package com.macro.mall.service;

import com.macro.mall.dto.DmsDiseaseRelationsItem;
import com.macro.mall.model.DmsDiseaseInfo;
import com.macro.mall.model.DmsDiseaseRelationsStrain;

import java.util.List;

public interface DmsDiseaseService {
    int createDisease(DmsDiseaseInfo dmsDiseaseInfo);
    List<DmsDiseaseInfo> listAllDiseases(String keyword, Integer pageSize, Integer pageNum);
    int updateDisease(DmsDiseaseInfo dmsDiseaseInfo);
    int deleteDiseaseById(int dmsDiseaseInfoId);

    int createDiseaseRelations(DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain);
    List<DmsDiseaseRelationsItem> listAllDiseasesRelations(String keyword, Integer pageSize, Integer pageNum);
    int updateDiseaseRelations(DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain);
    int deleteDiseaseRelationsById(DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain);
}
