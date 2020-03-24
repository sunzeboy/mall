package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsExperimentalResource implements Serializable {
    @ApiModelProperty(value = "测试员对象ID")
    private Integer id;

    @ApiModelProperty(value = "测试源类型，测试对象，1：人；2；老鼠")
    private Integer resourceType;

    @ApiModelProperty(value = "测试员编号")
    private String resourceNo;

    @ApiModelProperty(value = "年龄")
    private Float age;

    @ApiModelProperty(value = "性别：0未知，1男，2:女")
    private Integer sex;

    @ApiModelProperty(value = "是否有疾病，0，无疾病，1有疾病")
    private Integer isDisease;

    @ApiModelProperty(value = "疾病Json库")
    private String diseaseJson;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceNo() {
        return resourceNo;
    }

    public void setResourceNo(String resourceNo) {
        this.resourceNo = resourceNo;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIsDisease() {
        return isDisease;
    }

    public void setIsDisease(Integer isDisease) {
        this.isDisease = isDisease;
    }

    public String getDiseaseJson() {
        return diseaseJson;
    }

    public void setDiseaseJson(String diseaseJson) {
        this.diseaseJson = diseaseJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", resourceNo=").append(resourceNo);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", isDisease=").append(isDisease);
        sb.append(", diseaseJson=").append(diseaseJson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}