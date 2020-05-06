package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaRelationsProducts implements Serializable {
    private Integer productsId;

    private Integer bacteriaId;

    private static final long serialVersionUID = 1L;

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public Integer getBacteriaId() {
        return bacteriaId;
    }

    public void setBacteriaId(Integer bacteriaId) {
        this.bacteriaId = bacteriaId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productsId=").append(productsId);
        sb.append(", bacteriaId=").append(bacteriaId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}