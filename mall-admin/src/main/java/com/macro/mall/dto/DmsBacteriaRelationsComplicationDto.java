package com.macro.mall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : sunze
 * create at:  2020/5/7  9:47 下午
 * @description:
 */
@Getter
@Setter
public class DmsBacteriaRelationsComplicationDto {
    private int bacteriaId;
    private int complicationId;
    private String bacteriaNameZh;
    private String complicationNameZh;
}