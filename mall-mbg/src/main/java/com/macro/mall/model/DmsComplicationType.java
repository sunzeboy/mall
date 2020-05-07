package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsComplicationType implements Serializable {
    private Integer complicationType;

    private String complicationDesc;

    private static final long serialVersionUID = 1L;

    public Integer getComplicationType() {
        return complicationType;
    }

    public void setComplicationType(Integer complicationType) {
        this.complicationType = complicationType;
    }

    public String getComplicationDesc() {
        return complicationDesc;
    }

    public void setComplicationDesc(String complicationDesc) {
        this.complicationDesc = complicationDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", complicationType=").append(complicationType);
        sb.append(", complicationDesc=").append(complicationDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}