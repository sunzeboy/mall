package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DmsExperimentalResult implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "菌群ID")
    private Integer probioticsId;

    @ApiModelProperty(value = "1.phylum(门);2.class(纲);3.Genus(属);4.Species(种);5.Strain(菌株)")
    private Integer probioticsType;

    @ApiModelProperty(value = "含量（mg/m）,每克含有多少毫克")
    private Float contentWeight;

    @ApiModelProperty(value = "每克含有多少个")
    private Integer quantity;

    @ApiModelProperty(value = "测试者ID")
    private Integer resourceId;

    @ApiModelProperty(value = "测试时间")
    private Date testTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProbioticsId() {
        return probioticsId;
    }

    public void setProbioticsId(Integer probioticsId) {
        this.probioticsId = probioticsId;
    }

    public Integer getProbioticsType() {
        return probioticsType;
    }

    public void setProbioticsType(Integer probioticsType) {
        this.probioticsType = probioticsType;
    }

    public Float getContentWeight() {
        return contentWeight;
    }

    public void setContentWeight(Float contentWeight) {
        this.contentWeight = contentWeight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", probioticsId=").append(probioticsId);
        sb.append(", probioticsType=").append(probioticsType);
        sb.append(", contentWeight=").append(contentWeight);
        sb.append(", quantity=").append(quantity);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", testTime=").append(testTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}