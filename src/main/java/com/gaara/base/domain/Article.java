package com.gaara.base.domain;

import java.io.Serializable;

/**
 * 
 * @TableName article
 */
public class Article implements Serializable {
    /**
     * 
     */
    private Object id;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String article;

    /**
     * 缩略
     */
    private String abbreviation;

    /**
     * 类别
     */
    private String type;

    /**
     * 点击量
     */
    private Integer hit;

    /**
     * 热度
     */
    private String hot;

    /**
     * 置顶
     */
    private String top;

    /**
     * 原始文档
     */
    private String articleall;

    /**
     * 
     */
    private Integer apid;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Object getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     */
    public String getArticle() {
        return article;
    }

    /**
     * 
     */
    public void setArticle(String article) {
        this.article = article;
    }

    /**
     * 缩略
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * 缩略
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * 类别
     */
    public String getType() {
        return type;
    }

    /**
     * 类别
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 点击量
     */
    public Integer getHit() {
        return hit;
    }

    /**
     * 点击量
     */
    public void setHit(Integer hit) {
        this.hit = hit;
    }

    /**
     * 热度
     */
    public String getHot() {
        return hot;
    }

    /**
     * 热度
     */
    public void setHot(String hot) {
        this.hot = hot;
    }

    /**
     * 置顶
     */
    public String getTop() {
        return top;
    }

    /**
     * 置顶
     */
    public void setTop(String top) {
        this.top = top;
    }

    /**
     * 原始文档
     */
    public String getArticleall() {
        return articleall;
    }

    /**
     * 原始文档
     */
    public void setArticleall(String articleall) {
        this.articleall = articleall;
    }

    /**
     * 
     */
    public Integer getApid() {
        return apid;
    }

    /**
     * 
     */
    public void setApid(Integer apid) {
        this.apid = apid;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getArticle() == null ? other.getArticle() == null : this.getArticle().equals(other.getArticle()))
            && (this.getAbbreviation() == null ? other.getAbbreviation() == null : this.getAbbreviation().equals(other.getAbbreviation()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getHit() == null ? other.getHit() == null : this.getHit().equals(other.getHit()))
            && (this.getHot() == null ? other.getHot() == null : this.getHot().equals(other.getHot()))
            && (this.getTop() == null ? other.getTop() == null : this.getTop().equals(other.getTop()))
            && (this.getArticleall() == null ? other.getArticleall() == null : this.getArticleall().equals(other.getArticleall()))
            && (this.getApid() == null ? other.getApid() == null : this.getApid().equals(other.getApid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getArticle() == null) ? 0 : getArticle().hashCode());
        result = prime * result + ((getAbbreviation() == null) ? 0 : getAbbreviation().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getHit() == null) ? 0 : getHit().hashCode());
        result = prime * result + ((getHot() == null) ? 0 : getHot().hashCode());
        result = prime * result + ((getTop() == null) ? 0 : getTop().hashCode());
        result = prime * result + ((getArticleall() == null) ? 0 : getArticleall().hashCode());
        result = prime * result + ((getApid() == null) ? 0 : getApid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", article=").append(article);
        sb.append(", abbreviation=").append(abbreviation);
        sb.append(", type=").append(type);
        sb.append(", hit=").append(hit);
        sb.append(", hot=").append(hot);
        sb.append(", top=").append(top);
        sb.append(", articleall=").append(articleall);
        sb.append(", apid=").append(apid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}