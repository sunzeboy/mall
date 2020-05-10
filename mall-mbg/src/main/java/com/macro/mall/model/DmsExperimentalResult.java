package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DmsExperimentalResult implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "菌群ID")
    private Integer bacteriaId;

    @ApiModelProperty(value = "含量（mg/m）,每克含有多少毫克")
    private Float contentWeight;

    @ApiModelProperty(value = "每克含有多少个")
    private Integer quantity;

    @ApiModelProperty(value = "测试者ID")
    private Integer resourceId;

    @ApiModelProperty(value = "测试时间")
    private Date testTime;

    @ApiModelProperty(value = "疾病ID")
    private Integer diseaseId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBacteriaId() {
        return bacteriaId;
    }

    public void setBacteriaId(Integer bacteriaId) {
        this.bacteriaId = bacteriaId;
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

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bacteriaId=").append(bacteriaId);
        sb.append(", contentWeight=").append(contentWeight);
        sb.append(", quantity=").append(quantity);
        sb.append(", resourceId=").append(resourceId);
        sb.append(", testTime=").append(testTime);
        sb.append(", diseaseId=").append(diseaseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}