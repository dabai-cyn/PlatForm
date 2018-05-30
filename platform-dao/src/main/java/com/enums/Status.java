package com.enums;


import com.aframework.common.StringUtils;

/**
 * Created by forenms-12 on 2018/5/30.
 */
public enum Status {

    USE(1, "可用"),
    USEING(2, "使用中"),
    UNUSE(4, "禁用");
    // 成员变量
    private Integer index;
    private String name;

    // 构造方法


    Status(Integer index, String name) {
        this.index = index;
        this.name = name;
    }


    public Integer getIndex() {
        return index;
    }

    public Integer getIndex(String name) {
        for (Status sexEnum : Status.values()) {
            if ( StringUtils.equals(sexEnum.getName(),name) ) {
                return sexEnum.getIndex();
            }
        }
        return null;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public String getIndex(Integer index) {
        for (Status sexEnum : Status.values()) {
            if ( sexEnum.getIndex() == index ) {
                return sexEnum.getName();
            }
        }
        return "";
    }

    public void setName(String name) {
        this.name = name;
    }
}