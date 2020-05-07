package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dao.DmsDiseaseComplicationDao;
import com.macro.mall.dao.DmsDiseaseRelationsDao;
import com.macro.mall.dto.DmsDiseaseComplicationDto;
import com.macro.mall.dto.DmsDiseaseRelationsItem;
import com.macro.mall.mapper.DmsComplicationTypeMapper;
import com.macro.mall.mapper.DmsDiseaseComplicationMapper;
import com.macro.mall.mapper.DmsDiseaseInfoMapper;
import com.macro.mall.mapper.DmsDiseaseRelationsBacteriaMapper;
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
    private DmsDiseaseRelationsBacteriaMapper dmsDiseaseRelationsBacteriaMapper;

    @Autowired
    private DmsDiseaseComplicationMapper dmsDiseaseComplicationMapper;

    @Autowired
    private DmsComplicationTypeMapper dmsComplicationTypeMapper;

    @Autowired
    private DmsDiseaseComplicationDao dmsDiseaseComplicationDao;

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
    public int createDiseaseRelations(DmsDiseaseRelationsBacteria dmsDiseaseRelationsBacteria) {
        return dmsDiseaseRelationsBacteriaMapper.insert(dmsDiseaseRelationsBacteria);
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
    public int updateDiseaseRelations(DmsDiseaseRelationsBacteria dmsDiseaseRelationsBacteria) {
        DmsDiseaseRelationsBacteriaExample example = new  DmsDiseaseRelationsBacteriaExample();
        return dmsDiseaseRelationsBacteriaMapper.updateByExample(dmsDiseaseRelationsBacteria,example);
    }

    @Override
    public int deleteDiseaseRelationsById(DmsDiseaseRelationsBacteria dmsDiseaseRelationsBacteria) {
        return dmsDiseaseRelationsBacteriaMapper.deleteByPrimaryKey(dmsDiseaseRelationsBacteria.getBacteriaId(),dmsDiseaseRelationsBacteria.getDiseaseId());
    }

    @Override
    public int createComplication(DmsDiseaseComplication dmsDiseaseComplication) {
        return dmsDiseaseComplicationMapper.insert(dmsDiseaseComplication);
    }

    @Override
    public List<DmsDiseaseComplicationDto> listAllComplications(String keyword, Integer pageSize, Integer pageNum) {
//        PageHelper.startPage(pageNum, pageSize);
//        DmsDiseaseComplicationExample example = new DmsDiseaseComplicationExample();
//        DmsDiseaseComplicationExample.Criteria criteria = example.createCriteria();
//        if (!StringUtils.isEmpty(keyword)) {
//            criteria.andComplicationNameLike("%" + keyword + "%");
//            example.or(example.createCriteria().andComplicationNameZhLike("%" + keyword + "%"));
//        }
//        return dmsDiseaseComplicationMapper.selectByExample(example);
        PageHelper.startPage(pageNum, pageSize);
        if (!StringUtils.isEmpty(keyword)) {
            return dmsDiseaseComplicationDao.findAllByKeyword(keyword);
        }
        return dmsDiseaseComplicationDao.findAll();
    }

    @Override
    public int updateComplication(DmsDiseaseComplication dmsDiseaseComplication) {
        return dmsDiseaseComplicationMapper.updateByPrimaryKey(dmsDiseaseComplication);
    }

    @Override
    public int deleteComplicationById(int dmsDiseaseComplicationId) {
        return dmsDiseaseComplicationMapper.deleteByPrimaryKey(dmsDiseaseComplicationId);
    }

    @Override
    public List<DmsComplicationType> listAllComplicationTypes() {
        DmsComplicationTypeExample example = new DmsComplicationTypeExample();
        return dmsComplicationTypeMapper.selectByExample(example);
    }
}