package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : sunze
 * create at:  2020/4/23  9:30 下午
 * @description:
 */
@Getter
@Setter
public class DmsProductsRelationsItem {
    private int bacteriaId;
    private int productsId;
    private String bacteriaNameZh;
    private String productsNameZh;
}