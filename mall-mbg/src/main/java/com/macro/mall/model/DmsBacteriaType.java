package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaType implements Serializable {
    private Integer bacteriaType;

    private String bacteriaTypeName;

    private String bacteriaTypeNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getBacteriaType() {
        return bacteriaType;
    }

    public void setBacteriaType(Integer bacteriaType) {
        this.bacteriaType = bacteriaType;
    }

    public String getBacteriaTypeName() {
        return bacteriaTypeName;
    }

    public void setBacteriaTypeName(String bacteriaTypeName) {
        this.bacteriaTypeName = bacteriaTypeName;
    }

    public String getBacteriaTypeNameZh() {
        return bacteriaTypeNameZh;
    }

    public void setBacteriaTypeNameZh(String bacteriaTypeNameZh) {
        this.bacteriaTypeNameZh = bacteriaTypeNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bacteriaType=").append(bacteriaType);
        sb.append(", bacteriaTypeName=").append(bacteriaTypeName);
        sb.append(", bacteriaTypeNameZh=").append(bacteriaTypeNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}