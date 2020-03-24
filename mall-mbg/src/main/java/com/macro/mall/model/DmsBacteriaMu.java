package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaMu implements Serializable {
    @ApiModelProperty(value = "目ID")
    private Integer id;

    @ApiModelProperty(value = "纲ID")
    private Integer classId;

    @ApiModelProperty(value = "目名称")
    private String muName;

    @ApiModelProperty(value = "目名称中文")
    private String muNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getMuName() {
        return muName;
    }

    public void setMuName(String muName) {
        this.muName = muName;
    }

    public String getMuNameZh() {
        return muNameZh;
    }

    public void setMuNameZh(String muNameZh) {
        this.muNameZh = muNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", classId=").append(classId);
        sb.append(", muName=").append(muName);
        sb.append(", muNameZh=").append(muNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}