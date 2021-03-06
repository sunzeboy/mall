package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : sunze
 * create at:  2020/4/30  2:44 下午
 * @description:
 */
@Getter
@Setter
public class DmsDiseaseRelationsItem {
    private int bacteriaId;
    private int diseaseId;
    private String bacteriaNameZh;
    private String diseaseNameZh;
}