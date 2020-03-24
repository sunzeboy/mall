package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DmsDiseaseResult implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "菌群ID")
    private Integer probioticsId;

    @ApiModelProperty(value = "1.phylum(门);2.class(纲);3.Genus(属);4.Species(种);5.Strain(菌株)")
    private Integer probioticsType;

    @ApiModelProperty(value = "测试对象，1：人；2；老鼠")
    private Integer resourceType;

    @ApiModelProperty(value = "含量（mg/m）,每克含有多少毫克")
    private Float contentWeight;

    @ApiModelProperty(value = "每克含有多少个")
    private Integer quantity;

    @ApiModelProperty(value = "疾病库")
    private String diseaseIdJson;

    @ApiModelProperty(value = "并发疾病库")
    private String complicationIdJson;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "最后更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "创建人")
    private String createName;

    @ApiModelProperty(value = "引入文件集")
    private String literatureIdJson;

    @ApiModelProperty(value = "备注")
    private String remarks;

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

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
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

    public String getDiseaseIdJson() {
        return diseaseIdJson;
    }

    public void setDiseaseIdJson(String diseaseIdJson) {
        this.diseaseIdJson = diseaseIdJson;
    }

    public String getComplicationIdJson() {
        return complicationIdJson;
    }

    public void setComplicationIdJson(String complicationIdJson) {
        this.complicationIdJson = complicationIdJson;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getLiteratureIdJson() {
        return literatureIdJson;
    }

    public void setLiteratureIdJson(String literatureIdJson) {
        this.literatureIdJson = literatureIdJson;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        sb.append(", resourceType=").append(resourceType);
        sb.append(", contentWeight=").append(contentWeight);
        sb.append(", quantity=").append(quantity);
        sb.append(", diseaseIdJson=").append(diseaseIdJson);
        sb.append(", complicationIdJson=").append(complicationIdJson);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createName=").append(createName);
        sb.append(", literatureIdJson=").append(literatureIdJson);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}