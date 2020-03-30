package com.macro.mall.service;

import com.macro.mall.model.DmsBacteriaGenus;
import com.macro.mall.model.DmsBacteriaKe;
import com.macro.mall.model.DmsBacteriaSpecies;
import com.macro.mall.model.DmsBacteriaStrain;

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
}
