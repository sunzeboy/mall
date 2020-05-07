package com.macro.mall.dto;

import com.macro.mall.model.DmsDiseaseComplication;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : sunze
 * create at:  2020/5/7  9:23 下午
 * @description:
 */
@Getter
@Setter
public class DmsDiseaseComplicationDto extends DmsDiseaseComplication {
    private String complicationDesc;

}