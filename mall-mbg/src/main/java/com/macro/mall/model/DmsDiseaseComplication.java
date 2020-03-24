package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsDiseaseComplication implements Serializable {
    @ApiModelProperty(value = "并发症ID")
    private Integer id;

    @ApiModelProperty(value = "并发症类型")
    private Integer complicationType;

    @ApiModelProperty(value = "并发症名称")
    private String complicationName;

    @ApiModelProperty(value = "并发症中文名")
    private String complicationNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComplicationType() {
        return complicationType;
    }

    public void setComplicationType(Integer complicationType) {
        this.complicationType = complicationType;
    }

    public String getComplicationName() {
        return complicationName;
    }

    public void setComplicationName(String complicationName) {
        this.complicationName = complicationName;
    }

    public String getComplicationNameZh() {
        return complicationNameZh;
    }

    public void setComplicationNameZh(String complicationNameZh) {
        this.complicationNameZh = complicationNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", complicationType=").append(complicationType);
        sb.append(", complicationName=").append(complicationName);
        sb.append(", complicationNameZh=").append(complicationNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}