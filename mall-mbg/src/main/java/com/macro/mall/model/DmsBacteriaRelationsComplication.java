package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaRelationsComplication implements Serializable {
    private Integer bacteriaId;

    private Integer complicationId;

    private static final long serialVersionUID = 1L;

    public Integer getBacteriaId() {
        return bacteriaId;
    }

    public void setBacteriaId(Integer bacteriaId) {
        this.bacteriaId = bacteriaId;
    }

    public Integer getComplicationId() {
        return complicationId;
    }

    public void setComplicationId(Integer complicationId) {
        this.complicationId = complicationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bacteriaId=").append(bacteriaId);
        sb.append(", complicationId=").append(complicationId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}