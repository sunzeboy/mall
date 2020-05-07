package com.macro.mall.service;

import com.macro.mall.dto.DmsBacteriaRelationsComplicationDto;
import com.macro.mall.model.*;

import java.util.List;

public interface DmsBacteriaService {

    int createKe(DmsBacteriaKe bacteriaKe);
    List<DmsBacteriaKe> listAllKe(String keyword, Integer pageSize, Integer pageNum);
    int updateKe(DmsBacteriaKe bacteriaKe);
    int deleteKeById(int bacteriaKeId);


    int createGenus(DmsBacteriaGenus bacteriaGenus);
    List<DmsBacteriaGenus> listAllGenus(String keyword, Integer pageSize, Integer pageNum);
    int updateGenus(DmsBacteriaGenus bacteriaGenus);
    int deleteGenusById(int bacteriaGenusId);


    int createSpecies(DmsBacteriaSpecies bacteriaSpecies);
    List<DmsBacteriaSpecies> listAllSpecies(String keyword, Integer pageSize, Integer pageNum);
    int updateSpecies(DmsBacteriaSpecies bacteriaSpecies);
    int deleteSpeciesById(int bacteriaSpeciesId);

    int createStrain(DmsBacteriaStrain bacteriaStrain);
    List<DmsBacteriaStrain> listAllStrain(String keyword, Integer pageSize, Integer pageNum);
    int updateStrain(DmsBacteriaStrain bacteriaStrain);
    int deleteStrainById(int bacteriaStrainId);

    int createBacteria(DmsBacteriaInfo bacteriaInfo);
    List<DmsBacteriaInfo> listAllBacterias(String keyword, Integer pageSize, Integer pageNum, Integer bacteriaType);
    int updateBacteria(DmsBacteriaInfo bacteriaInfo);
    int deleteBacteriaById(int bacteriaInfoId);

    int createBacteriaRelationsComplication(DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication);
    List<DmsBacteriaRelationsComplicationDto> listAllBacteriaRelationsComplications(String keyword, Integer pageSize, Integer pageNum);
    int updateBacteriaRelationsComplication(DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication);
    int deleteBacteriaRelationsComplication(DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication);
}
