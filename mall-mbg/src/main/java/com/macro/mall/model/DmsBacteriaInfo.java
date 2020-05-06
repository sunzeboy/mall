package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaInfo implements Serializable {
    private Integer id;

    private Integer parentId;

    private Integer bacteriaType;

    private String bacteriaName;

    private String bacteriaNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getBacteriaType() {
        return bacteriaType;
    }

    public void setBacteriaType(Integer bacteriaType) {
        this.bacteriaType = bacteriaType;
    }

    public String getBacteriaName() {
        return bacteriaName;
    }

    public void setBacteriaName(String bacteriaName) {
        this.bacteriaName = bacteriaName;
    }

    public String getBacteriaNameZh() {
        return bacteriaNameZh;
    }

    public void setBacteriaNameZh(String bacteriaNameZh) {
        this.bacteriaNameZh = bacteriaNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", bacteriaType=").append(bacteriaType);
        sb.append(", bacteriaName=").append(bacteriaName);
        sb.append(", bacteriaNameZh=").append(bacteriaNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}