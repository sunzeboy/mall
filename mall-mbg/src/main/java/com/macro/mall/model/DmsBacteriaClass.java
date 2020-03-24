package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaClass implements Serializable {
    @ApiModelProperty(value = "纲ID")
    private Integer id;

    @ApiModelProperty(value = "门ID")
    private Integer phylumId;

    @ApiModelProperty(value = "纲名称")
    private String className;

    @ApiModelProperty(value = "纲名称中文")
    private String classNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhylumId() {
        return phylumId;
    }

    public void setPhylumId(Integer phylumId) {
        this.phylumId = phylumId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNameZh() {
        return classNameZh;
    }

    public void setClassNameZh(String classNameZh) {
        this.classNameZh = classNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phylumId=").append(phylumId);
        sb.append(", className=").append(className);
        sb.append(", classNameZh=").append(classNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}