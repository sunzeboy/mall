package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsDiseaseRelationsBacteria implements Serializable {
    private Integer bacteriaId;

    private Integer diseaseId;

    private static final long serialVersionUID = 1L;

    public Integer getBacteriaId() {
        return bacteriaId;
    }

    public void setBacteriaId(Integer bacteriaId) {
        this.bacteriaId = bacteriaId;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bacteriaId=").append(bacteriaId);
        sb.append(", diseaseId=").append(diseaseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}