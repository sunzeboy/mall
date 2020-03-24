package com.macro.mall.service;

import com.macro.mall.model.DmsBacteriaGenus;
import com.macro.mall.model.DmsBacteriaKe;
import com.macro.mall.model.DmsBacteriaSpecies;

import java.util.List;

public interface DmsBacteriaService {
    /**
     * @name: createKe
     * @description: TODO xx
     * @param bacteriaKe xx
     * @return: int xx
     * @date: 2020/3/22 4:22 下午
     * @auther: sunze
     *
    */
    int createKe(DmsBacteriaKe bacteriaKe);

    /**
     * @name: listAllKe
     * @description: TODO
     * @return: java.util.List<com.macro.mall.model.DmsBacteriaKe>
     * @date: 2020/3/22 5:16 下午
     * @auther: sunze
     *
    */
    List<DmsBacteriaKe> listAllKe();
    /** 
     * @name: updateKe
     * @description: TODO  
     * @param bacteriaKe
     * @return: int
     * @date: 2020/3/22 8:35 下午
     * @auther: sunze
     * 
    */
    int updateKe(DmsBacteriaKe bacteriaKe);
    
    /** 
     * @name: deleteKe
     * @description: TODO  
 * @param bacteriaKeId
     * @return: int
     * @date: 2020/3/22 8:40 下午
     * @auther: sunze
     * 
    */
    int deleteKeById(int bacteriaKeId);

    /**
     * @name: createGenus
     * @description: TODO
     * @param bacteriaGenus
     * @return: int
     * @date: 2020/3/22 4:22 下午
     * @auther: sunze
     *
     */
    int createGenus(DmsBacteriaGenus bacteriaGenus);

    /**
     * @name: listAllGenus
     * @description: TODO
     * @return: java.util.List<com.macro.mall.model.DmsBacteriaKe>
     * @date: 2020/3/22 5:16 下午
     * @auther: sunze
     *
     */
    List<DmsBacteriaGenus> listAllGenus();
    /**
     * @name: updateGenus
     * @description: TODO
     * @param bacteriaGenus
     * @return: int
     * @date: 2020/3/22 8:35 下午
     * @auther: sunze
     *
     */
    int updateGenus(DmsBacteriaGenus bacteriaGenus);

    /**
     * @name: deleteGenus
     * @description: TODO
     * @param bacteriaGenus
     * @return: int
     * @date: 2020/3/22 8:40 下午
     * @auther: sunze
     *
     */
    int deleteGenusById(int bacteriaGenusId);

    /**
     * @name: createSpecies
     * @description: TODO
     * @param bacteriaSpecies
     * @return: int
     * @date: 2020/3/22 4:22 下午
     * @auther: sunze
     *
     */
    int createSpecies(DmsBacteriaSpecies bacteriaSpecies);

    /**
     * @name: listAllSpecies
     * @description: TODO
     * @return: java.util.List<com.macro.mall.model.DmsBacteriaSpecies>
     * @date: 2020/3/22 5:16 下午
     * @auther: sunze
     *
     */
    List<DmsBacteriaSpecies> listAllSpecies();
    /**
     * @name: updateSpecies
     * @description: TODO
     * @param bacteriaSpecies
     * @return: int
     * @date: 2020/3/22 8:35 下午
     * @auther: sunze
     *
     */
    int updateSpecies(DmsBacteriaSpecies bacteriaSpecies);

    /**
     * @name: deleteGenus
     * @description: TODO
     * @param bacteriaSpeciesId
     * @return: int
     * @date: 2020/3/22 8:40 下午
     * @auther: sunze
     *
     */
    int deleteSpeciesById(int bacteriaSpeciesId);
}
