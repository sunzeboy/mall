package com.macro.mall.dto;

import com.macro.mall.model.DmsExperimentalResult;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : sunze
 * create at:  2020/5/10  11:30 上午
 * @description:
 */
@Getter
@Setter
public class DmsExperimentalResultDto extends DmsExperimentalResult {
    private String bacteriaNameZh;
    private String diseaseNameZh;
    private String resourceNo;
}