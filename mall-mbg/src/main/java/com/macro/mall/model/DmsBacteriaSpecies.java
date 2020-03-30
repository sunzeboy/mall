package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaSpecies implements Serializable {
    @ApiModelProperty(value = "种ID")
    private Integer id;

    @ApiModelProperty(value = "属ID")
    private Integer genusId;

    @ApiModelProperty(value = "种名称")
    private String speciesName;

    @ApiModelProperty(value = "种名称-中文名")
    private String speciesNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGenusId() {
        return genusId;
    }

    public void setGenusId(Integer genusId) {
        this.genusId = genusId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesNameZh() {
        return speciesNameZh;
    }

    public void setSpeciesNameZh(String speciesNameZh) {
        this.speciesNameZh = speciesNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", genusId=").append(genusId);
        sb.append(", speciesName=").append(speciesName);
        sb.append(", speciesNameZh=").append(speciesNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}