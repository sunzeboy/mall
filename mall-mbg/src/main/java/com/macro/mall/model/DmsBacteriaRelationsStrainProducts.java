package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaRelationsStrainProducts implements Serializable {
    private Integer bacteriaId;

    private Integer productsId;

    private static final long serialVersionUID = 1L;

    public Integer getBacteriaId() {
        return bacteriaId;
    }

    public void setBacteriaId(Integer bacteriaId) {
        this.bacteriaId = bacteriaId;
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
        sb.append(", bacteriaId=").append(bacteriaId);
        sb.append(", productsId=").append(productsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}