package com.macro.mall.service;

import com.macro.mall.dto.DmsDiseaseComplicationDto;
import com.macro.mall.dto.DmsDiseaseRelationsItem;
import com.macro.mall.model.*;

import java.util.List;

public interface DmsDiseaseService {
    int createDisease(DmsDiseaseInfo dmsDiseaseInfo);
    List<DmsDiseaseInfo> listAllDiseases(String keyword, Integer pageSize, Integer pageNum);
    int updateDisease(DmsDiseaseInfo dmsDiseaseInfo);
    int deleteDiseaseById(int dmsDiseaseInfoId);

    int createDiseaseRelations(DmsDiseaseRelationsBacteria dmsDiseaseRelationsBacteria);
    List<DmsDiseaseRelationsItem> listAllDiseasesRelations(String keyword, Integer pageSize, Integer pageNum);
    int updateDiseaseRelations(DmsDiseaseRelationsBacteria dmsDiseaseRelationsBacteria);
    int deleteDiseaseRelationsById(DmsDiseaseRelationsBacteria dmsDiseaseRelationsBacteria);

    int createComplication(DmsDiseaseComplication dmsDiseaseComplication);
    List<DmsDiseaseComplicationDto> listAllComplications(String keyword, Integer pageSize, Integer pageNum);
    int updateComplication(DmsDiseaseComplication dmsDiseaseComplication);
    int deleteComplicationById(int dmsDiseaseComplicationId);
    List<DmsComplicationType> listAllComplicationTypes();

}
