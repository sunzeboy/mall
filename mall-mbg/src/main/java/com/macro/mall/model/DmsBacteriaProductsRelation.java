package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaProductsRelation implements Serializable {
    @ApiModelProperty(value = "菌群ID")
    private Integer id;

    @ApiModelProperty(value = "研究类型：1:phylum(门)；2：class（纲）；3：Genus（属）；4：Species（种）；5：Strain（菌株）")
    private Integer researchType;

    @ApiModelProperty(value = "代谢产物 代谢产物（伴生菌群的物质）名称")
    private String productsId;

    @ApiModelProperty(value = "有效伴生物：判定微生物种类的有效物质")
    private String affectProductsId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResearchType() {
        return researchType;
    }

    public void setResearchType(Integer researchType) {
        this.researchType = researchType;
    }

    public String getProductsId() {
        return productsId;
    }

    public void setProductsId(String productsId) {
        this.productsId = productsId;
    }

    public String getAffectProductsId() {
        return affectProductsId;
    }

    public void setAffectProductsId(String affectProductsId) {
        this.affectProductsId = affectProductsId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", researchType=").append(researchType);
        sb.append(", productsId=").append(productsId);
        sb.append(", affectProductsId=").append(affectProductsId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}