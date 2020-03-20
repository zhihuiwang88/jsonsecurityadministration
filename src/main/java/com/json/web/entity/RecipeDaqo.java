package com.json.web.entity;

import java.sql.Timestamp;

public class RecipeDaqo {
    /**
     * 
     */
    protected Integer greensId;

    /**
     * 
     */
    protected String title;

    /**
     * 
     */
    protected String tags;

    /**
     * 
     */
    protected String imtro;

    /**
     * 
     */
    protected String ingredients;

    /**
     * 
     */
    protected String burden;

    /**
     * 
     */
    protected String albums;

    /**
     * 
     */
    protected Timestamp createTime;

    /**
     * 
     */
    protected Timestamp updateTime;

    /**
     * recipe_daqo.greens_id
     */
    public Integer getGreensId() {
        return greensId;
    }

    /**
     * recipe_daqo.greens_id
     */
    public void setGreensId(Integer greensId) {
        this.greensId = greensId;
    }

    /**
     * recipe_daqo.title
     */
    public String getTitle() {
        return title;
    }

    /**
     * recipe_daqo.title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * recipe_daqo.tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * recipe_daqo.tags
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * recipe_daqo.imtro
     */
    public String getImtro() {
        return imtro;
    }

    /**
     * recipe_daqo.imtro
     */
    public void setImtro(String imtro) {
        this.imtro = imtro == null ? null : imtro.trim();
    }

    /**
     * recipe_daqo.ingredients
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * recipe_daqo.ingredients
     */
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients == null ? null : ingredients.trim();
    }

    /**
     * recipe_daqo.burden
     */
    public String getBurden() {
        return burden;
    }

    /**
     * recipe_daqo.burden
     */
    public void setBurden(String burden) {
        this.burden = burden == null ? null : burden.trim();
    }

    /**
     * recipe_daqo.albums
     */
    public String getAlbums() {
        return albums;
    }

    /**
     * recipe_daqo.albums
     */
    public void setAlbums(String albums) {
        this.albums = albums == null ? null : albums.trim();
    }

    /**
     * recipe_daqo.create_time
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * recipe_daqo.create_time
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * recipe_daqo.update_time
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * recipe_daqo.update_time
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}