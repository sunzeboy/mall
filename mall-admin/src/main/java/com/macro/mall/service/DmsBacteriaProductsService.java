package com.macro.mall.service;

import com.macro.mall.dto.DmsProductsRelationsItem;
import com.macro.mall.model.DmsBacteriaProducts;
import com.macro.mall.model.DmsBacteriaProductsRelation;
import com.macro.mall.model.DmsBacteriaRelationsStrainProducts;

import java.util.List;

public interface DmsBacteriaProductsService {
    int createProducts(DmsBacteriaProducts bacteriaProducts);
    List<DmsBacteriaProducts> listAllProducts(String keyword, Integer pageSize, Integer pageNum);
    int updateProduct(DmsBacteriaProducts bacteriaProducts);
    int deleteProductById(int bacteriaProductsId);

    int createRelationsStrainAndProducts(DmsBacteriaRelationsStrainProducts dmsBacteriaRelationsStrainProducts);
    List<DmsProductsRelationsItem> listAllRelationsStrainAndProducts(String keyword, Integer pageSize, Integer pageNum);
    int updateRelationsStrainAndProducts(DmsBacteriaRelationsStrainProducts dmsBacteriaRelationsStrainProducts);
    int deleteRelationsStrainAndProducts(DmsBacteriaRelationsStrainProducts dmsBacteriaRelationsStrainProducts);
}
