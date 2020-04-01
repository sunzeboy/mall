package com.macro.mall.service;

import com.macro.mall.model.DmsBacteriaProducts;

import java.util.List;

public interface DmsBacteriaProductsService {
    int createProducts(DmsBacteriaProducts bacteriaProducts);
    List<DmsBacteriaProducts> listAllProducts(String keyword, Integer pageSize, Integer pageNum);
    int updateProduct(DmsBacteriaProducts bacteriaProducts);
    int deleteProductById(int bacteriaProductsId);
}
