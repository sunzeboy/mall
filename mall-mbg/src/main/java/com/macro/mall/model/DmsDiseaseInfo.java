package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsDiseaseInfo implements Serializable {
    @ApiModelProperty(value = "疾病ID")
    private Integer id;

    @ApiModelProperty(value = "疾病类型：1：肝脏；2：肥胖；3：消化；4：代谢；5：免疫")
    private Integer diseaseType;

    @ApiModelProperty(value = "疾病名称")
    private String diseaseName;

    @ApiModelProperty(value = "疾病名称中文")
    private String diseaseNameZh;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiseaseType() {
        return diseaseType;
    }

    public void setDiseaseType(Integer diseaseType) {
        this.diseaseType = diseaseType;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseNameZh() {
        return diseaseNameZh;
    }

    public void setDiseaseNameZh(String diseaseNameZh) {
        this.diseaseNameZh = diseaseNameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", diseaseType=").append(diseaseType);
        sb.append(", diseaseName=").append(diseaseName);
        sb.append(", diseaseNameZh=").append(diseaseNameZh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}