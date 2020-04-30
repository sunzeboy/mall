package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaRelationsStrainProducts implements Serializable {
    private Integer strainId;

    private Integer productsId;

    private static final long serialVersionUID = 1L;

    public Integer getStrainId() {
        return strainId;
    }

    public void setStrainId(Integer strainId) {
        this.strainId = strainId;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", strainId=").append(strainId);
        sb.append(", productsId=").append(productsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}