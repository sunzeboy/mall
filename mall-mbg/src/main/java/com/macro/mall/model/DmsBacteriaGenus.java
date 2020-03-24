package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaGenus implements Serializable {
    @ApiModelProperty(value = "属ID")
    private Integer id;

    @ApiModelProperty(value = "科ID")
    private Integer keId;

    @ApiModelProperty(value = "属名称")
    private String genusName;

    @ApiModelProperty(value = "属名称-中文名")
    private String genusNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKeId() {
        return keId;
    }

    public void setKeId(Integer keId) {
        this.keId = keId;
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
    }

    public String getGenusNameZh() {
        return genusNameZh;
    }

    public void setGenusNameZh(String genusNameZh) {
        this.genusNameZh = genusNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", keId=").append(keId);
        sb.append(", genusName=").append(genusName);
        sb.append(", genusNameZh=").append(genusNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}