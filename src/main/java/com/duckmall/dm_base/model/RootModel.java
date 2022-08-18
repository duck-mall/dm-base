package com.duckmall.dm_base.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author frank
 * @date 2022/8/18 23:44
 * @Description
 */
public class RootModel<ID> {

    private ID id;
    private Date createdAt;
    private Date updatedAt;
    private Map<String, Object> extendMap = new HashMap<>();


    @JsonAnySetter
    private void set__ExtendMap(String key, String value) {
        this.extendMap.put(key, value);
    }

    @JsonAnyGetter
    private Map<String, Object> get__ExtendMap(){
        return extendMap;
    }


    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Map<String, Object> getExtendMap() {
        return extendMap;
    }

    public void setExtendMap(Map<String, Object> extendMap) {
        this.extendMap = extendMap;
    }
}
