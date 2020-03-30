package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.DmsBacteriaGenusMapper;
import com.macro.mall.mapper.DmsBacteriaKeMapper;
import com.macro.mall.mapper.DmsBacteriaSpeciesMapper;
import com.macro.mall.mapper.DmsBacteriaStrainMapper;
import com.macro.mall.model.*;
import com.macro.mall.service.DmsBacteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    @Autowired
    private DmsBacteriaStrainMapper dmsBacteriaStrainMapper;

    @Override
    public int createKe(DmsBacteriaKe bacteriaKe) {
        return dmsBacteriaKeMapper.insert(bacteriaKe);
    }

    @Override
    public List<DmsBacteriaKe> listAllKe(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DmsBacteriaKeExample example = new DmsBacteriaKeExample();
        DmsBacteriaKeExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andKeNameLike("%" + keyword + "%");
            example.or(example.createCriteria().andKeNameZhLike("%" + keyword + "%"));
        }
        return dmsBacteriaKeMapper.selectByExample(example);
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
    public List<DmsBacteriaGenus> listAllGenus(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DmsBacteriaGenusExample example = new DmsBacteriaGenusExample();
        DmsBacteriaGenusExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andGenusNameLike("%" + keyword + "%");
            example.or(example.createCriteria().andGenusNameZhLike("%" + keyword + "%"));
        }
        return dmsBacteriaGenusMapper.selectByExample(example);
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
    public List<DmsBacteriaSpecies> listAllSpecies(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DmsBacteriaSpeciesExample example = new DmsBacteriaSpeciesExample();
        DmsBacteriaSpeciesExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSpeciesNameLike("%" + keyword + "%");
            example.or(example.createCriteria().andSpeciesNameZhLike("%" + keyword + "%"));
        }
        return dmsBacteriaSpeciesMapper.selectByExample(example);
    }

    @Override
    public int updateSpecies(DmsBacteriaSpecies bacteriaSpecies) {
        return dmsBacteriaSpeciesMapper.updateByPrimaryKey(bacteriaSpecies);
    }

    @Override
    public int deleteSpeciesById(int bacteriaSpeciesId) {
        return dmsBacteriaSpeciesMapper.deleteByPrimaryKey(bacteriaSpeciesId);
    }

    @Override
    public int createStrain(DmsBacteriaStrain bacteriaStrain) {
        return dmsBacteriaStrainMapper.insert(bacteriaStrain);
    }

    @Override
    public List<DmsBacteriaStrain> listAllStrain(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DmsBacteriaStrainExample example = new DmsBacteriaStrainExample();
        DmsBacteriaStrainExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andStrainInternationalNoLike("%" + keyword + "%");
            example.or(example.createCriteria().andStrainInsideNoLike("%" + keyword + "%"));
        }
        return dmsBacteriaStrainMapper.selectByExample(example);
    }


    @Override
    public int updateStrain(DmsBacteriaStrain bacteriaStrain) {
        return dmsBacteriaStrainMapper.updateByPrimaryKey(bacteriaStrain);
    }

    @Override
    public int deleteStrainById(int bacteriaStrainId) {
        return dmsBacteriaStrainMapper.deleteByPrimaryKey(bacteriaStrainId);
    }


}