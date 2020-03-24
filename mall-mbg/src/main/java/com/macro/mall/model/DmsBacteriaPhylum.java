package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaPhylum implements Serializable {
    @ApiModelProperty(value = "门ID")
    private Integer id;

    @ApiModelProperty(value = "门名称")
    private String phylumName;

    @ApiModelProperty(value = "门名称中文")
    private String phylumNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhylumName() {
        return phylumName;
    }

    public void setPhylumName(String phylumName) {
        this.phylumName = phylumName;
    }

    public String getPhylumNameZh() {
        return phylumNameZh;
    }

    public void setPhylumNameZh(String phylumNameZh) {
        this.phylumNameZh = phylumNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phylumName=").append(phylumName);
        sb.append(", phylumNameZh=").append(phylumNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}