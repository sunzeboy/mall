package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaKe implements Serializable {
    @ApiModelProperty(value = "科ID")
    private Integer id;

    @ApiModelProperty(value = "目ID")
    private Integer muId;

    @ApiModelProperty(value = "科名称")
    private String keName;

    @ApiModelProperty(value = "科名称中文")
    private String keNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMuId() {
        return muId;
    }

    public void setMuId(Integer muId) {
        this.muId = muId;
    }

    public String getKeName() {
        return keName;
    }

    public void setKeName(String keName) {
        this.keName = keName;
    }

    public String getKeNameZh() {
        return keNameZh;
    }

    public void setKeNameZh(String keNameZh) {
        this.keNameZh = keNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", muId=").append(muId);
        sb.append(", keName=").append(keName);
        sb.append(", keNameZh=").append(keNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}