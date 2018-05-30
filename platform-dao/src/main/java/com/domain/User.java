package com.domain;

import java.io.Serializable;

/**
 * Created by forenms-12 on 2018/5/30.
 */
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3675140578452327169L;

    private Long id;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 登录名
     */
    private String loginName;
    /**
     * 0.男 1.女
     */
    private Integer sex;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
