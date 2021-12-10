package com.springboot.rest.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserWarehouse {
    @Id
    @Column
    private String userId;

    @Column
    private String userName;

    public UserWarehouse() {

    }

    public UserWarehouse(String userId, String userName) {
        super();
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
