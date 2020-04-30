package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author : sunze
 * create at:  2020/4/30  2:44 下午
 * @description:
 */
public class DmsDiseaseRelationsItem {
    private int strain_id;
    private int disease_id;
    @ApiModelProperty("公司内部菌株编号")
    private String strain_international_no;
    @ApiModelProperty("代谢产物名称中文")
    private String disease_name_zh;
}