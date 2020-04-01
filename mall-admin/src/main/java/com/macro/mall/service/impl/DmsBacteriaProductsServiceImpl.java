package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.DmsBacteriaProductsMapper;
import com.macro.mall.mapper.DmsBacteriaStrainMapper;
import com.macro.mall.model.DmsBacteriaKeExample;
import com.macro.mall.model.DmsBacteriaProducts;
import com.macro.mall.model.DmsBacteriaProductsExample;
import com.macro.mall.service.DmsBacteriaProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author : sunze
 * create at:  2020/3/31  4:40 下午
 * @description: 代谢产物
 */
@Service
public class DmsBacteriaProductsServiceImpl implements DmsBacteriaProductsService {

    @Autowired
    private DmsBacteriaProductsMapper dmsBacteriaProductsMapper;

    @Override
    public int createProducts(DmsBacteriaProducts bacteriaProducts) {
        return dmsBacteriaProductsMapper.insert(bacteriaProducts);
    }

    @Override
    public List<DmsBacteriaProducts> listAllProducts(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DmsBacteriaProductsExample example = new DmsBacteriaProductsExample();
        DmsBacteriaProductsExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andProductsNameLike("%" + keyword + "%");
            example.or(example.createCriteria().andProductsNameZhLike("%" + keyword + "%"));
        }
        return dmsBacteriaProductsMapper.selectByExample(example);
    }

    @Override
    public int updateProduct(DmsBacteriaProducts bacteriaProducts) {
        return dmsBacteriaProductsMapper.updateByPrimaryKey(bacteriaProducts);
    }

    @Override
    public int deleteProductById(int bacteriaProductsId) {
        return dmsBacteriaProductsMapper.deleteByPrimaryKey(bacteriaProductsId);
    }
}