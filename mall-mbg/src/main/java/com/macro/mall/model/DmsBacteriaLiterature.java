package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DmsBacteriaLiterature implements Serializable {
    @ApiModelProperty(value = "ID")
    private Integer id;

    @ApiModelProperty(value = "文献类型")
    private Integer literatureType;

    @ApiModelProperty(value = "文献名称")
    private String literatureName;

    @ApiModelProperty(value = "文献中文名")
    private String literatureNameZh;

    @ApiModelProperty(value = "文献保存路径")
    private String literaturePath;

    @ApiModelProperty(value = "搜索关键词")
    private String searchWords;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLiteratureType() {
        return literatureType;
    }

    public void setLiteratureType(Integer literatureType) {
        this.literatureType = literatureType;
    }

    public String getLiteratureName() {
        return literatureName;
    }

    public void setLiteratureName(String literatureName) {
        this.literatureName = literatureName;
    }

    public String getLiteratureNameZh() {
        return literatureNameZh;
    }

    public void setLiteratureNameZh(String literatureNameZh) {
        this.literatureNameZh = literatureNameZh;
    }

    public String getLiteraturePath() {
        return literaturePath;
    }

    public void setLiteraturePath(String literaturePath) {
        this.literaturePath = literaturePath;
    }

    public String getSearchWords() {
        return searchWords;
    }

    public void setSearchWords(String searchWords) {
        this.searchWords = searchWords;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", literatureType=").append(literatureType);
        sb.append(", literatureName=").append(literatureName);
        sb.append(", literatureNameZh=").append(literatureNameZh);
        sb.append(", literaturePath=").append(literaturePath);
        sb.append(", searchWords=").append(searchWords);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}