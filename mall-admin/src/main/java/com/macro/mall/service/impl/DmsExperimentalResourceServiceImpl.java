package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.dao.DmsExperimentalResultDao;
import com.macro.mall.dto.DmsExperimentalResultDto;
import com.macro.mall.mapper.DmsExperimentalResourceMapper;
import com.macro.mall.mapper.DmsExperimentalResultMapper;
import com.macro.mall.model.DmsDiseaseInfoExample;
import com.macro.mall.model.DmsExperimentalResource;
import com.macro.mall.model.DmsExperimentalResourceExample;
import com.macro.mall.model.DmsExperimentalResult;
import com.macro.mall.service.DmsExperimentalResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author : sunze
 * create at:  2020/5/8  8:50 下午
 * @description:
 */
@Service
public class DmsExperimentalResourceServiceImpl implements DmsExperimentalResourceService {

    @Autowired
    private DmsExperimentalResourceMapper dmsExperimentalResourceMapper;

    @Autowired
    private DmsExperimentalResultMapper dmsExperimentalResultMapper;

    @Autowired
    private DmsExperimentalResultDao dmsExperimentalResultDao;

    @Override
    public int createExperimentalResource(DmsExperimentalResource dmsExperimentalResource) {
        return dmsExperimentalResourceMapper.insert(dmsExperimentalResource);
    }

    @Override
    public List<DmsExperimentalResource> listAllExperimentalResource(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DmsExperimentalResourceExample example = new DmsExperimentalResourceExample();
        DmsExperimentalResourceExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andResourceNoLike("%" + keyword + "%");
//            example.or(example.createCriteria().andDiseaseNameZhLike("%" + keyword + "%"));
        }
        return dmsExperimentalResourceMapper.selectByExample(example);
    }

    @Override
    public int updateExperimentalResource(DmsExperimentalResource dmsExperimentalResource) {
        return dmsExperimentalResourceMapper.updateByPrimaryKey(dmsExperimentalResource);
    }

    @Override
    public int deleteExperimentalResourceById(int dmsExperimentalResourceId) {
        return dmsExperimentalResourceMapper.deleteByPrimaryKey(dmsExperimentalResourceId);
    }

    @Override
    public int createExperimentalResult(DmsExperimentalResult dmsExperimentalResult) {
        return dmsExperimentalResultMapper.insert(dmsExperimentalResult);
    }

    @Override
    public List<DmsExperimentalResultDto> listAllExperimentalResults(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        if (!StringUtils.isEmpty(keyword)) {
            return dmsExperimentalResultDao.findAllByKeyword(keyword);
        }
        return dmsExperimentalResultDao.findAll();
    }

    @Override
    public int updateExperimentalResult(DmsExperimentalResult dmsExperimentalResult) {
        return dmsExperimentalResultMapper.updateByPrimaryKey(dmsExperimentalResult);
    }

    @Override
    public int deleteExperimentalResultById(int dmsExperimentalResultId) {
        return dmsExperimentalResultMapper.deleteByPrimaryKey(dmsExperimentalResultId);
    }
}