package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dao.DmsDiseaseRelationsDao;
import com.macro.mall.dto.DmsDiseaseRelationsItem;
import com.macro.mall.mapper.DmsDiseaseInfoMapper;
import com.macro.mall.mapper.DmsDiseaseRelationsStrainMapper;
import com.macro.mall.model.*;
import com.macro.mall.service.DmsDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author : sunze
 * create at:  2020/4/26  3:42 下午
 * @description: 疾病实现类
 */
@Service
public class DmsDiseaseServiceImpl implements DmsDiseaseService {

    @Autowired
    private DmsDiseaseInfoMapper dmsDiseaseInfoMapper;

    @Autowired
    private DmsDiseaseRelationsDao dmsDiseaseRelationsDao;

    @Autowired
    private DmsDiseaseRelationsStrainMapper dmsDiseaseRelationsStrainMapper;

    @Override
    public int createDisease(DmsDiseaseInfo dmsDiseaseInfo) {
        return dmsDiseaseInfoMapper.insert(dmsDiseaseInfo);
    }

    @Override
    public List<DmsDiseaseInfo> listAllDiseases(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DmsDiseaseInfoExample example = new DmsDiseaseInfoExample();
        DmsDiseaseInfoExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andDiseaseNameLike("%" + keyword + "%");
            example.or(example.createCriteria().andDiseaseNameZhLike("%" + keyword + "%"));
        }
        return dmsDiseaseInfoMapper.selectByExample(example);
    }

    @Override
    public int updateDisease(DmsDiseaseInfo dmsDiseaseInfo) {
        return dmsDiseaseInfoMapper.updateByPrimaryKey(dmsDiseaseInfo);
    }

    @Override
    public int deleteDiseaseById(int dmsDiseaseInfoId) {
        return dmsDiseaseInfoMapper.deleteByPrimaryKey(dmsDiseaseInfoId);
    }

    @Override
    public int createDiseaseRelations(DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain) {
        return dmsDiseaseRelationsStrainMapper.insert(dmsDiseaseRelationsStrain);
    }

    @Override
    public List<DmsDiseaseRelationsItem> listAllDiseasesRelations(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        if (!StringUtils.isEmpty(keyword)) {
            return dmsDiseaseRelationsDao.findAllByKeyword(keyword);
        }
        return dmsDiseaseRelationsDao.findAll();
    }

    @Override
    public int updateDiseaseRelations(DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain) {
        DmsDiseaseRelationsStrainExample example = new  DmsDiseaseRelationsStrainExample();
        return dmsDiseaseRelationsStrainMapper.updateByExample(dmsDiseaseRelationsStrain,example);
    }

    @Override
    public int deleteDiseaseRelationsById(DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain) {
        return dmsDiseaseRelationsStrainMapper.deleteByPrimaryKey(dmsDiseaseRelationsStrain.getStrainId(),dmsDiseaseRelationsStrain.getDiseaseId());
    }
}