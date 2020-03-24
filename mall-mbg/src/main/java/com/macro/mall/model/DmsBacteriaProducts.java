package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaProducts implements Serializable {
    @ApiModelProperty(value = "代谢产物ID")
    private Integer id;

    @ApiModelProperty(value = "代谢产物名称")
    private String productsName;

    @ApiModelProperty(value = "代谢产物名称中文")
    private String productsNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getProductsNameZh() {
        return productsNameZh;
    }

    public void setProductsNameZh(String productsNameZh) {
        this.productsNameZh = productsNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productsName=").append(productsName);
        sb.append(", productsNameZh=").append(productsNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}