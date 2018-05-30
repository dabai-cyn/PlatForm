package com.domain;

import com.enums.Status;

import java.util.Date;

/**
 * Created by forenms-12 on 2018/5/30.
 */
public class BaseEntity {

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public BaseEntity() {
        this.status = Status.USE.getIndex();
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}
