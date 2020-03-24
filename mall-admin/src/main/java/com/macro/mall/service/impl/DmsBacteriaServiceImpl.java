package com.macro.mall.service.impl;

import com.macro.mall.mapper.DmsBacteriaGenusMapper;
import com.macro.mall.mapper.DmsBacteriaKeMapper;
import com.macro.mall.mapper.DmsBacteriaSpeciesMapper;
import com.macro.mall.model.*;
import com.macro.mall.service.DmsBacteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : sunze
 * create at:  2020/3/22  4:23 下午
 * @description: DmsBacteriaService的实现类
 */
@Service
public class DmsBacteriaServiceImpl implements DmsBacteriaService {
    @Autowired
    private DmsBacteriaKeMapper dmsBacteriaKeMapper;
    @Autowired
    private DmsBacteriaGenusMapper dmsBacteriaGenusMapper;
    @Autowired
    private DmsBacteriaSpeciesMapper dmsBacteriaSpeciesMapper;

    @Override
    public int createKe(DmsBacteriaKe bacteriaKe) {
        return dmsBacteriaKeMapper.insert(bacteriaKe);
    }

    @Override
    public List<DmsBacteriaKe> listAllKe() {
        return dmsBacteriaKeMapper.selectByExample(new DmsBacteriaKeExample());
    }

    @Override
    public int updateKe(DmsBacteriaKe bacteriaKe) {
        return dmsBacteriaKeMapper.updateByPrimaryKey(bacteriaKe);
    }

    @Override
    public int deleteKeById(int bacteriaKeId) {
        return dmsBacteriaKeMapper.deleteByPrimaryKey(bacteriaKeId);
    }

    @Override
    public int createGenus(DmsBacteriaGenus bacteriaGenus) {
        return dmsBacteriaGenusMapper.insert(bacteriaGenus);
    }

    @Override
    public List<DmsBacteriaGenus> listAllGenus() {
        return dmsBacteriaGenusMapper.selectByExample(new DmsBacteriaGenusExample());
    }

    @Override
    public int updateGenus(DmsBacteriaGenus bacteriaGenus) {
        return dmsBacteriaGenusMapper.updateByPrimaryKey(bacteriaGenus);
    }

    @Override
    public int deleteGenusById(int bacteriaGenusId) {
        return dmsBacteriaGenusMapper.deleteByPrimaryKey(bacteriaGenusId);
    }

    @Override
    public int createSpecies(DmsBacteriaSpecies bacteriaSpecies) {
        return dmsBacteriaSpeciesMapper.insert(bacteriaSpecies);
    }

    @Override
    public List<DmsBacteriaSpecies> listAllSpecies() {
        return dmsBacteriaSpeciesMapper.selectByExample(new DmsBacteriaSpeciesExample());
    }

    @Override
    public int updateSpecies(DmsBacteriaSpecies bacteriaSpecies) {
        return dmsBacteriaGenusMapper.updateByPrimaryKey(bacteriaSpecies);
    }

    @Override
    public int deleteSpeciesById(int bacteriaSpeciesId) {
        return dmsBacteriaGenusMapper.deleteByPrimaryKey(bacteriaSpeciesId);
    }


}