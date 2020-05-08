package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dao.DmsBacteriaRelationsComplicationDao;
import com.macro.mall.dto.DmsBacteriaRelationsComplicationDto;
import com.macro.mall.mapper.*;
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

    @Autowired
    private DmsBacteriaInfoMapper dmsBacteriaInfoMapper;

    @Autowired
    private DmsBacteriaRelationsComplicationMapper dmsBacteriaRelationsComplicationMapper;

    @Autowired
    private DmsBacteriaRelationsComplicationDao dmsBacteriaRelationsComplicationDao;

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

    @Override
    public int createBacteria(DmsBacteriaInfo bacteriaInfo) {
        return dmsBacteriaInfoMapper.insert(bacteriaInfo);
    }

    @Override
    public List<DmsBacteriaInfo> listAllBacterias(String keyword, Integer pageSize, Integer pageNum, Integer bacteriaType) {
        PageHelper.startPage(pageNum, pageSize);
        DmsBacteriaInfoExample example = new DmsBacteriaInfoExample();
        DmsBacteriaInfoExample.Criteria criteria = example.createCriteria();
        if (bacteriaType != null){
            criteria.andBacteriaTypeEqualTo(bacteriaType);
        }
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andBacteriaNameZhLike("%" + keyword + "%");
            example.or(example.createCriteria().andBacteriaNameLike("%" + keyword + "%"));
        }
        example.setOrderByClause("bacteria_type ASC");
        return dmsBacteriaInfoMapper.selectByExample(example);
    }

    @Override
    public int updateBacteria(DmsBacteriaInfo bacteriaInfo) {
        return dmsBacteriaInfoMapper.updateByPrimaryKey(bacteriaInfo);
    }

    @Override
    public int deleteBacteriaById(int bacteriaInfoId) {
        return dmsBacteriaInfoMapper.deleteByPrimaryKey(bacteriaInfoId);
    }

    @Override
    public int createBacteriaRelationsComplication(DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication) {
        return dmsBacteriaRelationsComplicationMapper.insert(dmsBacteriaRelationsComplication);
    }

    @Override
    public List<DmsBacteriaRelationsComplicationDto> listAllBacteriaRelationsComplications(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        if (!StringUtils.isEmpty(keyword)) {
            return dmsBacteriaRelationsComplicationDao.findAllByKeyword(keyword);
        }
        return dmsBacteriaRelationsComplicationDao.findAll();
    }

    @Override
    public int updateBacteriaRelationsComplication(DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication) {
        DmsBacteriaRelationsComplicationExample example = new  DmsBacteriaRelationsComplicationExample();
        return dmsBacteriaRelationsComplicationMapper.updateByExample(dmsBacteriaRelationsComplication,example);
    }

    @Override
    public int deleteBacteriaRelationsComplication(DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication) {
        return dmsBacteriaRelationsComplicationMapper.deleteByPrimaryKey(dmsBacteriaRelationsComplication.getBacteriaId(),dmsBacteriaRelationsComplication.getComplicationId());
    }


}