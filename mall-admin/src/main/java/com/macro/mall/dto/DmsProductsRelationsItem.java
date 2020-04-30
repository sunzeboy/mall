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
    private int strain_id;
    private int products_id;
    @ApiModelProperty("公司内部菌株编号")
    private String strain_international_no;
    @ApiModelProperty("代谢产物名称中文")
    private String products_name_zh;
}