package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaStrain implements Serializable {
    @ApiModelProperty(value = "菌株ID")
    private Integer id;

    @ApiModelProperty(value = "种ID")
    private Integer speciesId;

    @ApiModelProperty(value = "菌株名称：每个种下面的细分， 可以在国际上找到唯一识别号")
    private String strainInternationalNo;

    @ApiModelProperty(value = "公司内部菌株编号")
    private String strainInsideNo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Integer speciesId) {
        this.speciesId = speciesId;
    }

    public String getStrainInternationalNo() {
        return strainInternationalNo;
    }

    public void setStrainInternationalNo(String strainInternationalNo) {
        this.strainInternationalNo = strainInternationalNo;
    }

    public String getStrainInsideNo() {
        return strainInsideNo;
    }

    public void setStrainInsideNo(String strainInsideNo) {
        this.strainInsideNo = strainInsideNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", speciesId=").append(speciesId);
        sb.append(", strainInternationalNo=").append(strainInternationalNo);
        sb.append(", strainInsideNo=").append(strainInsideNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}